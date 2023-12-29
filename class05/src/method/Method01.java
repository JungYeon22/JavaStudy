package method;

public class Method01 {
    public static void main(String[] args) {
        //Method01.output();                       // static 은 직접 호출
        Method01 m = new Method01();    // 참조변수 m / Method가 위치한 주소를 가지고 있음
        m.display();

        System.out.println("객체 m : "+ m);
        System.out.println("객체 m : "+ m.toString());


    }

    public void display(){                  //static이 없기때문에 메모리에 잡혀야 호출가능
        System.out.println("method...");
    }

    public static void output(){
        System.out.println("static method...");
    }

}