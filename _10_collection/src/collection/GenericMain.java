package collection;

public class GenericMain<T> {
    private T a;

    public T getA() {
        return a;
    }
    public void setA(T a){
        this.a = a;
    }

    public static void main(String[] args) {
        GenericMain<String> aa = new GenericMain<>();
        aa.setA("홍길동");
        System.out.println("이름 : " + aa.getA());

//        aa.setA(35);    - error String만 들어갈 수 있음
        GenericMain<Integer> bb = new GenericMain<>();
        bb.setA(25);
        System.out.println("나이 : "+ bb.getA());

    }
}
