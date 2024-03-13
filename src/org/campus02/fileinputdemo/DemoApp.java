package org.campus02.fileinputdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoApp {

    public static void main(String[] args) {

        File f = new File("D:\\temp\\ETS24\\test.txt");

        try (FileInputStream fis = new FileInputStream(f)){
            /*int byteRead = fis.read();
            System.out.println(byteRead);
            char c = (char) byteRead;
            System.out.println(c);*/

            int byteRead;
            while ((byteRead = fis.read()) != -1 /*EOF*/) {
                char c = (char) byteRead;
                System.out.print(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } /*finally {
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }*/


    }
}
