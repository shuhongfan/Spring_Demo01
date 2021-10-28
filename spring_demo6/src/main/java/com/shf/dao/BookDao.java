package com.shf.dao;

import com.shf.entity.Book;

import java.util.List;

public interface BookDao {
    void addBook(Book book);

    void updateBook(Book book);

    void deleteBook(String id);

    int selectCount();

    Book findOneBook(String id);

    List<Book> findAllBooks();

    void batchAddBooks(List<Object[]> batchList);

    void batchUpdateBooks(List<Object[]> batchList);

    void batchDeleteBooks(List<Object[]> batchList);
}
