package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PersonSort {
    public static void main(String[] args) {
        String[] arr = {"orange", "apple", "banana", "pear", "peach", "applemango"};

        System.out.print("정렬 전 : ");
        for(String data : arr){
            System.out.print(data + " ");
        }
        System.out.println();

        Arrays.sort(arr);

        System.out.print("정렬 후 : ");
        for(String data : arr){
            System.out.print(data + " ");
        }
        System.out.println();

        //객체 비교
        PersonDTO person1 = new PersonDTO("홍길동", 70);
        PersonDTO person2 = new PersonDTO("프로도", 30);
        PersonDTO person3 = new PersonDTO("라이언", 53);
        ArrayList<PersonDTO> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);

        System.out.print("정렬 전 : ");
        for(PersonDTO data : list){
            System.out.print(data + " ");
        }
        System.out.println();
        // 나이를 기준으로 오름차순
        Collections.sort(list);

        System.out.print("정렬 후 : ");
        for(PersonDTO data : list){
            System.out.print(data + " ");
        }
        System.out.println();



    }




}
