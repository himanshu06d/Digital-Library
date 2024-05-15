package com.DigitaLibrary.Library.Service.Impl;

import com.DigitaLibrary.Library.Domain.Book;
import com.DigitaLibrary.Library.Domain.Review;
import com.DigitaLibrary.Library.Service.BookService;
import com.DigitaLibrary.Library.Service.resource.BookResponse;
import com.DigitaLibrary.Library.repository.BookRepository;
import com.DigitaLibrary.Library.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    ReviewRepository reviewRepository;
    @Autowired
    public void setBookRepository(BookRepository bookRepository){
        this.bookRepository=bookRepository;
    }


    //    private List<Book> bookList = new ArrayList<>();
    public void addBook(Book book) {
//        int count = bookList.size();
//        book.setId(String.valueOf(count+1));
//        bookList.add(book);
        bookRepository.save(book);
    }


    // Manual reference to call association between Books and reviews

//    public List<BookResponse> getallBooks() {
//
//        List<Book> books = bookRepository.findAll();
//        List<BookResponse> bookResponses = new ArrayList<BookResponse>();
//        for(Book book:books){
//            List<Review> reviews= reviewRepository.findByBookId(book.getId());
//            bookResponses.add( BookResponse.builder().cost(book.getCost()).title(book.getTitle()).author(book.getAuthor()).rating(book.getRating()).reviewList(reviews).build());
//        }
//        //for each book populate the reviews
//        return bookResponses;
//    }

    public List<Book> getallBooks(){
        List<Book> bookList = bookRepository.findAll();
        if(bookList.isEmpty()){
            throw new IllegalStateException("booklist cannot be empty");
        }
        return bookList;
    }

    public Book getBook(Integer Id) {
//        for(int i = 0; i < bookList.size(); i++) {
//            if (bookList.get(i).getId().equals(Id)) {
//                return bookList.get(i);
//
//            }
//
//        }
        return bookRepository.findById(Id).orElse(null);
    }



    public void deleteBook(Integer Id) {
//        int id  =-1;
//        int index =-1;
//        for(int i = 0;i<bookList.size();i++){
//            if(bookList.get(i).getId().equals(Id)){
//                id = i;
//                break;
//            }
//        }
//        if(id != -1){
//            bookList.remove(id);
//        }
        bookRepository.deleteById(Id);
    }


    public Book updateBook(Integer Id, Book book) {
//        int index  =-1;
//
//        for(int i = 0;i<bookList.size();i++){
//            if(bookList.get(i).getId().equals(id)){
//                index = i;
//                break;
//            }
//        }
//        if(index != -1){
//            bookList.set(index,book);
//
//        }
//        return null;
//
//    }
        Optional<Book> originalBook = bookRepository.findById(Id);
        if(originalBook.isPresent()){
            bookRepository.save(book);
        }
        return book;



    }
    @Override
    public void addReview(Integer bookId, Review review) {
//        Book book=bookMap.getOrDefault(bookId,null);
//
//       if(book!=null)
//       {
//         //  book.getReviewList().add(review);
//       }
//       bookMap.put(bookId,book);
    }


}

