package com.example.javaapidemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// 用于标记持久化类,Spring Boot项目加载后会自动根据持久化类建表
@Entity // This tells Hibernate to make a table out of this class
public class User {
    /**
     * 使用@Id指定主键. 使用代码@GeneratedValue(strategy=GenerationType.AUTO)
     * 指定主键的生成策略,mysql默认的是自增长,所以改为GenerationType.IDENTITY。
     */
    @Id
    // @GeneratedValue(strategy=GenerationType.AUTO)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String name = "";
    private String email = "";
    private String phone = "";
    private String password = "";
    private byte age;
    private byte sex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public byte getSex() {
        return sex;
    }

    public void setSex(byte sex) {
        this.sex = sex;
    }
}
