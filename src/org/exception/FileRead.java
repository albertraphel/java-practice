package org.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {

    public static void main(String[] args) {
        try {
            readFile("test.txt");
        } catch(FileNotFoundException e) {
            System.out.println("Error:::" +e.getMessage());
        }
            
    }

    private static void readFile(String fileName) throws FileNotFoundException{
        File f = new File(fileName);
        Scanner s = new Scanner(f);

        while(s.hasNextLine()) {
            System.out.println(s.nextLine());
        }

        s.close();

    }
}
