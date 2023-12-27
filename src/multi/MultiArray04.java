package multi;

public class MultiArray04 {
    public static void main(String[] args) {
        //변수
        String[] name = {"홍길동", "프로도", "라이언"};
        //String[] subject = {"국어", "영어", "수학"};
        int[][] jumsu = {{90, 95, 100, 0}, {100, 89, 75, 0}, {75, 80, 48, 0}};
        double[] avg = new double[name.length];
        char[] grade = new char[name.length];
        System.out.println("------------------------------------");
        System.out.println(String.format("%s %4s%4s%4s%4s%4s%4s", "이름", "국어", "영어", "수학", "총점", "평균", "학점"));
//        System.out.println("국어\t영어\t수학\t총점\t 평균\t학점");
        System.out.println("------------------------------------");


        for(int i=0;i < jumsu.length;i++){
            for(int j=0;j < jumsu[i].length-1;j++){
                jumsu[i][3] += jumsu[i][j];
            }
            avg[i] = jumsu[i][3] / 3.;
            if(avg[i] >= 90)      grade[i] = 'A';
            else if(avg[i] >= 80) grade[i] = 'B';
            else if(avg[i] >= 70) grade[i] = 'C';
            else if(avg[i] >= 60) grade[i] = 'D';
            else if(avg[i] < 60)  grade[i] = 'F';
        }

        for(int i=0;i < jumsu.length;i++){
            System.out.print(name[i]);
            for(int j=0;j < jumsu[i].length;j++){
                System.out.print(String.format("%5d", jumsu[i][j]));
            }
            System.out.print(" "+String.format("%6.2f", avg[i]));
            System.out.println(String.format("%4c", grade[i]));
        }
        System.out.println("------------------------------------");
    }
}
/*
[문제] 성적 계산
총점 = 국어 + 영어 + 수학
평균 = 총점 / 과목수
학점은 평균이 90 이상이면 A
            80 이상이면 B
            70 이상이면 C
            60 이상이면 D
            그 외      F
----------------------------------------------------
이름		국어		영어		수학		총점		평균		학점
----------------------------------------------------
홍길동	90		95		100
프로도	100		89		75
라이언	75		80		48
----------------------------------------------------
 */
