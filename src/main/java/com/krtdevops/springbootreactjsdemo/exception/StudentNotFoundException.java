package com.krtdevops.springbootreactjsdemo.exception;

/**
 * @author KRTDevOps
 */

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String message) {
        super(message);
    }
}
