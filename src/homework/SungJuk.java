package homework;

import java.util.Scanner;

public class SungJuk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("인원수 : ");
        int cnt = sc.nextInt();

        String[][] subject = new String[cnt][];
        int[][] jumsu = new int[cnt][];
        String[] name = new String[cnt];      //이름
        double[] avg = new double[cnt];


        System.out.println();
        //입력받기
        for(int i=0;i < cnt;i++){             // 2번
            System.out.print("이름 입력 : ");
            name[i] = sc.next();                // 이름
            System.out.print("과목수 입력 : ");
            int subjectCnt = sc.nextInt();
            subject[i] = new String[subjectCnt+1];
            jumsu[i] = new int[subjectCnt+1];       // 총점도 담을 공간 확보
            for(int j=0;j < subjectCnt;j++){
                System.out.print("과목명 입력 : ");
                subject[i][j] = sc.next();
            }
            subject[i][subjectCnt] = "총점";

            for(int j=0;j < subjectCnt;j++){
                System.out.print(subject[i][j] + "점수 입력 : ");
                jumsu[i][j] = sc.nextInt();
            }
            System.out.println("----------------------------------");
        }

        // 총점 & 평균 구하기
        for(int i=0;i < cnt;i++){
            int sum = 0;                    // 총점
            for(int j=0;j < jumsu[i].length-1;j++){
                sum += jumsu[i][j];
            }
            jumsu[i][jumsu[i].length-1] = sum;
            avg[i] = (double) sum / (jumsu[i].length-1);
        }

        //출력
        for(int i=0;i < cnt;i++){
            System.out.print("이름\t");
            for(int j=0;j < subject[i].length;j++){
                String s = subject[i][j];
                System.out.print(String.format("%5s", s));
            }
            System.out.println("  평균");

            // 값
            System.out.print(String.format(name[i]) + "  ");
            for(int j=0;j < jumsu[i].length;j++){
                System.out.print(String.format("%6d", jumsu[i][j]));
            }
            System.out.println("  "+String.format("%6.2f", avg[i]));
            System.out.println();

        }

    }
}

/*
[문제] 성적 계산
인원수를 입력하여 인원수만큼 데이터를 입력받고 총점과 평균을 구하시오
평균은 소수이하 2째자리까지 출력

[실행결과]
인원수 : 2 (cnt)

이름입력 : 홍길동 (name)
과목수 입력 : 2   (subjectCnt)
과목명 입력 : 국어 (subject)
과목명 입력 : 영어
국어 점수 입력 : 95 (jumsu)
영어 점수 입력 : 100
---------------------
이름입력 : 이기자
과목수 입력 : 3
과목명 입력 : 국어
과목명 입력 : 영어
과목명 입력 : 과학
국어 점수 입력 : 95
영어 점수 입력 : 100
과학 점수 입력 : 90
---------------------

이름     국어	  영어   총점     평균
홍길동    95	  100   xxx	  xx.xx

이름		국어  영어   과학    총점      평균
이기자	95   100   90	 xxx      xx.xx
 */