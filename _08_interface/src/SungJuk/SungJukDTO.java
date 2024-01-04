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
/*
1. 필드로 번호(no), 이름(name), 국어(kor), 영어(eng), 수학(math), 총점(tot), 평균(avg) 잡는다
2. 번호 입력할 때 중복해서 넣지 않는다.
3. 1인분의 클래스로 ~DTO.java 사용한다.
4. ~DTO에서 toString() Override한다.
5. 입력, 출력, 수정, 삭제, 소트하는 클래스는 반드시 interface를 상속받는다.
6. menu() 작성한다.
- 번호, 이름, 국어, 영어, 수학를 입력하여 총점과 평균을 계산한다.

번호 입력 :
이름 입력 :
국어 입력 :
영어 입력 :
수학 입력 :

입력되었습니다
 */