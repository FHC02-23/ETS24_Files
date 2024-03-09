package org.campus02.fileio;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {

        File file = new File("D:\\temp\\sub-ordner\\");

        System.out.println("file.isFile() = " + file.isFile());
        System.out.println("file.isDirectory() = " + file.isDirectory());
        
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println("f.getName() + \", Length: \" + f.length() = " + f.getName() + ", Length: " + f.length());
        }


    }
}
