package method;

public class Method03 {
    public static void main(String[] args) {
        Method03 m = new Method03();

        System.out.println("합 : " + m.sum(10, 20));
        System.out.println("합 : " + m.sum(10, 20, 30));
        System.out.println("합 : " + m.sum(10, 20, 30, 40));
    }

    public int sum(int... arg){     // 인수의 개수를 자유롭게, 내부적으로는 배열화 (variable argument)
        int sum = 0;
        for(int data : arg){
            sum += data;
        }
        return sum;
    }

    // overload : 함수명은 같은데 기능은 다른 함수
//    private int sum(int a, int b) {
//        return a+b;
//    }
//    private int sum(int a, int b, int c) {
//        return a+b+c;
//    }
//    private int sum(int a, int b, int c, int d) {
//        return a+b+c+d;
//    }
}
