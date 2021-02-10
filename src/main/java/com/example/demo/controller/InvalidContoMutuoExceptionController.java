/**
 * 
 */
package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.exception.InvalidContoMutuoException;

/**
 * @author Alex
 *
 */

@ControllerAdvice
public class InvalidContoMutuoExceptionController {
	
	@ExceptionHandler(value = InvalidContoMutuoException.class)
	   public ResponseEntity<Object> exception(InvalidContoMutuoException exception) {
	      return new ResponseEntity<>("Conto Mutuo non eseguibile", HttpStatus.INTERNAL_SERVER_ERROR);

}
}
