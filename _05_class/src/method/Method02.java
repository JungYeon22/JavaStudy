package method;

public class Method02 {
    int a;  //필드

    public static void main(String[] args) {
        int a;  // 지역변수
        Method02 m = new Method02();

        System.out.println("합 : " + m.sum(25, 36));
        System.out.println("차 : " + m.sub(25, 36));
        System.out.println("곱 : " + m.mul(25, 36));
        System.out.println("몫 : " + String.format("%.2f", m.div(25, 36)));
    }
    public int sum(int a, int b){   // 인수 or 매개변수
        return a+b;
    }
    public int sub(int a, int b){   // 인수 or 매개변수
        return a-b;
    }
    public int mul(int a, int b){   // 인수 or 매개변수
        return a*b;
    }
    public double div(int a, int b){   // 인수 or 매개변수
        return (double)a/b;
    }

}
