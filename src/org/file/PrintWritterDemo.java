package org.file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWritterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("pqr.txt");
        PrintWriter pw = new PrintWriter(fw);
        pw.write(101);
        pw.println(101);
        pw.println("abc xyz");
        pw.println("test");
        pw.println(true);
        pw.flush();
        pw.close();
    }
}
