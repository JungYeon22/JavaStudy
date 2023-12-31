package homework;

import java.util.HashMap;
import java.util.Map;

public class CharCount {
    public static void main(String[] args) {
        int[] arr = new int[50];
        int[] count = new int[26];  // A ~ Z  26개
        int random;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            // 난수 생성 & 저장
            random = (int) (Math.random() * (90 - 65 + 1) + 65);
            arr[i] = random;

            map.put((char) random, 0);
            // 출력
            if (i % 10 == 0 && i != 0) System.out.println();
            System.out.print((char) arr[i] + " ");
        }

        System.out.println("\n");

        // 각 문자 개수 계산
        for(int i=0;i < arr.length;i++){
            int num = arr[i] - 'A';
            count[num]++;
        }
        // 각 문자 개수 출력
        for(int i=0;i < count.length;i++){
            System.out.println((char) (i+'A') + " : " + count[i]);
        }


    }
}
/*
[문제] 크기가 50개인 문자배열을 잡아서 65~90사이의 난수를 발생하여 저장 후 출력하시오
- 1줄에 10개씩 출력
- A의 개수? B의 개수? C의 개수? ~~~ Z의 개수 ?

[실행결과]
D F A G H I J K L T
O P W E R F V A S B
P Y R O L E E Z L I
F E U Z T U P P P A
S P G B F F O W J C

A : 2
B : 3
...
X : 0
Y : 1
Z : 0
 */
