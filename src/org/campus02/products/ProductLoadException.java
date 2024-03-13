package org.campus02.products;

import java.io.FileNotFoundException;

public class ProductLoadException extends Exception {
    public ProductLoadException(String path, Throwable e) {
        super(path, e);
    }
}
