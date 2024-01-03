package abstract_;

public abstract class AbstractTest {     // POJO 형식(Plain Old Java Object) / 기본 형식, 필드 private, getter,setter 등,,
    protected String name;


    public String getName() {
        return name;
    }

    public abstract void setName(String name);  // 추상 메소드
}
