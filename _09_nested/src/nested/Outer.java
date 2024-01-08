package nested;

public class Outer {
    private String name;
    public void output(){

        System.out.println("이름 : " + this.name + "나이 : " + new Inner().age);
    }

    class Inner{        //Inner클래스는 name 변수에 접근 가능 but Outer클래스는 age 변수에 접근 불가 , 단 객체를 생성하면 접근 가능
        private int age;

        public void disp(){
            System.out.println("이름 : " + Outer.this.name + "나이 : " + this.age);
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.name = "홍길동";

        Outer.Inner inner = outer.new Inner();
        inner.age = 25;
        inner.disp();

//        inner.name = "코난";      - error / 접근 불가
        Inner inner2 = outer.new Inner();
        inner2.age = 30;
        inner2.disp();

        Inner inner3 = new Outer().new Inner();
        inner3.age = 35;
        inner3.disp();

    }
}

