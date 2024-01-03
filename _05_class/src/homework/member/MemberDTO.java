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

    @Override
    public String toString() {
        return name + "\t\t" +
                age + "\t\t" +
                phone + "\t\t" +
                address;
    }

    public String getAddress() {
        return address;
    }
}
