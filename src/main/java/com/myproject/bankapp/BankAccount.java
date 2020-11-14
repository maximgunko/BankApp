package com.myproject.bankapp;

public class BankAccount {
    int id, indexArray = 2;
    String name;
    String [] cards = new String[indexArray];

    public BankAccount() {
    }

    public int GetId() {
        return id;
    }

    public void SetId(int id) {
        this.id = id;
    }

    public String GetString() {
        return name;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public String [] AddCards () {
        return this.cards;
    }

    public String toString() {
        for ( int i = id; i < cards.length; i++) {
            System.out.println("BankAccount{"
                    + "Card Id '" + i + '\''
                    + ", Card number " + cards[i] + '}');
        }
        return cards[id];
    }
}