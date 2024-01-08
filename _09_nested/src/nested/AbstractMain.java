package nested;

public class AbstractMain {
    public static void main(String[] args) {
        AbstractTest abstractTest = new AbstractTest() {    // 익명 Inner Class
            @Override
            public void setName(String name) {
                this.name = name;
            }
        };
        // interface 생성
        InterA interA = new InterA() {
            @Override
            public void aa() {

            }

            @Override
            public void BB() {

            }      // interface를 new 하는것이 아닌 뒤에 익명 inner class를 new 하는 것임

        };
        // 추상메소드가 없는 추상클래스 생성
        AbstractExam ae = new AbstractExam() {
            // 원하는 메소드 Override 강제 x
            @Override
            public void cc() {
                super.cc();
            }

            @Override
            public void dd() {
                super.dd();
            }
        };
    }

}
