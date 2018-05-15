package com.songguoliang.springboot.entity;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @Description
 * @Author sgl
 * @Date 2018-05-11 14:38
 */
@Table(name = "tbl_role")
public class Role implements Serializable{
    private static final long serialVersionUID = 133440521105950241L;
    /**
     * 主键id
     */
    @Id
    private Long id;

    /**
     * 角色名
     */
    private String name;

    /**
     * 排序号
     */
    private Integer seq;

    /**
     * 简介
     */
    private String description;

    /**
     * 状态
     */
    private Integer status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
