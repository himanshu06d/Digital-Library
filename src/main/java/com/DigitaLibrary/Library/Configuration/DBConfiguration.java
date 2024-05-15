package com.DigitaLibrary.Library.Configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
public class DBConfiguration {

    /***
     * If we have 2 Beans in a single class then Spring don't have any probelm with them but when Spring project runs,
     * it will confuse Spring which one to go with, so use @Primary or use @Qualifier annotation to deal with this kind of
     * problem.Asking for 2 beans and giving same class object to both.
     *
     * @Primary -> whichever Bean is declared primary spring will go with that only
     *
     * **/


    @Value("${mysql-uri}")
    String host;
    @Value("${mysql-username}")
    String username;
    @Value("${mysql-password}")  //pick this value from the properties file
    String password;

    @Value("${env}")
    String currentEnv;
//    @Bean("DevDataBase") //specify bean name
//    public Connection mysqlConnecion(){
//    System.out.println("I am getting called from connection");
//        System.out.println(currentEnv);
//
//
//        Connection connection = null;
//        try {
//            connection = DriverManager.getConnection("jdbc:mysql://" +host+"/library", username,password);
//        } catch (SQLException e) {
//            System.out.println("Error" + e.getMessage());
//        }
//    return connection;
//    }

//    @Bean("Oracle")
//    public Connection oracleConnecion(){
//        System.out.println("I am getting called from connection");
//
//        Connection connection = null;
//        try {
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root" , "Emac229907@");
//        } catch (SQLException e) {
//            System.out.println("Error" + e.getMessage());
//        }
//        return connection;
//    }

}

