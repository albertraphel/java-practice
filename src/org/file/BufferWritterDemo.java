package org.file;

import java.io.*;

public class BufferWritterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("test.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("100");
        bw.write("albert raphel");
        bw.newLine();
        char ch[] = {'d', 'r', 'l'};
        bw.write(ch);
        bw.flush();
        bw.close();

        FileReader fr = new FileReader("test.txt");
        BufferedReader br = new BufferedReader(fr);

        String s = br.readLine();
        while(s != null){
            System.out.println(s);
            s= br.readLine();
        }
        br.close();
    }
}
