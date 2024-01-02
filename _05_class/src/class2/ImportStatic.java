package class2;

import java.util.Arrays;

import static java.lang.System.out;
import static java.util.Arrays.sort;

import static java.lang.Math.*;
import static java.lang.String.format;

public class ImportStatic {
    public static void main(String[] args) {
        out.println("난수 = " + random());
        out.println("제곱 = " + pow(3, 4));

        out.println("소수이하 2째자리 = " + format("%.2f", 34.789));
        int[] arr = {25, 37, 20, 78, 55};
        //오름차순
        sort(arr);
        for(int a : arr){
            out.print(a + " ");
        }

    }
}
