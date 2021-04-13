package com.GroupTask2.Task4;

public class Registration {

    private String email;
    private String userName;
    private String password;

    public void setEmail(String email){

        if(email.contains("@gmail")||email.contains("@yandex")){
            System.out.println("Only yahoo email is allowed");
        }else if(email.contains("@yahoo")){
            this.email=email;
        }
    }
    public void setUserName(String userName){

        if(userName.length()>6 && userName.matches("^[A-Za-z0-9]*$")){
            this.userName=userName;
        }else{
            System.out.println("Enter user name larger then 6 characters");
        }
    }
    public void setPassword(String password){

        if(password.equals(this.userName)){

            System.out.println("Password cannot contain user name");

        }else if(password.length()>6 && password.matches("^[A-za-z0-9]*$")){

            this.password=password;
        }
    }

    String getEmail(){
        return email;
    }
    String getUserName(){
        return userName;
    }
    String getPassword(){
        return password;
    }



}
