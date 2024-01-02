package class2;

import java.util.Scanner;

public class StringBufferMain {
    static private int dan;

    public StringBufferMain() {
        Scanner sc = new Scanner(System.in);
        System.out.print("원하는 단을 입력 : ");
        dan = sc.nextInt();
    }

    public void display(){
        StringBuffer buffer = new StringBuffer();
        for(int i = 1;i < 10;i++){
            buffer.append(dan)
                    .append("*")
                    .append(i)
                    .append("=")
                    .append(dan*i);
            System.out.println(buffer.toString());  //
            buffer.delete(0,buffer.length());
//            System.out.println(dan + "*" + i + "=" + (dan*i));
        }
    }

    public static void main(String[] args) {
        StringBufferMain sbm = new StringBufferMain();
        sbm.display();

    }
}
/*

 */