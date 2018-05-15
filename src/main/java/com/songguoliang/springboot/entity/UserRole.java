package com.songguoliang.springboot.entity;

import javax.persistence.Table;
import java.io.Serializable;

/**
 * @Description
 * @Author sgl
 * @Date 2018-05-11 14:41
 */
@Table(name = "tbl_user_role")
public class UserRole implements Serializable {
    private static final long serialVersionUID = -210465697895926308L;
    /**
     * 用户id
     */
    private Long userId;

    /**
     * 角色id
     */
    private Long roleId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
