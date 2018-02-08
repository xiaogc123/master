package com.xay.api.dao.model;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "upms_user_role")
public class UpmsUserRole implements Serializable {
    /**
     * 编号
     */
    @Id
    @Column(name = "user_role_id")
    private Long userRoleId;

    /**
     * 用户编号
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 角色编号
     */
    @Column(name = "role_id")
    private Long roleId;

    private static final long serialVersionUID = 1L;

    /**
     * 获取编号
     *
     * @return user_role_id - 编号
     */
    public Long getUserRoleId() {
        return userRoleId;
    }

    /**
     * 设置编号
     *
     * @param userRoleId 编号
     */
    public void setUserRoleId(Long userRoleId) {
        this.userRoleId = userRoleId;
    }

    /**
     * 获取用户编号
     *
     * @return user_id - 用户编号
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户编号
     *
     * @param userId 用户编号
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取角色编号
     *
     * @return role_id - 角色编号
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 设置角色编号
     *
     * @param roleId 角色编号
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}