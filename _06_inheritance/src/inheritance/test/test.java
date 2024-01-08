package inheritance.test;

class TestParent{
    private String name;

    void test(){
        System.out.println("부모함수");
    }
}
public class test extends TestParent {
    public void test2(){
        System.out.println("자식 함수");
    }
    public static void main(String[] args) {
        TestParent t = new test();
        t.test();
    }
}
