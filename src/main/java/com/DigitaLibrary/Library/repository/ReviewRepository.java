package com.DigitaLibrary.Library.repository;

import com.DigitaLibrary.Library.Domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review,Integer> {

    List<Review> findByBookId(Integer bookId);
}
