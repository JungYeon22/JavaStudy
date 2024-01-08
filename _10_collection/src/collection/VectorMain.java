package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorMain {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        System.out.println("벡터 크기 : " + v.size());
        System.out.println("벡터 용량 : " + v.capacity());  // 기본 용량 10, 10개씩 증가
        System.out.println();

        System.out.println("항목 추가");
        for(int i=1;i <= 10;i++){
            v.add(i + "");
            System.out.print(v.get(i-1) + "   ");     // index는 0부터 시작
        }
        System.out.println();
        System.out.println("벡터 크기 : " + v.size());      // 10
        System.out.println("벡터 용량 : " + v.capacity());  // 10
        System.out.println();

        System.out.println("항목 1개 추가");
        v.addElement(5 + "");
        System.out.println("벡터 크기 : " + v.size());      // 11
        System.out.println("벡터 용량 : " + v.capacity());  // 20
        System.out.println();

        for(int i=0;i <= 10;i++){
            System.out.print(v.get(i) + "   ");     // index는 0부터 시작
        }

        System.out.println();
        System.out.println("마지막 항목 삭제");
        v.remove(10);      // 앞에서부터 찾아서 5를 제거


        Iterator<String> iterator = v.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + "   ");
        }
        System.out.println();
    }
}
