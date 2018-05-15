package com.songguoliang.springboot.entity;

import javax.persistence.Table;
import java.io.Serializable;

/**
 * @Description
 * @Author sgl
 * @Date 2018-05-11 14:39
 */
@Table(name = "tbl_role_resource")
public class RoleResource implements Serializable {
    private static final long serialVersionUID = 5023589411264994957L;
    /**
     * 角色id
     */
    private Long roleId;

    /**
     * 资源id
     */
    private Long resourceId;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }
}
