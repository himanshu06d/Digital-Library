package com.DigitaLibrary.Library;

import com.DigitaLibrary.Library.Domain.Book;
import com.DigitaLibrary.Library.Domain.Genre;
import com.DigitaLibrary.Library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.List;

@SpringBootApplication
public class LibraryApplication{


    @Autowired
    ApplicationContext context;
	// Spring has given one class ApplicationContext in order to interact with Spring

//    @Autowired
//    BookRepository bookRepository;

    @Autowired
    RedisTemplate<String,Object> redisTemplate;

    @Autowired
    BookRepository bookRepository;


    public static void main(String[] args) {
        SpringApplication.run(LibraryApplication.class, args);
//        ApplicationContext context = new AnnotationConfigApplicationContext(temp.class);
//        context.getBeanDefinitionNames();

    }

    public void run(String... args) throws Exception{
//
        System.out.println("I am in run");
        Book book = new Book();
        book.setTitle("Harry Potter");
        book.setAuthor("JK Rowling");
        book.setCost(300.00);
        book.setGenre(Genre.FANTASY);
        book.setYear(1997);
        book.setRating(4.0);
        System.out.println("Saving the book details");


        bookRepository.save(book);
        List<Book> books = bookRepository.findAll();

        books = bookRepository.findAll();

//        for(Book book2:books){
//            System.out.println(book2);
//        }

        redisTemplate.opsForValue().set("myJavakey", "myjavavalue");

    }

    /***
     *
     * Steps for hibernate:
     * 1. add the spring data jpa maven dependency.
     * 2. add the configurations of url,username,password in application.properties.
     * 3. Annotate you domain with @Table and @Entity annotation.
     * 4. Add an iD to the domain with desired ID generation type.
     * 5. Create repository for each domain and let it extend the JPARepository.
     * 6. write your custom queries to the interface.
     * 7. Start using the repository for DB related task in the service layer.
     *
     *
     *
     *
     * @GetMapping("/books")
     *   public List<Book> getAllUsers() {
     *     return bookRepository.findAll();
     *   }
     * @PostMapping("/users")
     *   public Book createBook(@Valid @RequestBody Book book) {
     *     return bookRepository.save(book);
     *   }
     * */



}
