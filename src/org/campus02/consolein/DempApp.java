package org.campus02.consolein;

import java.io.FileOutputStream;
import java.io.IOException;

public class DempApp {
    public static void main(String[] args) {

        int c;
        try (FileOutputStream fos = new FileOutputStream("D:\\Temp\\ETS24\\read-from-console.txt")) {
            while ((c = System.in.read()) != 'x') {
               fos.write(c);
            }
            fos.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
