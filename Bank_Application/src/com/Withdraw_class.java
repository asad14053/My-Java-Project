package com;

public class Withdraw_class {

    private String name;
    private String acc_num;
    private int withdraw_amount;
    private String auth_st_id;

    public Withdraw_class(String name, String acc_num, int withdraw_amount, String auth_st_id) {

        this.name = name;
        this.acc_num = acc_num;
        this.withdraw_amount = withdraw_amount;
        this.auth_st_id = auth_st_id;
    }

    public String get_name() {
        return name;
    }

    public String get_acc_num() {
        return acc_num;
    }

    public int get_withdraw() {
        return withdraw_amount;
    }

    public String get_author() {
        return auth_st_id;
    }
}
