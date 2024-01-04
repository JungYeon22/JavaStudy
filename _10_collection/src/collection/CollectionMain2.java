package collection;

import java.util.ArrayList;

public class CollectionMain2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("호랑이");
        list.add("사자");
        list.add("호랑이");      // 중복허용, 순서
        list.add("기린");
        for(String data : list){
            System.out.println(data);
        }
        System.out.println("---------------");
        for(int i=0;i < list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
