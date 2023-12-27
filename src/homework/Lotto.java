package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lotto = new int[6];
        int money, random = 0, pageCheck = 0;
        boolean duplicate;
        System.out.print("현금 입력 : ");
        money = sc.nextInt();
        int lottoCnt = money / 1000;

        for(int i=0;i < lottoCnt;i++){
            if(pageCheck%5 == 0) System.out.println();
            // 난수
            lotto = new int[6];
            for(int j=0;j < lotto.length;j++){
                do{
                    duplicate = false;
                    random = (int) (Math.random() * (45) + 1);
                    // 중복 검사
                    for(int k=0;k < j;k++){
                        if(lotto[k] == random){
                            duplicate = true;
                        }
                    }
                }
                while(duplicate);
                lotto[j] = random;
            }
            // 출력
            Arrays.sort(lotto);
            for(int data : lotto){
                System.out.print(data + " ");
            }
            pageCheck++;
            System.out.println();
        }
    }
}

/*
[문제] 로또 프로그램
1~45 사이의 난수를 6개 발생한다.
단, 숫자는 중복이 되어서는 안된다.
1줄당 금액이 천원이다.
오름차순
5줄 생성시 다음 줄 빈칸
[실행결과]
현금 입력 : 3000
    2    4   19   39   43   44
   22   26   33   38   39   42
    5    6    8   25   35   45

현금 입력 : 7000
   2    4   19   39   43   44
   22   26   33   38   39   42
    5    6    8   25   35   45
    3   14   23   30   34   35
   18   20   25   27   32   37

    1   16   32   34   41   42
    5    6   18   30   33   44
 */