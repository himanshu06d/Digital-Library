package com.DigitaLibrary.Library.Service.resource;

import com.DigitaLibrary.Library.Domain.Review;
import lombok.*;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookResponse {
    /*
     * Book is one entity and Review is another entity. So, to get the data of both of their association,
     * we made this class to bind the reviews in a list and attach it with the particular book.
     */

    private String title;
    private String author;
    private Double rating;
    private Double cost;
    List<Review> reviewList;

    public BookResponse(String title, String author, Double rating, Double cost) {
        this.title = title;
        this.author = author;
        this.rating = rating;
        this.cost = cost;
    }

}
