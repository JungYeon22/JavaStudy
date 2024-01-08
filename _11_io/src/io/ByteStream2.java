package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream2 {
    public static void main(String[] args) throws IOException {
        // 파일을 한번에 읽기
        File file = new File("data.txt");
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));

        int size = (int) file.length();

        // 파일 크기만큼 배열을 잡는다.
        byte[] arr = new byte[size];

        //파일 읽기
        bis.read(arr, 0, size);     // 전부 읽어서 arr 배열에 넣는다.

        System.out.println(new String(arr));        // byte[] -> String 변환

        bis.close();



    }
}
