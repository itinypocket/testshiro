package com.songguoliang.springboot.entity;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @Description
 * @Author sgl
 * @Date 2018-05-11 15:14
 */
@Table(name = "tbl_resource")
public class Resource implements Serializable {
    private static final long serialVersionUID = -6156051731298108124L;
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 资源名称
     */
    private String name;

    /**
     * 资源路径
     */
    private String url;


    /**
     * 父级资源id
     */
    private Long pid;

    /**
     * 排序
     */
    private Integer seq;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 资源类别
     */
    private Integer resourceType;

    /**
     * 创建时间
     */
    private Date createTime;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getResourceType() {
        return resourceType;
    }

    public void setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
