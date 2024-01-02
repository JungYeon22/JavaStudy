package homework.Fruit;

public class Fruit {
    private String pum;
    private int jan, feb, mar, tot;
    private static int sumJan, sumFeb, sumMar;

    public Fruit(String pum, int jan, int feb, int mar) {
        this.pum = pum;
        this.jan = jan;
        this.feb = feb;
        this.mar = mar;
        calcTot();
    }
    private void calcTot(){
        this.tot = jan + feb + mar;
        sumJan += jan;
        sumFeb += feb;
        sumMar += mar;
    }
    public void display(){
        System.out.println(pum + "\t\t" + jan + "\t\t" + feb + "\t\t" + mar + "\t\t" + tot);
    }
    public static void output(){
        System.out.println("\t\t"+sumJan + "\t\t" + sumFeb + "\t\t" + sumMar);
    }

}
/*
클래스 : Fruit
pum, jan, feb, mar, tot
sumJan, sumFeb, sumMar

생성자(품명, 1월, 2월, 3월)
calcTot()
display()
public static void output()
 */