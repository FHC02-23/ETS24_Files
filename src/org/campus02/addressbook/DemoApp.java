package org.campus02.addressbook;

public class DemoApp {
    public static void main(String[] args) {

        AddressbookManager am = new AddressbookManager();
        try {
            am.loadFromCsv("D:\\temp\\ets24\\address.txt", ";");

            System.out.println("am = " + am);
        } catch (AddressLoadException e) {
            throw new RuntimeException(e);
        }

    }
}
