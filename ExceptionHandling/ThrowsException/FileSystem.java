package ExceptionHandling.ThrowsException;

import java.io.*;


import java.io.FileInputStream;

class ReadAndWrite {
    void read() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("D:/brajesh.text");
    }

    void saveFile() throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("D:/brajesh.text");

    }
}


public class FileSystem {
    public static void main(String[] args) {
        ReadAndWrite rw = new ReadAndWrite();

        try {
            rw.read();
            System.out.println("Write File Exception");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Hello World");
    }
}
