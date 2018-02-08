package com.xay.api.dao.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "upms_user")
public class UpmsUser implements Serializable {
    /**
     * 编号
     */
    @Id
    @Column(name = "user_id")
    private Long userId;

    /**
     * 帐号
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 密码MD5(密码+盐)
     */
    private String password;

    /**
     * 盐
     */
    private String salt;

    /**
     * 姓名
     */
    @Column(name = "real_name")
    private String realName;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 电话
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 性别
     */
    private Byte sex;

    /**
     * 状态(0:正常,1:锁定)
     */
    private Byte locked;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    private String creater;

    /**
     * 修改时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;

    private String modifier;

    @Column(name = "role_ids")
    private String roleIds;

    @Column(name = "role_name")
    private String roleName;

    private static final long serialVersionUID = 1L;

    /**
     * 获取编号
     *
     * @return user_id - 编号
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置编号
     *
     * @param userId 编号
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取帐号
     *
     * @return user_name - 帐号
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置帐号
     *
     * @param userName 帐号
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取密码MD5(密码+盐)
     *
     * @return password - 密码MD5(密码+盐)
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码MD5(密码+盐)
     *
     * @param password 密码MD5(密码+盐)
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取盐
     *
     * @return salt - 盐
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 设置盐
     *
     * @param salt 盐
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * 获取姓名
     *
     * @return real_name - 姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置姓名
     *
     * @param realName 姓名
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * 获取头像
     *
     * @return avatar - 头像
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设置头像
     *
     * @param avatar 头像
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * 获取电话
     *
     * @return phone - 电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话
     *
     * @param phone 电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取性别
     *
     * @return sex - 性别
     */
    public Byte getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(Byte sex) {
        this.sex = sex;
    }

    /**
     * 获取状态(0:正常,1:锁定)
     *
     * @return locked - 状态(0:正常,1:锁定)
     */
    public Byte getLocked() {
        return locked;
    }

    /**
     * 设置状态(0:正常,1:锁定)
     *
     * @param locked 状态(0:正常,1:锁定)
     */
    public void setLocked(Byte locked) {
        this.locked = locked;
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
     * @return creater
     */
    public String getCreater() {
        return creater;
    }

    /**
     * @param creater
     */
    public void setCreater(String creater) {
        this.creater = creater;
    }

    /**
     * 获取修改时间
     *
     * @return modify_time - 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置修改时间
     *
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * @return modifier
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * @param modifier
     */
    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    /**
     * @return role_ids
     */
    public String getRoleIds() {
        return roleIds;
    }

    /**
     * @param roleIds
     */
    public void setRoleIds(String roleIds) {
        this.roleIds = roleIds;
    }

    /**
     * @return role_name
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * @param roleName
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}