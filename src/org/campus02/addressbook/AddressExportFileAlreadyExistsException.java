package org.campus02.addressbook;

public class AddressExportFileAlreadyExistsException extends AddressExportException {

    public AddressExportFileAlreadyExistsException(String message) {
        super(message);
    }

    public AddressExportFileAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }
}
