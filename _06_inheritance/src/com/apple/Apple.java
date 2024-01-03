package com.apple;

import com.zoo.Zoo;

public class Apple {

    public static void main(String[] args) {
        System.out.println("빨간 사과");

        //Zoo클래스에서 tiger()호출
        Zoo zoo = new Zoo();
        zoo.tiger();
//        zoo.elephant();  - error

        System.out.println();


    }
}
