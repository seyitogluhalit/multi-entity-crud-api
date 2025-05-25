package com.syitogluhalit.demo.exception;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
import java.sql.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    // Hata mesajını verilen key'e ekler
    private List<String> addMapValue(List<String> list, String newValue) {
        list.add(newValue);
        return list;
    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResponseEntity<ApiError> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
        Map<String, List<String>> errorsMap = new HashMap<>();

        for (ObjectError objError : ex.getBindingResult().getAllErrors()) {
            String fieldName = ((FieldError) objError).getField();
            String errorMessage = objError.getDefaultMessage();

            if (errorsMap.containsKey(fieldName)) {
                addMapValue(errorsMap.get(fieldName), errorMessage);
            } else {
                List<String> errorList = new ArrayList<>();
                addMapValue(errorList, errorMessage);
                errorsMap.put(fieldName, errorList);
            }
        }

        return ResponseEntity.badRequest().body(createApiError(errorsMap));
    }

    private ApiError createApiError(Map<String, List<String>> errors) {
        ApiError apiError = new ApiError();
        apiError.setId(UUID.randomUUID().toString());
        apiError.setErrorTime(new Date(System.currentTimeMillis()));
        apiError.setErrors(errors);
        return apiError;
    }
}
