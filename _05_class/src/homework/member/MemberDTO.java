package homework.member;

public class MemberDTO {
    private String name;
    private int age;
    private String phone;
    private String address;

    public MemberDTO(String name, int age, String phone, String address) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
}
