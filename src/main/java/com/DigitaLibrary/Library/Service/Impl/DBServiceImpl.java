package com.DigitaLibrary.Library.Service.Impl;

import com.DigitaLibrary.Library.Domain.Book;
import com.DigitaLibrary.Library.Service.DBService;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
@Service
@Slf4j
public class DBServiceImpl {













//    private PreparedStatement addBookStatement = null;
//    @Autowired
//    Connection mysqlConnection;
//
//    @PostConstruct //Run this method after construction of a Bean (run at very start only once )
//    public void init(){
//        log.info("MySQL connection is " + mysqlConnection);
//        log.info("Creating table if not exist");
//        String query="create table if not exists book(id int primary key auto_increment,title varchar(100),author varchar(100),genre varchar(10),rating double,cost double,year int)";
//        try(Statement statement=mysqlConnection.createStatement()){
//            statement.execute(query);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            addBookStatement=mysqlConnection.prepareStatement("insert into book(title,author,genre,rating,cost,year) values(?,?,?,?,?,?)");
//        }
//        catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
////@Transactional
////@Rollback
//
//    @Override
//    public Book addBook(Book book) {
//       try{
//           addBookStatement.setString(1,book.getTitle());
//           addBookStatement.setString(2,book.getAuthor());
//           addBookStatement.setString(3,book.getGenre());
//           addBookStatement.setDouble(4,book.getRating());
//           addBookStatement.setDouble(5,book.getCost());
//           addBookStatement.setInt( 6,book.getYear());
//           addBookStatement.execute();
//            return book;
//        } catch (SQLException e) {
//            log.error("Error adding book to DB: {}",e.getMessage());
//
//        }
//        return null;
//    }
//
//    @Override
//    public List<Book> getAllBooks() {
//        return null;
//    }

    /**
     * DDL  - Data definition language
     * create table, create view, create join table
     *
     *
     * DML -  Data manipulation language
     * - insert into, update, delete select
     *
     * DCL - Data control language
     * - grant, revoke
     *
     * TCL - Transaction control language
     * - start transaction, commit transaction, rollback
     *
     * https://www.geeksforgeeks.org/sql-ddl-dml-tcl-dcl/
     *
     *
     * types of execute
     *
     * 1. execute() -> execute query -> returns true for success of result-set, false for failure
     * 2. executeUpdate() -> update query -> returns the number of rows affected
     * 3. executeQuery() -> select query -> returns the result set of data
     *
     *
     * JPA -> Java persistence API
     *
     * ORM -> Object relational mapping -> ORM framework 0-> Hibernate or Open JPA.
     *
     * */
}
