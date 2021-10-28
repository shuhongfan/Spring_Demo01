package com.shf.spring5;

public class Book {
    private String bName;
    private String bAuthor;
    private String AddressAd;

//    set方法注入
    public void setbName(String bName) {
        this.bName = bName;
    }

    public void setAddressAd(String addressAd) {
        AddressAd = addressAd;
    }

    public Book() {
    }

    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor;
    }

    //    有参构造注入
    public Book(String bName) {
        this.bName = bName;
    }

    public void testDemo(){
        System.out.println(bName+"::"+bAuthor+"::"+AddressAd);
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.setbName("abc");

        Book book1 = new Book("abc");
    }
}
