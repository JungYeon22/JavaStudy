package collection;

public class GenericMain2<T> {
    private T a;

    public GenericMain2(T t) {
        this.a = t;
    }

    public T getA() {
        return a;
    }
    public void setA(T a){
        this.a = a;
    }

    public static void main(String[] args) {
        GenericMain2<?> aa = new GenericMain2<String>("홍길동");    // String 타입으로 규정했지만 <?> -> object타입으로 받아들일거다
//        aa.setA("홍길동"); - error 데이터는 setter가 아니라 생성자를 통해서 넣어야 한다.

        String name = (String) aa.getA();
        System.out.println("이름 : " + name);

        GenericMain2<?> bb = new GenericMain2<Integer>(25);
        int age = (Integer) bb.getA();              // AutoUnBoxing

        System.out.println("나이 : " + age);


    }


}
