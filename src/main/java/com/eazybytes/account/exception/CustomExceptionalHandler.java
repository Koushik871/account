package com.eazybytes.account.exception;


import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.net.http.WebSocket;

@ControllerAdvice
public class CustomExceptionalHandler extends ResponseEntityExceptionHandler {

//            @ExceptionHandler
//            public ResponseEntity<Object> handleEx(RuntimeException ex,WebSocket webSocket,){
//
//                return this.handleExceptionInternal(ex, new ErrorResponse() {
//                })
//            }


}
