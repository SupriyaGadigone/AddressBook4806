package com.addressbook.ab.model;

public class BuddyInfo {
    private String name;
    private String phoneNumber;
     
    public BuddyInfo(){}
     
    public BuddyInfo(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
     
    // name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
     
    // phoneNumber
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}