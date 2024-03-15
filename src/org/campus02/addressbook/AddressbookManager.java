package org.campus02.addressbook;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class AddressbookManager {

    private ArrayList<Address> addresses = new ArrayList<>();

    public void add(Address a) {
        addresses.add(a);
    }

    @Override
    public String toString() {
        return "AddressbookManager{" +
                "addresses=" + addresses +
                '}';
    }

    public void loadFromCsv(String path, String separator)
            throws AddressLoadException {

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] colums = line.split(separator);
                if (colums.length != 4)
                    throw new AddressLoadWrongFormatException("Error in line, != 4 columns: " + line);

                Address a = new Address(colums[0], colums[1], colums[2], colums[3]);
                add(a);
            }
        } catch (IOException e) {
            throw new AddressLoadException("Fehler beim Laden von " + path, e);
        }
    }

    public void exportToCsv(String path, String separator ) throws AddressExportException {
        File f = new File(path);
        if (f.exists())
            throw new AddressExportFileAlreadyExistsException(path);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {

            for (Address a : addresses) {
                String line = a.getFirstname() + separator + a.getLastname() + separator
                                + a.getMobileNumber() + separator + a.geteMail();
                bw.write(line);
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            throw new AddressExportException("fehler bei " + path, e);
        }
    }
}
