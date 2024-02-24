package com.krtdevops.springbootreactjsdemo.exception;

/**
 * @author KRTDevOps
 */

public class StudentAlreadyExistsException extends RuntimeException {
    public StudentAlreadyExistsException(String message) {
        super(message);
    }
}
