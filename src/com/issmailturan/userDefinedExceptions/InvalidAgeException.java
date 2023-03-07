package com.issmailturan.userDefinedExceptions;

public class InvalidAgeException extends Exception {

    public InvalidAgeException(String errorMessage){
        super(errorMessage);
    }

}
