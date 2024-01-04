package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class CollectionMain {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add("호랑이");
        collection.add("사자");
        collection.add("호랑이");      // 중복허용, 순서
        collection.add(25);
        collection.add(34.1);
        collection.add("기린");

        Iterator iterator = collection.iterator();       // 지정장 역할 iterator
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
