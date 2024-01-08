package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStream {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.txt"));

        // 한 문자씩 읽는다.(int형으로)
//        int data = bis.read();      // 다 읽으면 -1을 반환
        int data = 0;
        while( (data = bis.read()) != -1){
            System.out.print((char) data);
        }
        System.out.println();
        bis.close();


    }
}
