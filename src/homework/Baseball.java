package homework;

import java.io.IOException;
import java.util.Scanner;

public class Baseball {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] com = new int[3];
        int[] user = new int[3];

        // 게임 실행 여부 확인
        while(true){
            System.out.print("게임을 실행하시겠습니까(Y/N) : ");
            String start = sc.next();
            if(start.equals("y") || start.equals("Y")){
                break;
            }
            else if(start.equals("n") || start.equals("N")){
                System.out.println("프로그램을 종료합니다.");
                return;
            }
        }
        // 컴퓨터 난수 생성
        for(int i=0;i < com.length;i++){
            com[i] = (int)(Math.random() * (9) + 1);
            // 중복 제거
            for(int j=0;j < i;j++){
                if(com[j] == com[i]) {
                    i--;
                    break;
                }
            }
        }
        for(int data : com) System.out.print(data + " ");
        System.out.println();


        System.out.println("게임을 시작합니다.\n");

        while(true){
            // user값 넣기
            System.out.print("숫자 입력 : ");
            for(int i=0;i < user.length;i++){
                user[i] = System.in.read() - '0';
            }
            System.in.read();
//            int input = sc.nextInt();
//            user[0] = input / 100;
//            user[1] = input % 100 / 10;
//            user[2] = input % 10;

            // 비교
            int strike = 0, ball = 0;

            for(int i=0;i < user.length;i++){
                // user[i] 비교 com과 비교
                for(int j=0;j < com.length;j++){
                    if(user[i] == com[j]){
                        if(i == j) strike++;
                        if(i != j) ball++;
                    }
                }
            }
            System.out.println(strike + "스트라이크 " + ball + "볼\n");

            if(strike == 3) break;
        }
        System.out.println("프로그램을 종료합니다.");

    }
}

/*
[문제] 야구게임
크기가 3개인 정수형 배열을 잡고 1~9사이의 난수를 발생한다
발생한 수를 맞추는 게임
중복은 제거한다

[실행결과]
게임을 실행하시겠습니까(Y/N) : w
게임을 실행하시겠습니까(Y/N) : u
게임을 실행하시겠습니까(Y/N) : y

게임을 시작합니다

숫자입력 : 123
0스트라이크 0볼

숫자입력 : 567
0스트라이크 2볼

숫자입력 : 758
1스트라이크 2볼
...

숫자입력 : 785
3스트라이크 0볼

프로그램을 종료합니다.
 */
