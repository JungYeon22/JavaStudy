package inheritance;

enum Color{
    RED("빨강"), GREEN("초록"), BLUE("파랑");

    String name;

    Color(String name) {
        this.name = name;
    }
}
//---------------------------------------------
class Final{
    public final String FRUIT = "사과";
    public final String FRUIT2;                 // final이 변수를 생성자에서 초기화 할 수 있다. 값이 없을때 한번 설정 기회가 있음

    public static final String ANIMAL = "호랑이";
    public static final String ANIMAL2;  // static 변수는 생성자에서 초기화 할 수 없다. => 생성자 호출전에 STATIC 초기화 호출 (밑)

//    public static final int RED = 0;
//    public static final int GREEN = 1;
//    public static final int BLUE = 2;  ====> 비슷한 상수가 많을때 p s f 형태로 잘 안씀

    static{
        ANIMAL2 = "기린";
    }

    public Final(String FRUIT2) {
        this.FRUIT2 = FRUIT2;
    }
}
//-----------------------------------------------
public class FinalMain {
    public static void main(String[] args) {
        final int AGE = 25;
//        AGE++;   - error
        System.out.println("AGE :  "+ AGE);
        final String NAME;
        NAME = "정연";            // 초기값이 없을때 한번 설정 기회있음
//        NAME = "saf"; - error

        System.out.println("NAME : " + NAME);
        System.out.println();

        Final aa = new Final("딸기");
        System.out.println("FRUIT : " + aa.FRUIT);
        System.out.println("FRUIT2 : " + aa.FRUIT2);
        System.out.println();

        System.out.println("ANIMAL :  " + Final.ANIMAL);
        System.out.println("ANIMAL2 :  " + Final.ANIMAL2);
        System.out.println();

        System.out.println("빨강 = " + Color.RED);
        System.out.println("Color.RED : " + Color.RED.name);

        for(Color color : Color.values()){
            System.out.println(color.ordinal() + " : " + color);
        }

    }
}
