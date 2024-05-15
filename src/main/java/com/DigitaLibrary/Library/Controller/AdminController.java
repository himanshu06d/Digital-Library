package com.DigitaLibrary.Library.Controller;

import com.DigitaLibrary.Library.Domain.Book;
import com.DigitaLibrary.Library.Service.BookService;
import com.DigitaLibrary.Library.Service.resource.BookRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//Controller handles incoming Http request
//This is used to make the AdminController as a Controller and ask spring to give the obj out of it as we have use Autowired
public class AdminController {

    /***
     * 3 ways to inject the dependency
     *
     * 1. by declaring the instance with Autowired. - Field injection.
     * @Autowired
     *     BookService bookService;
     *
     * 2. With help of constructor - construtor injection
     * @Autowired
     *     public AdminController(BookService bookService, DummyServiceImpl dummyService) {
     *         this.bookService = bookService;
     *         this.dummyService=dummyService;
     *
     *     }
     *
     *
     * 3. With help of setters.  - method/ setter injection
     * @Autowired
     *     public void setBookService(BookService bookService){
     *         this.bookService=bookService;
     *     }
     *
     *
     * @Controller( Handles incoming HTTP URL) -> @RequestMapping(which mapping URL) ->ResponseBody (To give output in json format)
     * */


    @Autowired
    BookService bookService;
    //This is for Autowiring the Bookservice dependency into this controller
    // No Relation between @Restcontroller and @Autowired, One RestController can have multiple AutoWired



    @PostMapping("/admin/book")
    public ResponseEntity<Book> createBook(@RequestBody @Valid BookRequest bookRequest){
        //@RequestBody is used to bind the JSON/txt/multiple type of data to the object

        bookService.addBook(bookRequest.getBook());
        return  new ResponseEntity<>(HttpStatus.CREATED);

        /**
         * ResponseEntity is Packet where you want to give Status code, and to pass the complete package of
         * Headers, status and body
         *
         * RequestBody is body part of the response, so req will come in some format that needs to be mappes to your resourse
         * from the user request
         **/

    }

    @PutMapping("/admin/book")
    public ResponseEntity<Book> updateBook(@RequestParam("bookId") Integer id, @Valid @RequestBody Book book){

        return new ResponseEntity<>(bookService.updateBook(id,book) , HttpStatus.OK);
    }



    @DeleteMapping("/admin/book/")
    public ResponseEntity<Book> deleteBook(@RequestParam Integer id){
        bookService.deleteBook(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
}
