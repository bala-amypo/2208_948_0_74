package com.example.demo.exception;
 
@RestControllerAdvice
public class globalExceptionHandler
{
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?>handleFieldError(MethodArgumentNotValidException ex)
    {
    Map<string,String>error= new HashMap<>();
    ex.getBindingResult()
    .getFieldErrors().forEach(err-> error.put(err.getField(),err.getDefaultMessage()));
    
    return new RessponseEntity<>(error,HttpStatus.BAD_REQUEST);
        }
    @ExceptionalHandler(StudentNotFoundException.class)
    public ResponseEntity<?>handle
}
