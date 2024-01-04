package interface_.compute;

import java.util.Scanner;

public class Sub implements Compute{
    private int x, y;

    public Sub(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("x의 값 입력 : ");
        x = scanner.nextInt();
        System.out.print("y의 값 입력 : ");
        y = scanner.nextInt();
    }

    @Override
    public void display() {
        System.out.println(x + " - " + y + " = " + (x-y));
    }
}
