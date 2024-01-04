package array;

import java.util.Scanner;
/*
배열 크기 입력 : 3
arr[0] 입력 : 25
arr[1] 입력 : 12
arr[2] 입력 : 37

25 12 37
 */
public class Array03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열 크기 입력 : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i < size;i++){
            System.out.print("arr[" + i + "] 입력 : ");
            arr[i] = sc.nextInt();
        }
        int sum =0;
        for(int data : arr){
            System.out.print(data + " ");
            sum += data;
        }
        System.out.println();
        System.out.println("합 : " + sum);
    }
}
