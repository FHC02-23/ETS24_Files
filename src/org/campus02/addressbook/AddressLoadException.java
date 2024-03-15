package org.campus02.addressbook;

import java.io.FileNotFoundException;

public class AddressLoadException extends Exception {

    public AddressLoadException(String message) {
        super(message);
    }

    public AddressLoadException(String message, Throwable cause) {
        super(message, cause);
    }
}
