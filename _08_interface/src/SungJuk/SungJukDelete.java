package SungJuk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SungJukDelete implements SungJuk{
    @Override
    public void execute(ArrayList<SungJukDTO> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("삭제할 이름 입력 : ");
        String inputName = scanner.next();

        int count = 0;
//        for(int i =0;i < list.size();i++){
//            if(list.get(i).getName().equals(inputName)){
//                list.remove(i);
//                count++;
//                i--;
//            }
//        }
        Iterator<SungJukDTO> iterator = list.iterator();
        while(iterator.hasNext()){
            // iterator.next() 현재위치의 항목을 꺼내서 저장후 다음 항목으로 이동
            if(iterator.next().getName().equals(inputName)){
                iterator.remove();      //현재 가르키고 있는 것을 지우는 것이 아니라, 그전에 보관했던 항목을 제거
                count++;
            }
        }

        if(count == 0){
            System.out.println("회원 정보가 없습니다.");
        }
        else {
            System.out.println(count + "건의 항목을 삭제하였습니다.");
        }
    }
}
