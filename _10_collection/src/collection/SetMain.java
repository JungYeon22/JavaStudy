package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("호랑이");
        set.add("사자");
        set.add("기린");
        set.add("코끼리");
        set.add("호랑이");

        for (String name : set){
            System.out.println(name);
        }
        System.out.println();


        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
