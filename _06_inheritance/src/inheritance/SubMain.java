package inheritance;

public class SubMain extends Super{

    protected String name;
    protected int age;

    public SubMain(double weight, double height, String name, int age) {
        System.out.println("SubMain 생성자");
        this.name = name;
        this.age = age;

//        this.weight = weight;
//        this.height = height;
        super.weight = weight;
        super.height = height;
//        super(weight, height);

    }
    public SubMain() {
        System.out.println("SubMain 기본 생성자");
    }
    public void output(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "SubMain{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    public static void main(String[] args) {
        SubMain subMain = new SubMain(); // 생성자가 두번 불려짐 / 부모 생성자 -> 자식 생성자 즉, 자식생성자를 호출하면 부모까지 같이
        System.out.println(subMain.toString());
        SubMain subMain1 = new SubMain(74, 176, "박정연", 26);
        System.out.println(subMain1.toString());        //자식한테 없으면 부모한테 간다.

        Super bb = new SubMain(45.8, 153.6, "코난", 13);
        // bb는 output()를 호출 할 수 없다.
        bb.display();


    }
}
