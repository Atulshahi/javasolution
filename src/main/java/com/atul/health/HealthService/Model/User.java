package com.atul.health.HealthService.Model;

import jakarta.persistence.*;
import jdk.jfr.Enabled;

import java.util.Date;

@Entity
@Table(name="tbl_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "unique_id")
    private String uniqueId;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "role_id")
    private Long roleId;

    @Column(name= "created_date")
    private Date created_date;

    @Column(name = "updated_date")
    private Date updated_date;

    @Column(name = "user_status")
    private Integer userStatus;

    public User(Long userId, String uniqueId, String email, String password, Long roleId, Integer userStatus) {
        this.userId = userId;
        this.uniqueId = uniqueId;
        this.email = email;
        this.password = password;
        this.roleId = roleId;
        this.userStatus = userStatus;
    }

    public User() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", uniqueId='" + uniqueId + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", roleId=" + roleId +
                ", userStatus=" + userStatus +
                '}';
    }
}
