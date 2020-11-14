package com.myproject.bankapp.pojo;

import com.myproject.bankapp.BankAccount;

public class Main {
    public static void main ( String args [] ) {
        BankAccount test = new BankAccount();
        String [] arrtest = test.AddCards();
        arrtest[0] = "aasdaf";
        arrtest[1] = "asdasd";
            test.SetId(0);
            test.toString();
            System.out.println("sdsd");
        }
    }