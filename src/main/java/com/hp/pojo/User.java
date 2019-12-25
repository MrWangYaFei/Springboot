package com.hp.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "boot_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userid;
    private String userName;
    private String password;
    private Integer sex;
    private Date birthday;

    public Long getUserId() {
        return userid;
    }

    public void setUserId(Long userId) {
        this.userid = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userid +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                '}';
    }
}
