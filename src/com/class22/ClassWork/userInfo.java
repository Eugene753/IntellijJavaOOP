package com.class22.ClassWork;

public class userInfo extends userClass {

    String userAddress;

    userInfo(String name,int mobileNumber,String userAddress){
        super(name,mobileNumber);
        this.userAddress=userAddress;

    }

    void printUserAddress(){
        System.out.println(userAddress);
    }

    void printUserDetail(){
        System.out.println(name);
        System.out.println(mobileNumber);
    }
}
