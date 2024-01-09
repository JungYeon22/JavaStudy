package exception;

import java.util.Scanner;

public class ExceptionMain2 {
    private int x, y;
    void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("x 입력 : ");
        x = scanner.nextInt();
        System.out.print("y 입력 : ");
        y = scanner.nextInt();
    }
    void output(){
        int mul = 1;
        if(y >= 0){
            for(int i=0;i < y;i++){
                mul *= x;
            }
            System.out.println(x + "의 " + y + "승은 " + mul);
        }else {
//            System.out.println("y는 0보다 크거나 같아야 한다.");
            try {
//                throw new Exception("y는 0보다 크거나 같아야 한다.");
                throw new MakeException("y는 0보다 크거나 같아야 한다.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        ExceptionMain2 exceptionMain2 = new ExceptionMain2();
        exceptionMain2.input();
        exceptionMain2.output();

    }
}

/*
[문제] 제곱 연산
- x의 y승을 처리 한다.

[실행결과]
x 입력 : 2
y 입력 : 10			input()
----------------------------------
2의 10승은 xxx        output()
 */
