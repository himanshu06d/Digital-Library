package com.DigitaLibrary.Library.Service.resource;

import com.DigitaLibrary.Library.Domain.Book;
import com.DigitaLibrary.Library.Domain.Genre;
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
public class BookRequest {

    @NotBlank(message = "title cannot be empty")
    private String title;
    @NotBlank(message = "Author can not be empty")
    private String author;
    @NotBlank(message = "Please type valid genre")
    private String genre;
    @Min(value = 1000, message = "year cannot be less than 1000")
    private Integer year;
    @Min(value = 0,message = "cost cannot be negative")//not a part of req
    private Double cost;

    public Book getBook(){
        return Book.builder().title(this.title).
                author(this.author).rating(0.0).
                genre(Genre.valueOf(this.genre)).cost(this.cost).
                year(this.year).build();
    }
}
