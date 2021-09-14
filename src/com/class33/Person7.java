package com.class33;

public class Person7 {

   String firstN;
   String lastN;
   String gen;

    public Person7(String firstN, String lastN, String gen) {
        this.firstN = firstN;
        this.lastN = lastN;
        this.gen = gen;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstN + '\'' +
                ", lastName='" + lastN + '\'' +
                ", gender='" + gen + '\'' +
                '}';
    }
}
