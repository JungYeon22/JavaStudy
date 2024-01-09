package inheritance;

class AA_{
}
class BB_ extends AA_{

}
public class InstanceOf {
    public static void main(String[] args) {
        AA_ aa = new AA_();
        BB_ bb = new BB_();
        AA_ aa2 = new BB_();

        AA_ aa3 = aa;
        if(aa instanceof AA_) System.out.println("1, true");
        else System.out.println("1. false");

        AA_ aa4 = bb;       // 부모 = 자식 이기때문에 가능
        if(bb instanceof AA_) System.out.println("2. true");
        else System.out.println("2. false");

        BB_ bb2 = (BB_)aa2;     // aa2가 BB_ 까지 캐스팅 가능하기때문에 가능
        if(aa2 instanceof BB_) System.out.println("3. true");
        else System.out.println("3. false");

//        BB_ bb3 = (BB_) aa;     // aa라는 객체에는 BB_는 없고 AA_만 있기때문에 캐스팅 불가 -> error
        if(aa instanceof BB_) System.out.println("4. true");
        else System.out.println("4. false");
    }
}
