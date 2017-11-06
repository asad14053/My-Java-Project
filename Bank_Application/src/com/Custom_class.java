package com;

import java.util.Date;

public class Custom_class {

    private String name;
    private String id;
    private String address;
    private String acc_type;
    private String sex;
    private String occupation;
    private String password;
    private String acc_num;
    private Date dob;
    private int balance;

    public Custom_class(String name, String id, String address, String acc_type, String sex, String occupation, String password, String acc_num, Date dob, int balance) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.acc_type = acc_type;
        this.sex = sex;
        this.occupation = occupation;
        this.password = password;
        this.acc_num = acc_num;
        this.dob = dob;
        this.balance = balance;
    }

    public String getname() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getaddress() {
        return address;
    }

    public String getacc_type() {
        return acc_type;
    }

    public String getsex() {
        return sex;
    }

    public String getoccupation() {
        return occupation;
    }

    public String getpassword() {
        return password;
    }

    public String getacc_num() {
        return acc_num;
    }

    public Date getdob() {
        return dob;
    }

    public int get_balance() {
        return balance;
    }
}
