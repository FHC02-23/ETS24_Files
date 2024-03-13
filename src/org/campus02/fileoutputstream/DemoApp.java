package org.campus02.fileoutputstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoApp {
    public static void main(String[] args) {
        File f = new File("D:\\Temp\\ETS24\\newfile.txt");

        try (FileOutputStream fos = new FileOutputStream(f)){

            String someText = "Some Text";
            for (char c : someText.toCharArray()) {
                fos.write(c);
            }
            fos.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
