package io;

import java.io.*;

public class ObjectMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        PersonDTO dto = new PersonDTO("홍길동", 25,185.5);

        // 파일로 저장
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("result2.txt"));
        oos.writeObject(dto);
        oos.close();

        // 파일로부터 읽기
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("result2.txt"));
        PersonDTO personDTO = (PersonDTO) ois.readObject();     // 자식클래스는 부모클래스를 맞춰줄 수 없음 => 형변환(캐스팅)
        System.out.println("이름 : "+ personDTO.getName());
        System.out.println("나이 : "+ personDTO.getAge());
        System.out.println("키 : "+ personDTO.getHeight());
        ois.close();


    }

}
