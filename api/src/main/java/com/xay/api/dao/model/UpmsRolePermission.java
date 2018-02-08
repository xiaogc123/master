package com.xay.api.dao.model;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "upms_role_permission")
public class UpmsRolePermission implements Serializable {
    /**
     * 编号
     */
    @Id
    @Column(name = "role_permission_id")
    private Long rolePermissionId;

    /**
     * 角色编号
     */
    @Column(name = "role_id")
    private Long roleId;

    /**
     * 权限编号
     */
    @Column(name = "permission_id")
    private Long permissionId;

    private static final long serialVersionUID = 1L;

    /**
     * 获取编号
     *
     * @return role_permission_id - 编号
     */
    public Long getRolePermissionId() {
        return rolePermissionId;
    }

    /**
     * 设置编号
     *
     * @param rolePermissionId 编号
     */
    public void setRolePermissionId(Long rolePermissionId) {
        this.rolePermissionId = rolePermissionId;
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

    /**
     * 获取权限编号
     *
     * @return permission_id - 权限编号
     */
    public Long getPermissionId() {
        return permissionId;
    }

    /**
     * 设置权限编号
     *
     * @param permissionId 权限编号
     */
    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }
}