package com.DigitaLibrary.Library.Controller;

import com.DigitaLibrary.Library.Domain.Book;
import com.DigitaLibrary.Library.Domain.Review;
import com.DigitaLibrary.Library.Service.BookService;
import com.DigitaLibrary.Library.Service.resource.BookResponse;
import jakarta.websocket.server.PathParam;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    BookService bookService;

    @GetMapping("/book")
    public ResponseEntity<List<Book>> getAllBooks(){

        return new ResponseEntity<>(bookService.getallBooks(),HttpStatus.OK);
    }

    @GetMapping("/book/{id}")
    public ResponseEntity<Book> getBook(@PathVariable("id") Integer bookId){
        return new ResponseEntity<>(bookService.getBook(bookId), HttpStatus.OK);
    }

//    @GetMapping("/{bookId}/review")
//        public ResponseEntity<Book> addReview(@PathVariable("bookId") String bookId, @RequestBody Review review){
//            bookService.addReview(Integer.valueOf(bookId),review);
//            return new ResponseEntity<>(HttpStatus.OK);
//        }
    }



