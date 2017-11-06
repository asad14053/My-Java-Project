package com;

import java.util.Date;

public class staff_class {

    private String name;
    private String id;
    private String address;
    private String rank;
    private int basc_salary;
    private String sex;
    private String password;
    private String acc_num;
    private Date dob;

    public staff_class(String name, String id, String address, String rank, int basc_salary, String sex, String password, String acc_num, Date dob) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.rank = rank;
        this.basc_salary = basc_salary;
        this.sex = sex;
        this.password = password;
        this.acc_num = acc_num;
        this.dob = dob;
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

    public String getrank() {
        return rank;
    }

    public int getbasc_salary() {
        return basc_salary;
    }

    public String getsex() {
        return sex;
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
}
