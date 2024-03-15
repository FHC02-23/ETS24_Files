package org.campus02.addressbook;

public class AddressLoadWrongFormatException extends AddressLoadException {

    public AddressLoadWrongFormatException(String message) {
        super(message);
    }

    public AddressLoadWrongFormatException(String message, Throwable cause) {
        super(message, cause);
    }
}
