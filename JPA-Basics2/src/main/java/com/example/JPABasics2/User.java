package com.example.JPABasics2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "user_info")
public class User {
    @Id
    private int userId;
    private String name;
    private int age;
    private String mobile;

    public User(int userId,String name, int age, String mobile) {
        this.name = name;
        this.age = age;
        this.mobile = mobile;
        this.userId = userId;
    }
    // Spring uses default constructors
    public User() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
