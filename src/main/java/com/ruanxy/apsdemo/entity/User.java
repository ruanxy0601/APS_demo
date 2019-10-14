package com.ruanxy.apsdemo.entity;

/**
 * 集成mybatis练习
 * @author rxy
 * @date 2019/10/12
 */
public class User {

    private String id;
    private String name;
    private String log_name;
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLog_name() {
        return log_name;
    }

    public void setLog_name(String log_name) {
        this.log_name = log_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", log_name='" + log_name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
