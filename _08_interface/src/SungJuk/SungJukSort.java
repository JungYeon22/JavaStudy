package SungJuk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SungJukSort implements SungJuk{

    @Override
    public void execute(ArrayList<SungJukDTO> list) {
        int num = sortMenu();           // 메뉴 번호
        if(num == 1) Collections.sort(list);
        if(num == 2) System.out.println("준비중,,");
        if(num == 3) return;
    }

    private int sortMenu() {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while(true){
            System.out.println();
            System.out.println("1. 총점으로 내림차순");
            System.out.println("2. 이름으로 오름차순");
            System.out.println("3. 이전 메뉴");
            System.out.println("---------------------------");
            System.out.print("번호 입력 : ");

            num = scanner.nextInt();
            if(num > 0 && num <= 3){
                break;
            }else {
                System.out.println("1~3 사이의 번호를 입력해 주세요.");
            }
        }
        return num;
    }
}
/*
- menu() 작성(단, 이름으로 오름차순 메뉴는 출력하되 소스 작성 x)
1. 총점으로 내림차순
2. 이름으로 오름차순 -- 메뉴만 출력
3. 이전 메뉴
 */
