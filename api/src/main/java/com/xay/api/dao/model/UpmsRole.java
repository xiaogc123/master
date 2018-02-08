package com.xay.api.dao.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "upms_role")
public class UpmsRole implements Serializable {
    /**
     * 编号
     */
    @Id
    @Column(name = "role_id")
    private Long roleId;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 角色标题
     */
    private String title;

    /**
     * 角色描述
     */
    private String description;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 排序
     */
    private Long orders;

    private Byte locked;

    private static final long serialVersionUID = 1L;

    /**
     * 获取编号
     *
     * @return role_id - 编号
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 设置编号
     *
     * @param roleId 编号
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取角色名称
     *
     * @return name - 角色名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置角色名称
     *
     * @param name 角色名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取角色标题
     *
     * @return title - 角色标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置角色标题
     *
     * @param title 角色标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取角色描述
     *
     * @return description - 角色描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置角色描述
     *
     * @param description 角色描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取排序
     *
     * @return orders - 排序
     */
    public Long getOrders() {
        return orders;
    }

    /**
     * 设置排序
     *
     * @param orders 排序
     */
    public void setOrders(Long orders) {
        this.orders = orders;
    }

    /**
     * @return locked
     */
    public Byte getLocked() {
        return locked;
    }

    /**
     * @param locked
     */
    public void setLocked(Byte locked) {
        this.locked = locked;
    }
}