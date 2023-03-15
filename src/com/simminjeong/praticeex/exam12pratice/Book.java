package com.simminjeong.praticeex.exam12pratice;

public class Book extends TangibleAsset {

    private String isbn;

    public Book(String name, int price, String color, String isbn) {
        super(name, price, color);
        this.isbn = isbn;
    }



    public String getIsbn() {
        return isbn;
    }



    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return null;
    }



    @Override
    public int getPrice() {
        // TODO Auto-generated method stub
        return 0;
    }



    @Override
    public String getColor() {
        // TODO Auto-generated method stub
        return null;
    }
}


