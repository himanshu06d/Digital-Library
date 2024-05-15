package com.DigitaLibrary.Library.Service.resource;

import com.DigitaLibrary.Library.Domain.Book;
import com.DigitaLibrary.Library.Domain.Review;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReviewRequest {

    @NotBlank(message = "Comment cannot be blank")
    private String comment;
    @Min(value = 1, message = "Minimum rating is 1")
    @Max(value = 5,message = "Rating must be 5 or less than 5")
    private Double rating;
    @Min(value = 0,message = "must be greater than 0")
    private Integer bookId;

    public Review getReview(){
        return Review.builder().comment(this.comment).
                rating(this.rating).
                book(Book.builder().id(this.bookId).build()).build();
    }
}
