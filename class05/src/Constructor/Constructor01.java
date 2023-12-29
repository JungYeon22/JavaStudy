package Constructor;

class  Hello {
    private String name;
    private int age;

    public Hello() {
        System.out.println("기본 생성자");
    }
    public Hello(String name){
        this();
        System.out.println("이름 생성자");
        this.name = name;
    }
    public Hello(int age){
        // overload 된 다른 생성자를 호출
        this("홍길동");        // this() -> 생성자()호출
        this.age = age;
    }
    public Hello(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
public class Constructor01 {
    public static void main(String[] args) {
        Hello hello1 = new Hello();
        Hello hello2 = new Hello("김유주");
        Hello hello3 = new Hello(26);
        Hello hello4 = new Hello("박정연", 26);

        System.out.println("hello1 : " + hello1.getName() + " " + hello1.getAge());
        System.out.println("hello2 : " + hello2.getName() + " " + hello2.getAge());
        System.out.println("hello3 : " + hello3.getName() + " " + hello3.getAge());
        System.out.println("hello4 : " + hello4.getName() + " " + hello4.getAge());
        System.out.println();
        Hello hello5 = new Hello("박정연");

    }
}

/*
생성자 : 클래스명과 같음
        리턴 타입을 쓰지 않음
        생성할때 한번 자동 호출됨
        함수 초기화하는 기능
        기본생성자 & (오버로드)생성자

this : 자기 자신 클래스의 정보를 갖고 있다.

 */
