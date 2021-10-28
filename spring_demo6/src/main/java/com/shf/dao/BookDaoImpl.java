package com.shf.dao;

import com.shf.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDaoImpl implements BookDao{
//    注入JDBCTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

//    添加的方法
    @Override
    public void addBook(Book book) {
//        调用JDBCTemplate对象里面update方法实现添加操作
        String sql = "insert into t_book values(?,?,?)";
        int update = jdbcTemplate.update(sql, book.getUserId(), book.getUsername(), book.getUstatus());
        System.out.println(update);
    }

//    修改方法
    @Override
    public void updateBook(Book book) {
        String sql = "update t_book set username=?,ustatus=? where user_id=?";
        int update = jdbcTemplate.update(sql, book.getUsername(), book.getUstatus(), book.getUserId());
        System.out.println(update);
    }

//    删除方法
    @Override
    public void deleteBook(String id) {
        String sql = "delete from t_book where user_id=?";
        int update = jdbcTemplate.update(sql, id);
        System.out.println(update);
    }


    @Override
    public int selectCount() {
        String sql = "select count(*) from t_book";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public Book findOneBook(String id) {
        String sql = "select * from t_book where user_id=?";
//        第一个参数  sql语句
//        第二个参数 RowMapper接口 针对返回不同类型数据 使用这个接口里面实现类完成数据的封装
//        第三个参数 sql语句值
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
        return book;
    }

    @Override
    public List<Book> findAllBooks() {
        String sql = "select * from t_book";
        List<Book> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return query;
    }

//    批量添加
    @Override
    public void batchAddBooks(List<Object[]> batchList) {
        String sql = "insert into t_book values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchList);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    @Override
    public void batchUpdateBooks(List<Object[]> batchList) {
        String sql = "update t_book set username=?,ustatus=? where user_id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchList);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    @Override
    public void batchDeleteBooks(List<Object[]> batchList) {
        String sql = "delete from t_book where user_id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchList);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
