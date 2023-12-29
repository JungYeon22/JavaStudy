package class_;

class Person{
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setData(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setData(){}
}
//------------------------------------
/*
class당 *.class 파일이 생성

PersionMain.java ---(컴파일러)-->  PersonMain.class  &&  Person.class
 */
public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("person : " + person);       // 클래스명@주소
        person.setName("박정연");
        person.setAge(26);
        System.out.println("이름 : " + person.getName());
        System.out.println("나이 : " + person.getAge());

        Person person1 = new Person();
        System.out.println("person1 : " + person1);       // 클래스명@주소
        person1.setName("홍길동");
        person1.setAge(27);
        System.out.println("이름 : " + person1.getName());
        System.out.println("나이 : " + person1.getAge());

        Person person2 = new Person();
        System.out.println("person2 : " + person2);       // 클래스명@주소
        person2.setData("김유주", 25);
        System.out.println("이름 : " + person2.getName());
        System.out.println("나이 : " + person2.getAge());

    }

}
