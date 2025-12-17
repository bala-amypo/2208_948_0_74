package com.example.demo.exception;
import 
@RestControllerAdvice
public class globalExceptionHandler
{
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?>handleField
}
