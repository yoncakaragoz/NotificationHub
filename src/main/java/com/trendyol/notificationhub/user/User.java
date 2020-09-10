package com.trendyol.notificationhub.user;

public class User implements IUser {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name;
    }

    public void takeMessage(String message) {
        System.out.println("In takeMessageMethod");
    }
}
