package collection;

public class PersonDTO implements Comparable<PersonDTO>{
    private String name;
    private int age;

    public PersonDTO() {
    }

    public PersonDTO(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(PersonDTO p) {         // 나이로 기준으로 설정
//        if(this.age < p.age) return -1;
//        else if(this.age > p.age) return 1;
//        else return 0;
        if(this.age < p.age) return 1;
        else if(this.age < p.age) return -1;
        else return 0;
    }
}
