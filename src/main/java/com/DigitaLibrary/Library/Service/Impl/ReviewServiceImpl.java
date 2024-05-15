package com.DigitaLibrary.Library.Service.Impl;

import com.DigitaLibrary.Library.Domain.Book;
import com.DigitaLibrary.Library.Domain.Review;
import com.DigitaLibrary.Library.Service.ReviewService;
import com.DigitaLibrary.Library.repository.BookRepository;
import com.DigitaLibrary.Library.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    ReviewRepository reviewRepository;

    @Autowired
    BookRepository bookRepository;

    @Override
    public void addReview(Review review) {
    Optional<Book> bookOptional= bookRepository.findById((review.getBook().getId()));
    if(bookOptional.isEmpty()){
        throw new IllegalArgumentException("Book id does not exist");
    }
    review.setBook(bookOptional.get());
        reviewRepository.save(review);
    }
}
