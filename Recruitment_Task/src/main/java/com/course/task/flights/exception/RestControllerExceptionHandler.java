package com.course.task.flights.exception;

import com.course.task.flights.models.response.ExceptionResponse;
import com.course.task.flights.models.response.Response;
import javassist.NotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class RestControllerExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(value = NotFoundException.class)
    public ResponseEntity handleNotFoundException(Exception exception, WebRequest request) {
        ExceptionResponse bodyOfResponse = new ExceptionResponse(Response.MessageType.WARNING, exception.getMessage(),
                "resource has not been found", HttpStatus.NOT_FOUND);
        return handleExceptionInternal(exception, bodyOfResponse, new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }

    @ExceptionHandler(value = NotEnoughSeats.class)
    public ResponseEntity handleNotEnoughSeats(Exception exception, WebRequest request) {
        ExceptionResponse bodyOfResponse = new ExceptionResponse(Response.MessageType.ERROR, exception.getMessage(),
                "There is not enough free seats in current flight", HttpStatus.FORBIDDEN);
        return handleExceptionInternal(exception, bodyOfResponse, new HttpHeaders(), HttpStatus.FORBIDDEN, request);
    }
}
