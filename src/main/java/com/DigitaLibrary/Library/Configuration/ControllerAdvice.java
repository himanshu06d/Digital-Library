package com.DigitaLibrary.Library.Configuration;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ControllerAdvice {

    //@RestControllerAdvice
    //Give functionality to handle global exception in your customization returns a json format for exception
    // @Controlleradvice+ @ResponseBody = @RestControllerAdvice

    @ExceptionHandler({MethodArgumentNotValidException.class , IllegalArgumentException.class})
    public ResponseEntity<?> handleException(MethodArgumentNotValidException e){
        Map<String,String> errormap = new HashMap<>();
        for(FieldError error: e.getBindingResult().getFieldErrors()){
            errormap.put(error.getField(),error.getDefaultMessage());
        }
        return new ResponseEntity<>(errormap , HttpStatus.BAD_REQUEST);



    }
}
