package com.example.renad.exchangeit;

public class User {
    private String id;
    private String Fname;
    private String Lname;
    private String phoneNumber;

    private String email;

public User(String i  ,String f,String l,String p, String e){
    id = i;
    Fname=f;
    Lname=l;
    phoneNumber=p;
    email=e;
}

    public String getPhoneNumber() {
        return phoneNumber;
    }



    public String getEmail() {
        return email;
    }

    public String getFname() {
        return Fname;
    }



    public String getLname() {
        return Lname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



}// the class

