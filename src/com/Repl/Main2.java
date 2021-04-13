package com.Repl;

public class Main2 {

    public static void main(String[] args) {
        Account acc=new Account();

        acc.setAcc_no(45541215421L);
        acc.setName("Sumair");
        acc.setEmail("sumair@syntax.com");
        acc.setAmount(50000.0);

        System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());
    }
}
