package com.shf.service;

import com.shf.dao.BookDao;
import com.shf.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
//    注入Dao
    @Autowired
    private BookDao bookDao;

//    添加方法
    public void addBook(Book book){
        bookDao.addBook(book);
    }

//    修改方法
    public void updateBook(Book book) {
        bookDao.updateBook(book);
    }

    //    删除方法
    public void deleteBook(String id) {
        bookDao.deleteBook(id);
    }

//    查询表 记录数
    public int selectCount() {
        return bookDao.selectCount();
    }

//    查询返回对象
    public Book findOneBook(String id){
        return bookDao.findOneBook(id);
    }

//    查询返回集合
    public List<Book> findAllBooks() {
        return bookDao.findAllBooks();
    }

//    批量添加
    public void batchAddBooks(List<Object[]> batchList){
        bookDao.batchAddBooks(batchList);
    }

//    批量修改
    public void batchUpdateBooks(List<Object[]>batchList) {
        bookDao.batchUpdateBooks(batchList);
    }

    public void batchDeleteBooks(List<Object[]>batchList){
        bookDao.batchDeleteBooks(batchList);
    }
}
