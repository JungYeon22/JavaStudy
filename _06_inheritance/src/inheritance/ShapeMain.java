package inheritance;

import java.util.Scanner;

abstract class ShapeTest{
    protected double area;
    protected Scanner scanner = new Scanner(System.in);

    public ShapeTest(){
        System.out.println("ShapeTest 기본 생성자");
    }
    public void calcArea(){
        System.out.println("도형을 계산합니다.");
    }

    public void displayArea(){
        System.out.println("도형을 출력합니다.");
    }

}
//------------------------------------------------------
class SamTest extends ShapeTest{
    protected int base, height;

    public SamTest() {
        System.out.println("SamTest 기본 생성자");
        System.out.print("밑변 : ");
        base = scanner.nextInt();
        System.out.print("높이 : ");
        height = scanner.nextInt();
    }
    @Override
    public void calcArea(){
        area = base * height / 2.0;
    }
    @Override
    public void displayArea(){
        System.out.println("삼각형 넓이 : " + area);
    }

}
//------------------------------------------------------
class SaTest extends ShapeTest{
    protected int width, height;

    public SaTest() {
        System.out.println("SaTest 기본 생성자");
        System.out.print("가로 : ");
        width = scanner.nextInt();
        System.out.print("높이 : ");
        height = scanner.nextInt();
    }
    @Override
    public void calcArea(){
        area = width * height;
    }
    @Override
    public void displayArea(){
        System.out.println("사각형 넓이 : " + area);
    }

}
//------------------------------------------------------
class SadariTest extends ShapeTest{
    protected int top, bottom, height;

    public SadariTest() {
        System.out.println("Sadari 기본 생성자");
        System.out.print("윗변 : ");
        top = scanner.nextInt();
        System.out.print("밑변 : ");
        bottom = scanner.nextInt();
        System.out.print("높이 : ");
        height = scanner.nextInt();
    }
    @Override
    public void calcArea(){
        area = (top + bottom) * height;
    }
    @Override
    public void displayArea(){
        System.out.println("사다리꼴 넓이 : " + area);
    }
}
//------------------------------------------------------
public class ShapeMain {
    public static void main(String[] args) {
//        SamTest sam = new SamTest();
//        sam.calcArea();
//        sam.displayArea();
//        System.out.println();
//
//        SaTest sa = new SaTest();
//        sa.calcArea();
//        sa.displayArea();
//        System.out.println();
//
//        SadariTest sadari = new SadariTest();
//        sadari.calcArea();
//        sadari.displayArea();
//        System.out.println();

        /*
        자식 클래스에 의해서 ShapeTest(부모)클래스가 계속 생성됨
        객체가 많아질수록 너무 많은 변수(객체를 가르키는 변수이름 ex)sam , sa, sadari)
        결합도 낮추기, 다형성 -> 부모가 자식을 참조가능한 이유 /
        부모 = 자식 타입, 만능 리모컨이 필요한거임 (클래스 수가 많을 때)
         */
        ShapeTest shape;
        shape = new SamTest();
        shape.calcArea();
        shape.displayArea();
        System.out.println();

        shape = new SaTest();
        shape.calcArea();
        shape.displayArea();
        System.out.println();

        shape = new SadariTest();
        shape.calcArea();
        shape.displayArea();
        System.out.println();

    }
}
