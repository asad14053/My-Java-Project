
package com;
import java.util.Date;

public class Deposit_class {
    private String name;
    private String acc_num;
    private int deposit_amount;
    private String auth_st_id;
    
    
    public Deposit_class(String name, String acc_num, int deposit_amount, String auth_st_id) {

        this.name = name;
        this.acc_num = acc_num;
        this.deposit_amount = deposit_amount;
        this.auth_st_id = auth_st_id;

    }
    
    public String getname() {
        return name;
    }
     public String getacc_num() {
        return acc_num;
    }
      public int get_deposit() {
        return deposit_amount;
    }
      public String get_auth_st_id()
      {
      return auth_st_id;
      }
}
