package org.campus02.addressbook;

public class DemoApp {
    public static void main(String[] args) {

        AddressbookManager am = new AddressbookManager();
        try {
            am.loadFromCsv("D:\\temp\\ets24\\address.txt", ";");

            System.out.println("am = " + am);

            am.exportToCsv("D:\\temp\\ets24\\address1.txt", ";");
        } catch (AddressLoadException e) {
            throw new RuntimeException(e);
        } catch (AddressExportException e) {
            throw new RuntimeException(e);
        }

    }
}
