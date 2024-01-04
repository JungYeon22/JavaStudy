package SungJuk;

import java.util.Scanner;

public class SungJukDTO {
    private int no;
    private String name;
    private int kor, eng, math, tot;
    private double avg;

    public SungJukDTO() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("번호 입력 : ");
        this.no = scanner.nextInt();
        System.out.print("이름 입력 : ");
        this.name = scanner.next();
        System.out.print("국어 입력 : ");
        this.kor = scanner.nextInt();
        System.out.print("영어 입력 : ");
        this.eng = scanner.nextInt();
        System.out.print("수학 입력 : ");
        this.math = scanner.nextInt();
        calc();
    }
    private void calc() {
        tot = kor + eng + math;
        avg = tot / 3.0;
    }

    @Override
    public String toString() {
        return no + "\t\t" + name + "\t\t" + kor + "\t\t" + eng + "\t\t" + math + "\t\t" + tot + "\t\t"
                + String.format("%.2f",avg);
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public void update(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        calc();
    }
}
