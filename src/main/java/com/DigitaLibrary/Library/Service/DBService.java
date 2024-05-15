package com.DigitaLibrary.Library.Service;

import com.DigitaLibrary.Library.Domain.Book;

import java.util.List;

public interface DBService {

    public Book addBook(Book book);

    public List<Book> getAllBooks();
}
