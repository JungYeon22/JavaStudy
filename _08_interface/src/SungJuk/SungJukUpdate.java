package SungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukUpdate implements SungJuk{
    @Override
    public void execute(ArrayList<SungJukDTO> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("수정 번호 입력 : ");
        int inputNo = scanner.nextInt();
        int i = 0;
        for(i=0;i < list.size();i++){
            if(list.get(i).getNo() == inputNo){
                list.get(i).toString();
                System.out.print("수정 할 이름 입력 : ");
                String name = scanner.next();
                System.out.print("수정 할 국어 입력 : ");
                int kor = scanner.nextInt();
                System.out.print("수정 할 영어 입력 : ");
                int eng = scanner.nextInt();
                System.out.print("수정 할 수학 입력 : ");
                int math = scanner.nextInt();
                list.get(i).update(name, kor, eng, math);
                break;
            }
        }
        if(i == list.size()){
            System.out.println("잘못된 번호 입니다.");
        }else {
            System.out.println("수정하였습니다.");
        }
    }
}
/*
9. SungJukUpdate.java
- 없는 번호가 입력되면 "잘못된 번호 입니다." 라고 출력한다.
- 있는 번호가 입력되면 번호에 해당하는 데이틀 출력 후 수정한다.
  수정한 후에는 총점과 평균을 재계산해야 한다.
번호 입력 :
잘못된 번호 입니다.

또는

번호	이름	국어	영어	수학 	총점	평균

수정 할 이름 입력 :
수정 할 국어 입력 :
수정 할 영어 입력 :
수정 할 수학 입력 :

수정하였습니다.
 */