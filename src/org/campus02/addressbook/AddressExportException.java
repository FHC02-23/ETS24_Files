package org.campus02.addressbook;

import java.io.IOException;

public class AddressExportException extends Exception {
    public AddressExportException(String message) {
        super(message);
    }

    public AddressExportException(String message, Throwable cause) {
        super(message, cause);
    }
}
