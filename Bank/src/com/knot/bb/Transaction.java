package com.knot.bb;
class Transaction{
    String type;
    double amount;

    //constructor
    Transaction(String type,double amount){
        this.type=type;
        this.amount=amount;
    }

    @Override
    public String toString(){
        return type + "of amount "+ amount;
    }
}

