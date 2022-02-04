package com.producter.demo.exception;

import javax.validation.ConstraintViolationException;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;

import graphql.GraphQLException;
import graphql.kickstart.spring.error.ThrowableGraphQLError;

@Component
public class GraphQLExceptionHandler {
    @ExceptionHandler({ GraphQLException.class, ConstraintViolationException.class })
    public ThrowableGraphQLError handleException(Exception ex) {
        return new ThrowableGraphQLError(ex);
    }

    @ExceptionHandler(RuntimeException.class)
    public ThrowableGraphQLError handleRuntimeException(RuntimeException ex) {
        return new ThrowableGraphQLError(ex);
    }
}
