package com.junit.easymock.app.JunitAndEasyMockApp.customException;

public class NoDataFoundException extends RuntimeException {
    public NoDataFoundException() {
    }

    public NoDataFoundException(String message) {
        super(message);
    }

}
