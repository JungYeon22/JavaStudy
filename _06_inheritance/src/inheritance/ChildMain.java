package inheritance;

public class ChildMain extends Super{
    protected String name;
    protected int age;

    public ChildMain() {
        System.out.println("ChildMain 기본 생성자");
    }

    public ChildMain(String name, int age,double weight, double height) {
        super(weight, height);
        System.out.println("ChildMain 생성자");
        this.name = name;
        this.age = age;
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "ChildMain{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    public static void main(String[] args) {
        ChildMain aa = new ChildMain("홍길동", 17, 71.2, 180);
        aa.display();
        System.out.println();

        Super bb = new ChildMain("코난", 13, 48.2,153);   // bb는 Children클래스의 Super를 가르킴
        bb.display();       //부모를 가르켜도 메소드가 같으면 자식이 먼저 -> @Override

    }
}
