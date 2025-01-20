package org.file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("cricket.txt");
        fw.write(99);
        fw.write("\n");
        fw.write("albert raphel\n  abc");
        char [] ch = {'x', 'y', 'z'};
        fw.write(ch);
        fw.flush();
        fw.close();
    }
}
