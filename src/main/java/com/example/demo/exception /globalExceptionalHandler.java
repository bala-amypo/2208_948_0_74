package com.example.demo.exception;
 
@RestControllerAdvice
public class globalExceptionHandler
{
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?>handleFieldError(MethodArgumentNotValidException ex)
    {
    
    }
    
}
