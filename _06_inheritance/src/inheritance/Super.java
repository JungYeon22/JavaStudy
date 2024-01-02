package inheritance;

public class Super {
    protected double weight, height;

    public Super() {
        System.out.println("Super 기본 생성자");
    }

    public Super(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public void display(){
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "Super{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
