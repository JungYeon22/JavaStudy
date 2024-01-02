package class2;

class StaticTest{
    private int a;          //필드, 인스턴스 변수
    private static int b;   // 필드, 클래스 변수

    static {
        System.out.println("static 초기화 영역");        //static은 실행하자마자 바로 생성 & 초기화
        b = 7;
    }

    public StaticTest(){
        System.out.println("기본 생성자");
        this.a = 7;
    }
    public void calc(){
        a++;
        b++;
    }
    public void display(){
        System.out.println("a = " + this.a + "\tb = " + StaticTest.b);      //static은 주소 x?
    }

    //static 함수에서는 static 변수만 가능
    public static void output(){
        System.out.println("static method...");
        //System.out.println("a = " + this.a + "\tb = " + StaticTest.b);      // error - static에서 this불가
    }
}
public class StaticMain {
    public static void main(String[] args) {
        StaticTest aa = new StaticTest();
        aa.calc();
        aa.display();           // a = 8 b = 8
        System.out.println();

        StaticTest bb = new StaticTest();
        bb.calc();
        bb.display();           // a = 8  b = 9
        System.out.println();

        StaticTest cc = new StaticTest();
        cc.calc();
        cc.display();           // a = 8  b = 10        => static 변수는 메모리에 한번만 생성
        System.out.println();

        StaticTest.output();
        aa.output();




    }
}
