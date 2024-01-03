package inheritance;

class Test{

    @Override
    public String toString(){
        return getClass() + "바부";
    }
}
//-----------------------------
public class ObjectMain extends Object{
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println("객체 test = "+ test);     // 클래스명@16진수 (hex)
        System.out.println("객체 test = " + test.toString());
        System.out.println("객체 test = " + test.hashCode());     // 10진수 (DEC)
        System.out.println();

        String str = "apple";
        System.out.println("객체 str : " + str);
        System.out.println("객체 str : " + str.toString());
        str.hashCode();   // 믿지 마삼, 표현 할 수 있는 문자열은 무한대이기때문에 10진수 표현을 다 할 수 없다. - 믿을 수 없다.
        System.out.println();

        String aa = new String("apple");
        String bb = new String("apple");
        System.out.println("aa == bb : " + (aa == bb) );    // 참조값 비교, false
        System.out.println("aa.equals(bb) : " + aa.equals(bb)); // 문자열 비교, true
        System.out.println();

        Object cc = new Object();
        Object dd = new Object();
        System.out.println("cc == dd : " + (cc == dd) );        // 참조값 비교, false
        System.out.println("cc.equals(dd) : " + cc.equals(dd)); // 참조값 비교, false
        System.out.println();

        Object ee = new String("apple");
        Object ff = new String("apple");
        System.out.println("ee == ff : " + (ee == ff));        // == 참조값 비교, false
        System.out.println("ee.equals(ff) : " + ee.equals(ff)); // 자식인 String에서 equals가 있기때문에 문자열 비교, true

    }
}
/*
class Object {
	public boolean equals(Object obj){} //참조값 비교
	public String toSting(){} //클@16진수
	public int hashCode(){} //10진수

}

class String extends Object {
	public boolean equals(Object obj){} //문자열 비교
	public String toSting(){} //문자열
	public int hashCode(){} //믿지 마삼, 표현 할 수 있는 문자열은 무한대이기 때문에 10진수 표현을 다 할 수 없다.
}
 */
