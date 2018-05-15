package com.songguoliang.springboot.model;

import java.io.Serializable;
import java.util.Set;

/**
 * @Description
 * @Author sgl
 * @Date 2018-05-11 11:16
 */
public class ShiroUser implements Serializable {
    private Long id;
    private String loginName;
    private String name;

    private Set<String> urls;
    private Set<String> roles;

    public ShiroUser(Long id, String loginName, String name) {
        this.id = id;
        this.loginName = loginName;
        this.name = name;
    }

    public ShiroUser(Long id, String loginName, String name, Set<String> urls, Set<String> roles) {
        this(id, loginName, name);
        this.urls = urls;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getUrls() {
        return urls;
    }

    public void setUrls(Set<String> urls) {
        this.urls = urls;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }
}
