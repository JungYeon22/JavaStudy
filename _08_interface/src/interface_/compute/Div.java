package interface_.compute;

import java.util.Scanner;

public class Div implements Compute{

    private double x, y;

    public Div(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("x의 값 입력 : ");
        x = scanner.nextDouble();
        System.out.print("y의 값 입력 : ");
        y = scanner.nextDouble();
    }

    @Override
    public void display() {
        System.out.println(x + " / " + y + " = " + (x/y));
    }
}
