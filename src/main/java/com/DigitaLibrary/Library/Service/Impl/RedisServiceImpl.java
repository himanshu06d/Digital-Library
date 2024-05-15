package com.DigitaLibrary.Library.Service.Impl;

import com.DigitaLibrary.Library.Domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

public class RedisServiceImpl {


    @Autowired
    RedisTemplate<String,Object> redisTemplate;
    public void addBook(Book book){

    }
}
