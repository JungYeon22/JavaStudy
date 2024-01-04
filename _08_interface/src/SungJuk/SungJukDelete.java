package SungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukDelete implements SungJuk{
    @Override
    public void execute(ArrayList<SungJukDTO> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("삭제할 이름 입력 : ");
        String inputName = scanner.next();

        int i =0, count = 0;
        while(i < list.size()){
            if(list.get(i).getName().equals(inputName)){
                list.remove(i);
                count++;
                continue;
            }
            i++;
        }
        if(count == 0){
            System.out.println("회원 정보가 없습니다.");
        }
        else {
            System.out.println(count + "건의 항목을 삭제하였습니다.");
        }
    }
}
/*
10. SungJukDelete.java
- 이름을 입력하여 없는 이름이면 "회원의 정보가 없습니다" 출력하시오
- 똑같은 이름이 있으면 모두 삭제한다.

삭제할 이름 입력 : 천사
회원의 정보가 없습니다

또는

x건의 항목을 삭제하였습니다.
 */