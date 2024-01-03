package abstract_;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberMain {
    public static void main(String[] args) {
        NumberFormat nf = new DecimalFormat();   // 부모 = 자식
        // 3자리마다 , 찍고 소수이하 3째자리까지
        System.out.println(nf.format(12312.3123));
        System.out.println(nf.format(1231000000));
        System.out.println();

        NumberFormat nf2 = new DecimalFormat("#,###.##원");  // 숫자 형식 지정 방법 / 오라클은 9,999.99 로 표현
        //유효숫자가 아닌 것은 표현하지 않는다.
        System.out.println(nf2.format(12312.3123));
        System.out.println(nf2.format(1231000000));
        System.out.println();

        NumberFormat nf3 = new DecimalFormat("#,###.00원");  // 숫자 형식 지정 방법 / 오라클은 9,999.99 로 표현
        //유효숫자가 아닌 것은 0
        System.out.println(nf3.format(12312.3123));
        System.out.println(nf3.format(1231000000));
        System.out.println();

        NumberFormat nf4 = NumberFormat.getCurrencyInstance();  // 메소들를 이용하여 클래스 생성 , Currency : 원
        nf4.setMaximumFractionDigits(2);    // 소수 이하 2째자리
        nf4.setMinimumFractionDigits(2);    // 0을 강제로 표시
        System.out.println(nf4.format(12312.3123));
        System.out.println(nf4.format(1231000000));
        System.out.println();

        NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.US);  // 메소들를 이용하여 클래스 생성 , Currency : 달러
        nf5.setMaximumFractionDigits(2);    // 소수 이하 2째자리
        nf5.setMinimumFractionDigits(2);    // 0을 강제로 표시
        System.out.println(nf5.format(12312.3123));
        System.out.println(nf5.format(1231000000));
        System.out.println();

    }
}
