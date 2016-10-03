package com.webonise.springcollectionassingment;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
@Document(collection = "users")
public class UserInfo {
    @Id
    private String _id;
    private String username;
    private String name;
    private String email;
    private double age;
    private String password;
    private String user_info;
    private String role;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_info() {
        return user_info;
    }

    public void setUser_info(String user_info) {
        this.user_info = user_info;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String userName) {
        this.username = userName;
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

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null || (object.getClass() != this.getClass()))
            return false;

        UserInfo userInfo = (UserInfo) object;

        return age == userInfo.age && (username == userInfo.username || (username != null && username.equals(userInfo.username)));

    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (int) age;
        hash = 31 * hash + (null == username ? 0 : username.hashCode());
        return hash;
    }
}

