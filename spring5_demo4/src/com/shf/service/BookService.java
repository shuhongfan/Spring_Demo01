package com.shf.service;

import com.shf.dao.BookDao;
import com.shf.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
//    注入dao
    @Autowired
    private BookDao bookDao;

//    添加方法
    public void addBook(Book book){
        bookDao.addBook(book);
    }

//    修改方法
    public void update(Book book)
    {
        bookDao.updateBook(book);
    }

//    删除方法
    public void delete(String id)
    {
        bookDao.deleteBook(id);
    }

//    查询表记录数
    public int findCount(){
        return bookDao.selectCount();
    }

//    查询返回对象
    public Book findOne(String id){
        return bookDao.findBookInfo(id);
    }

//    查询返回集合
    public List<Book> findAll(){
        return bookDao.findAllBookInfo();
    }

//    批量添加
    public void batchAdd(List<Object[]> batchArgs){
        bookDao.batchAddBook(batchArgs);
    }

//    批量修改
    public void batchUpdate(List<Object[]> batchArgs){
        bookDao.batchUpdateBook(batchArgs);
    }

//    批量删除
    public void batchDelete(List<Object[]> batchArgs){
        bookDao.batchDelete(batchArgs);
    }
}
