package com.DigitaLibrary.Library.Domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "books")
@Entity
@Builder
public class Book {
    /***
     * Rather than making fields here for database, to increase security, We ask spring to make table directly over here
     * ORM mapping here
   ***/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String author;
    @Enumerated(value = EnumType.STRING)
    private Genre genre;
    private Double rating;
    private Double cost;
    private Integer year;

    // One book can have many reviews

    @OneToMany(mappedBy = "book")
    @JsonIgnoreProperties("book")
    private List<Review> reviewList;

    /***
     * Types of ID generation
     *
     *     TABLE -> keeping a separate table for the Id generation.
     *     SEQUENCE -> where the last sequence is identified and IDs are updated . -> postgres
     *     IDENTITY -> which is supported by the under-laying database. eg: mysql, sql server.
     *     UUID -> generate a unique identifer, randomly generated.
     *     AUTO -> which will the framwork to support the one by the under-laying data or go forward with Identity.
     * */


}
