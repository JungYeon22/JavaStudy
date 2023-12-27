package array;

import java.util.Scanner;

/*
주차장 관리 프로그램
**************
   1. 입차
   2. 출차
   3. 리스트
   4. 종료
**************
  메뉴 :

1번인 경우
위치 입력 : 3
3위치에 입차 / 이미 주차되어있습니다

2번인 경우
위치 입력 : 4
4위치에 출차 / 주차되어 있지않습니다

3번인 경우
1위치 : true
2위치 : false
3위치 : true
4위치 : false
5위치 : false
*/
public class Array05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] arr = new boolean[5];
        System.out.println("**********************");
        System.out.println("1. 입차");
        System.out.println("2. 출차");
        System.out.println("3. 리스트");
        System.out.println("4. 종료");
        System.out.println("**********************");

        while(true) {
            System.out.println();
            System.out.print("메뉴 : ");
            int input = sc.nextInt();
            if(input == 1){
                while(true){
                    System.out.print("위치 입력 : ");
                    int loc = sc.nextInt();
                    if(arr[loc-1]) System.out.println("이미 주차되어있습니다.");
                    else {
                        arr[loc-1] = true;
                        System.out.println(loc + "위치에 입차");
                        break;
                    }
                }
            }
            if(input == 2) {
                while(true){
                    System.out.print("위치 입력: ");
                    int loc = sc.nextInt();
                    if(!arr[loc-1]) System.out.println("주차되어 있지 않습니다.");
                    else {
                        arr[loc-1] = false;
                        System.out.println(loc + "위치에 출차");
                        break;
                    }
                }
            }
            if(input == 3) {
                for(int i=1;i <= 5;i++){
                    System.out.println(i + "위치 : " + arr[i-1]);
                }
            }
            if(input == 4) {
                break;
            }
        }
    }
}
