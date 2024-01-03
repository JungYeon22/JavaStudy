package abstract_;

public class AbstractMain extends AbstractTest{

    public static void main(String[] args) {
//        AbstractTest at = new AbstractTest(); // 추상 클래스는 new 할 수 없다. 추상 메소드를 override 해야한다.
        AbstractTest at = new AbstractMain();
        at.setName("홍길동");
        System.out.println(at.getName());
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
