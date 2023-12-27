package array;

import java.util.Scanner;

/*
1~100 난수를 발생하여 배열에 저장 후 데이터를 출력하고 최대값, 최소값을 구하시오.

[실행결과]
35 57 22 13 23 ~~~ 30
최대값 = ??
최소값 = ??
 */
public class Array04 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        System.out.println("[문제] 1~100 난수를 발생하여 배열에 저장 후 데이터를 출력하고 최대값, 최소값을 구하시오.");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (100) + 1);
            System.out.print(arr[i] + " ");
            if (max < arr[i]) max = arr[i];
            if (min > arr[i]) min = arr[i];
        }
        System.out.println();
        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
    }
}

