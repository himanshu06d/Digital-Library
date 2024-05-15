package com.DigitaLibrary.Library.repository;

import com.DigitaLibrary.Library.Domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
// adding custom queries (JPQL)



//    List<Book> findByTitle(String title);


    /**
     * Whatever you give here in findBY___ must be present in one of the class under the domain with exact same spelling
     * This findBy functionality is given and supported by Hibernate
     **/

//    List<Book> findByAuthor(String author);

//    List<Book> findByAuthorAndGenre(String author, String genre);

//    List<Book> findByAuthorGroupBy(String author, Double reviews);

//    List<Book> findByGenreSortByRating(String genre, Sort sort);
//@Query("select book from Book book where rating > 3.5")
////This annotation will provide to write the custom query which we want to frame in our way
//    List<Book> giveMeTopBooks();
//@Query("select book from Book book where title like ? 1")
//    List<Book> findByTitleLike(String title);




    /****
     * JPQL
     * - create custom query for the serach.
     * Done by @Query annotation and values are mapped by ?1 or ?2 etc. or :varableName
     * - * is not supported as JPQL because, Java cannot understand *.
     *
     * */


    //Pagination can also be handled by hibernate when it comes to lots of data.
}
