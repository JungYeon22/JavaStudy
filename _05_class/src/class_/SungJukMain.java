package class_;

import java.util.Scanner;

public class SungJukMain {
    public static void main(String[] args) {
        SungJuk sungJuk = new SungJuk();

        sungJuk.setData("홍길동", 90, 95, 100);
        sungJuk.calc();
        System.out.println("-------------------------------------");
        System.out.println("이름\t\t국어\t영어\t수학\t총점\t평균\t학점");
        System.out.println("-------------------------------------");
        System.out.println(sungJuk.getName() + "\t" +
                sungJuk.getKor() + "\t" + sungJuk.getEng() + "\t" + sungJuk.getMath() + "\t" +
                sungJuk.getTotal() + "\t" + String.format("%4.2f", sungJuk.getAvg()) + "\t" + sungJuk.getGrade());


    }
}
/*
[문제] 성적처리
- 평균은 소수이하 2째짜리까지 처리한다.

클래스명 : SungJuk
필드 : name, kor, eng, math, tot, avg, grade
메소드 : setData(이름, 국어, 영어, 수학)
       calc() - 총점, 평균, 학점 계산
	   getName()
	   getKor()
	   getEng()
	   getMath()
       getTot()
       getAvg()
       getGrade()

클래스명 : SungJukMain

[실행결과]
----------------------------------------------------
이름		국어		영어		수학		총점		평균		학점
----------------------------------------------------
홍길동	90		95		100
 */