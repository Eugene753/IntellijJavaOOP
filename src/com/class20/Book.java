package com.class20;

public class Book {
    String bookName;
    String ISBN;
    Book(){
        System.out.println("Important line");
    }

    public Book(String bookName, String ISBN) {
        this();
        this.bookName = bookName;
        this.ISBN = ISBN;
    }

    public static void main(String[]args){
        Book obj=new Book("My new Book","FHFH4545");
    }
}
