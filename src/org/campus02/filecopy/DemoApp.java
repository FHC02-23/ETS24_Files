package org.campus02.filecopy;

import java.io.*;

public class DemoApp {

    public static void main(String[] args) {

        try (BufferedInputStream fis = new BufferedInputStream(new FileInputStream("D:\\temp\\ets24\\intellij.exe"));
             BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream("D:\\temp\\ets24\\intellij-1.exe"))
            ){

            int countBytes = 0;

            int byteRead;
            while ((byteRead = fis.read())!= -1){

                fos.write(byteRead);

                countBytes++;
                if (countBytes % (1024*1024) == 0)
                    System.out.println("1mb..");
            }

            fos.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
