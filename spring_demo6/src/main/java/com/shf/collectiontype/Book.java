package com.shf.collectiontype;

import java.util.List;

public class Book {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Book{" +
                "list=" + list +
                '}';
    }
}
