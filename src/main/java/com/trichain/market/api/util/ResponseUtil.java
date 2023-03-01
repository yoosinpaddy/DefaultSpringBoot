package com.trichain.market.api.util;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseUtil {
    public static final String RESPONSE_ERROR = "e";

    private ResponseUtil(){}

    public static ResponseEntity<String> getInvalidResponse(String message) {
        return getErrorResponse(message,HttpStatus.BAD_REQUEST);
    }

    public static ResponseEntity<String> getErrorResponse(String message) {
        HttpHeaders headers = new HttpHeaders();
        headers.set(RESPONSE_ERROR, message);
        return new ResponseEntity<>(headers, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public static ResponseEntity<String> getErrorResponse(String message, HttpStatus status) {
        HttpHeaders headers = new HttpHeaders();
        headers.set(RESPONSE_ERROR, message);
        return new ResponseEntity<>(headers, status);
    }

    public static ResponseEntity<?> getErrorResponse(String message,Object body, HttpStatus status) {
        HttpHeaders headers = new HttpHeaders();
        headers.set(RESPONSE_ERROR, message);
        return new ResponseEntity<>(body,headers, status);
    }

    public static ResponseEntity<?> getOkResponse() {
        return getOkResponse(null);
    }

    public static ResponseEntity<?> getOkResponse(Object body) {
        if (body == null) {
            body = new MncTS();
        }
        return new ResponseEntity<>(body, HttpStatus.OK);
    }
}
