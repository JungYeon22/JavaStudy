package inheritance;

class AA{
    public int a = 3;
    public void display(){
        a += 5;
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "AA{" +
                "a=" + a +
                '}';
    }
}
class BB extends AA{
    public int a = 8;
    public void display(){
        this.a += 5;
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "BB{" +
                "a=" + a +
                '}';
    }
}

public class TestMain {
    public static void main(String[] args) {
        BB aa = new BB();   //AA 와 BB를 메모리에 생성
        System.out.println("aa의 a : " + aa.a);
        aa.display();

        System.out.println("aa의 a : " + aa.a);     // a = 13
        System.out.println();

        AA bb = new BB();       // 부모 = 자식  형태
        bb.display();
        System.out.println("bb의 a : " + bb.a);     //  a = 3
        System.out.println();

        BB cc = (BB)bb;             // 자식 = (자식)부모 형태 / 보통 부모가 맞춰주는게 일반적, 반대인 경우 강제형변환해야함
        cc.display();           // a = 18  , 다시 display가 호출되면서 +5를 했음
        System.out.println("cc의 a : " + cc.a);
        System.out.println();

        AA dd = new AA();
        dd.display();
        System.out.println("dd의 a : " + dd.a);
        System.out.println();

        BB ee = (BB) dd;        // error / dd는 AA만 가지고 있음( 변환할 수 없음)

        /*
        코드를 작성하면서 작성한 코드가 메모리를 어떻게 생성하는지 알아야한다. 외우는게 x
         */

    }
}
