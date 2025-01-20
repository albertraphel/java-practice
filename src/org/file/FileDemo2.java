package org.file;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        File f = new File("testfolder");
        f.mkdir();
        File f2 = new File("testfolder", "abc.txt");
        f2.createNewFile();
    }
}
