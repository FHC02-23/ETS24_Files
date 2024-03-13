package org.campus02.objectoutputstream;

import java.io.*;

public class IkeaOnlineStore {

    public static void main(String[] args) throws IOException {

        Table t1 = new Table("Maxö", 180, 90, 12);
        Table t2 = new Table("Sandsberg", 160, 80, 8);
        Table t3 = new Table("Ingö", 170, 85, 10);

        File f = new File("D:\\Temp\\ETS24\\tablestore.txt");
        FileOutputStream fos = new FileOutputStream(f);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject((Integer)3);
        oos.writeObject(t1);
        oos.writeObject(t2);
        oos.writeObject(t3);
        oos.writeObject(null);

        oos.flush();
    }
}
