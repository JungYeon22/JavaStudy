package io;

import java.io.*;

public class DataStream {
    public static void main(String[] args) throws IOException {
        // 파일로 출력
//        DataOutputStream bos = new DataOutputStream(new FileOutputStream("result.txt"));

        FileOutputStream fos = new FileOutputStream("result.txt");
        DataOutputStream bos = new DataOutputStream(fos);

        bos.writeUTF("홍길동");
        bos.writeInt(24);
        bos.writeDouble(185.4);

        bos.close();

        // 파일로부터 입력
        DataInputStream dis = new DataInputStream(new FileInputStream("result.txt"));
        String name = dis.readUTF();
        int age = dis.readInt();
        double height = dis.readDouble();

        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("키 : " + height);

        dis.close();


    }
}
