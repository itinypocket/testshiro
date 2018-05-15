package com.songguoliang.springboot.base;

import com.songguoliang.springboot.entity.Resource;
import com.songguoliang.springboot.entity.Role;
import com.songguoliang.springboot.entity.User;
import com.songguoliang.springboot.model.ShiroUser;
import com.songguoliang.springboot.service.ResourceService;
import com.songguoliang.springboot.service.RoleService;
import com.songguoliang.springboot.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Description
 * @Author sgl
 * @Date 2018-05-09 15:41
 */
public class UserRealm extends AuthorizingRealm {
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private ResourceService resourceService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        ShiroUser shiroUser = (ShiroUser) principals.getPrimaryPrincipal();

        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        authorizationInfo.setRoles(shiroUser.getRoles());
        authorizationInfo.addStringPermissions(shiroUser.getUrls());
        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = (String) token.getPrincipal();
        User user = userService.getByLoginName(username);
        //账号不存在
        if (user == null) {
            return null;
        }
        //账号未开启
        if (user.getStatus() == 1) {
            return null;
        }

        Set<String> urls = new HashSet<String>();
        Set<String> roles = new HashSet<String>();

        List<Role> roleList = roleService.getRolesByUserId(user.getId());
        for (Role role : roleList) {
            List<Resource> resourceList = resourceService.getByRoleId(role.getId());
            for (Resource resource : resourceList) {
                urls.add(resource.getUrl());
            }

            roles.add(role.getName());
        }

        ShiroUser shiroUser = new ShiroUser(user.getId(), user.getLoginName(), user.getName());
        shiroUser.setRoles(roles);
        shiroUser.setUrls(urls);


        return new SimpleAuthenticationInfo(shiroUser, user.getPassword().toCharArray(), ByteSource.Util.bytes(user.getSalt()), getName());
    }
}
