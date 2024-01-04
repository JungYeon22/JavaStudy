package SungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukService {
    private ArrayList<SungJukDTO> list = new ArrayList<SungJukDTO>();

    public void menu(){
        boolean play = true;
        while(play){
            System.out.println();
            System.out.println("------------------");
            System.out.println("\t1.입력");
            System.out.println("\t2.출력");
            System.out.println("\t3.수정");
            System.out.println("\t4.삭제");
            System.out.println("\t5.정렬");
            System.out.println("\t6.종료");
            System.out.println("------------------");

            Scanner scanner = new Scanner(System.in);
            System.out.print("메뉴 번호 입력 : ");
            int num = scanner.nextInt();
            System.out.println("------------------");

            SungJuk sungJuk = null;     // 부모 클래스(인터페이스) 초기화

            switch (num){
                case 1: sungJuk = new SungJukInsert();
                    break;
                case 2: sungJuk = new SungJukPrint();
                    break;
                case 3: sungJuk = new SungJukUpdate();
                    break;
                case 4: sungJuk = new SungJukDelete();
                    break;
                case 5:
                    break;
                case 6: play = false;
                    break;
                default :
                    System.out.println("1 ~ 6중에 선택하세요");
            }
            if(sungJuk != null){
                sungJuk.execute(list);
            }
        }

    }
}
