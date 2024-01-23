package com.vikhyat.Speer.utility;

import com.vikhyat.Speer.exceptions.EntityAlreadyExistsException;
import com.vikhyat.Speer.exceptions.NoEntityException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler({NoEntityException.class})
    public ResponseEntity<GenericResponse<Object>> handleNoEntityException(NoEntityException ex){
        log.error("NoEntityException - Error : {}", ex.getMessage(), ex);
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new GenericResponse<>(null, ex.getMessage()));
    }

    @ExceptionHandler({EntityAlreadyExistsException.class})
    public ResponseEntity<GenericResponse<Object>> handleEntityAlreadyExistsException(EntityAlreadyExistsException ex){
        log.error("EntityAlreadyExistsException - Error : {}", ex.getMessage(), ex);
        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(new GenericResponse<>(null, ex.getMessage()));
    }

    @ExceptionHandler({RuntimeException.class})
    public ResponseEntity<GenericResponse<Object>> handleRuntimeException(RuntimeException ex){
        log.error("Runtime Exception - Error : {}", ex.getMessage(), ex);
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(new GenericResponse<>(null, "Something went wrong, please try again." ));
    }

    @ExceptionHandler({MethodArgumentNotValidException.class})
    public ResponseEntity<GenericResponse<Object>> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex){
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });

        log.error("MethodArgumentNotValidException Exception - Error : {}", ex.getMessage(), ex);
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(new GenericResponse<>(null, errors.toString()));
    }

    @ExceptionHandler({Exception.class})
    public ResponseEntity<GenericResponse<Object>> handleException(Exception ex){
        log.error("Exception - Error : {}", ex.getMessage(), ex);
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(new GenericResponse<>(null, "Something went wrong, please try again." ));
    }
}
