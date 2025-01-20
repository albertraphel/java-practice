package org.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        File f = new File("test.txt");
        System.out.println(f.exists());
        try {
            f.createNewFile();
            System.out.println(f.exists());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
