package org.campus02.starship;

public class TransporterMalFunctionException extends Exception {

    public TransporterMalFunctionException(String message) {
        super(message);
    }

    public TransporterMalFunctionException(String message, Throwable cause) {
        super(message, cause);
    }
}
