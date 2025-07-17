package com.hotelservice.hs.ExceptionHandling;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Map<String, Object>> notFoundHandler(ResourceNotFoundException e) {

        Map<String, Object> response = new HashMap<>();
        response.put("message", e.getMessage());
        response.put("success", false);
        response.put("status", HttpStatus.NOT_FOUND.value()); // Use .value() to return int (404)

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }

}
