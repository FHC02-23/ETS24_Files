package org.campus02.textinput;

import java.io.*;
import java.util.Arrays;

public class DemoApp {
    public static void main(String[] args) {

        File f = new File("D:\\temp\\ETS24\\test.csv");

        try (FileReader fileReader = new FileReader(f);
             BufferedReader br = new BufferedReader(fileReader)) {

            String line;

            while ((line = br.readLine()) != null) {

                String[] columns = line.split(";");

                System.out.println(Arrays.toString(columns));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
