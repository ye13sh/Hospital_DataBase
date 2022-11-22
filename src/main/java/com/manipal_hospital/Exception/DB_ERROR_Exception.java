package com.manipal_hospital.Exception;

public class DB_ERROR_Exception extends Exception{
    public DB_ERROR_Exception() {
        super();
    }

    public DB_ERROR_Exception(String message) {
        super(message);
    }

    public DB_ERROR_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public DB_ERROR_Exception(Throwable cause) {
        super(cause);
    }
}
