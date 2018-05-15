package com.songguoliang.springboot.service;

import com.songguoliang.springboot.entity.Role;
import com.songguoliang.springboot.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author sgl
 * @Date 2018-05-11 15:22
 */
@Service
public class RoleService {
    @Autowired
    private RoleMapper roleMapper;

    public List<Role> getRolesByUserId(Long userId) {
        return roleMapper.getRolesByUserId(userId);
    }

}
