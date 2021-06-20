package com.company;

public class Main {

    public static void main(String[] args) {

        // Creates two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Print library hours of operation
        System.out.println("Library hours:");
        System.out.println(firstLibrary.hours());

        // Print library addresses
        System.out.println("Library addresses:");
        System.out.println(firstLibrary.printAddy());
        System.out.println(secondLibrary.printAddy());

        //Adding books to first library and printing them at the same time with this announcing statement
        System.out.println("Books available in the first library:");

        // Add four books to first library
        firstLibrary.addBook("The Da Vinci Code");
        System.out.println(firstLibrary.bookStock());
        firstLibrary.addBook("Le Petit Prince");
        System.out.println(firstLibrary.bookStock());
        firstLibrary.addBook("A Tale of Two Cities");
        System.out.println(firstLibrary.bookStock());
        firstLibrary.addBook("The Lord of the Rings");
        System.out.println(firstLibrary.bookStock());


        System.out.println("Books available in the second library:");

        // Second library stock statement
        System.out.println("No books available in the catalog.");


        // Small test of borrowing outcomes
        Book example = new Book("The Lord of the Rings");
        System.out.println("Borrowing: " + example.getTitle());
        System.out.println("Is it true that this book is borrowed? " + example.isBorrowed());

        example.borrowed();
        System.out.println("Is it true that this book is borrowed? " + example.isBorrowed());

        example.returned();
        System.out.println("Is it true that this book is waiting to be returned? " + example.isBorrowed());

        System.out.println("Do you have this book? "  + example.noStock());

        example.returned();
        System.out.println("I am here to return this book. " + example.returnedStatement());
    }

    public static class Book {

        String title;
        boolean borrowed;


        public Book(String bookTitle) {
            title=bookTitle;
        }

        // Marks the book as borrowed
        public void borrowed() {
            borrowed=true;
        }

        // Marks the book as not borrowed
        public void returned() {
            borrowed=false;
        }

        // Marks the book as not borrowed
        public String returnedStatement() {
            String str3 = "You have successfully returned " + title;

            return str3;
        }

        // Returns true if the book is borrowed, false otherwise
        public String isBorrowed() {
            String str;

            if(borrowed){
                str= "Sorry, we don't have " + title + " available right now.";
            }else{
                str = "Yes, we have " + title + " in stock. Would you like to borrow it?";
            }
            return str;
        }

        // Returns false if book is not in stock
        public String noStock() {
            String str2 = "Sorry, " + title + " is not in our catalog.";

            return str2;
        }

        // Returns the title of the book
        public String getTitle() {
            return title;
        }


    }
    public static class Library {

        String addy;
        Book bk;
        int i=0;

        // Creates a new com.company.Main.Library
        public Library(String address) {
            addy=address;
        }

        // adds book
        public void addBook(String abook) {
            bk=new Book(abook);
        }

        // Announces library hours
        public String hours(){
            String hours="Libraries are open daily, from 9 AM to 5 PM.";
            return hours;
        }

        // Returns address as a string
        public String printAddy(){
            return addy;
        }

        // Returns available books
        public String bookStock(){
            return bk.getTitle();
        }
    }
}