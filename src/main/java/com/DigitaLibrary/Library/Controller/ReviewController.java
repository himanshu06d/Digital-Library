package com.DigitaLibrary.Library.Controller;

import com.DigitaLibrary.Library.Domain.Review;
import com.DigitaLibrary.Library.Service.ReviewService;
import com.DigitaLibrary.Library.Service.resource.ReviewRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/review")
public class ReviewController {

    @Autowired
    ReviewService reviewService;

    @PostMapping
    public ResponseEntity<?> addReview(@RequestBody @Valid ReviewRequest reviewRequest){
    reviewService.addReview(reviewRequest.getReview());
    return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
