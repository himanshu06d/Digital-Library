package com.DigitaLibrary.Library.Service.Impl;

import com.DigitaLibrary.Library.Domain.Book;
import com.DigitaLibrary.Library.repository.BookRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookServiceImplTest {


    /*
    *Spring automatically calls this as test class if we give @Test, it will consider as Test so at the time
    of build this test will be executed*/
    @Test
    void getallBooks() {
        BookServiceImpl bookService = new BookServiceImpl();

        //mocking
        BookRepository bookRepository = mock(BookRepository.class);
        bookService.setBookRepository(bookRepository);


        //stubbing
        List<Book> bookList = new ArrayList<>();
        Book book = new Book();
        bookList.add(book);
        when(bookRepository.findAll()).thenReturn(bookList);

        bookService.getallBooks();

    }

    @Test
    void getallBooks_Exp() {
        BookServiceImpl bookService = new BookServiceImpl();

        //mocking
        BookRepository bookRepository = mock(BookRepository.class);
        bookService.setBookRepository(bookRepository);


        //stubbing
        List<Book> bookList = new ArrayList<>();
        Book book = new Book();
        bookList.add(book);
        when(bookRepository.findAll()).thenReturn(bookList);
        assertEquals(bookList.size(),1);

        bookService.getallBooks();

    }

    /***
     * Unit testing -> Testing of the code blocks a developer write. It covers all the scenarios of the method.
     *      Developer should be writing this cases.
     *      Code - coverage to the build is determined by the number of lines covered by the test cases.
     *            - 100% code coverage is Ideal.
     *
     *
     *            Mockito -> Library helps in mocking the objects or beans.
     *
     *            1. Mock -> we mock the object here in the test case
     *
     *                -ex : for bookService, we mock the bookRepository so that output of the bookRepository can be controlled.
     *                      the dependent bean is also handled in the mock.
     *
     *
     *            2. Stub -> we mock the behavior of the object when the methods are called.
     *
     *                 -ex: for bookService the mocked bookRepository, get a custom output of specific method.
     *
     *            3. Spy  -> To help stubbing when the object is not mocked.
     *
     *                  -Ex: for non-mocked objects, we can spy for them to call a method which are stubbed and give stubbed output to them.
     *
     *
     *
     * Asserts
     * -> if a= 5
     *
     * assert(5,a) -> pass
     * assert(10,a) -> fail
     *
     * for Junit<5, the expections are tested with the expected keyword in the annotation with the value as type of the Exception
     * For Junit5> it has to be tested along with asserts itself.
     *
     *Functional testing -> Testing of the functionality. where the entire operation of the entity or resource are tested with real scenarios.
     *
     *
     * */
}