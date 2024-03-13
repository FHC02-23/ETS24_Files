package org.campus02.objectoutputstream;

import java.io.*;
import java.util.ArrayList;

public class IkeaInputStore {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        File f = new File("D:\\Temp\\ETS24\\tablestore.txt");
        FileInputStream fis = new FileInputStream(f);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

        Integer i = (Integer) ois.readObject();
        System.out.println("i = " + i);

        Table t1 = (Table) ois.readObject();
        System.out.println("t1 = " + t1);
        Table t2 = (Table) ois.readObject();
        System.out.println("t2 = " + t2);
        Table t3 = (Table) ois.readObject();
        System.out.println("t3 = " + t3);
        Table t4 = (Table) ois.readObject();
        System.out.println("t4 = " + t4);


    }
}
