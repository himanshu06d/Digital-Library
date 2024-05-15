package com.DigitaLibrary.Library.Service;

import com.DigitaLibrary.Library.Domain.Book;
import com.DigitaLibrary.Library.Domain.Review;
import com.DigitaLibrary.Library.Service.resource.BookResponse;

import java.util.List;

public interface BookService {
    public void addBook(Book book);
    public List<Book> getallBooks();
    public void deleteBook(Integer Id);
    public Book updateBook(Integer Id, Book book);
    public Book getBook(Integer Id);

    public void addReview(Integer bookId, Review review);


}
