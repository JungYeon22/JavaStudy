package com.zoo.safari;

import com.zoo.Zoo;

public class Safari extends Zoo{
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.tiger();
//        zoo.giraffe(); - error  ********** => 부모만 new 하면 메모리에 부모 클래스인 Zoo.class만 잡힌다. 그래서 찾을 수 없음
//        zoo.elephant();  - error  다른 페키지
        Safari safari = new Safari();
        safari.giraffe();

    }

}
