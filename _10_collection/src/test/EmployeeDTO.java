package test;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EmployeeDTO implements Comparable<EmployeeDTO>{
    private int no;
    private String name;
    private String position;
    private int basePay;
    private int extraPay;
    private int tot;
    private double taxRate;
    private int tax;
    private int salary;

    public EmployeeDTO() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("사원 번호 입력 : ");
        this.no = scanner.nextInt();
        System.out.print("이름 입력 : ");
        this.name = scanner.next();
        System.out.print("직급 입력: ");
        this.position = scanner.next();
        System.out.print("기본급 입력 : ");
        this.basePay = scanner.nextInt();
        System.out.print("수당 입력 : ");
        this.extraPay = scanner.nextInt();
        calc();
    }

    private void calc() {
        tot = basePay + extraPay;
        if(tot <= 2000000)       taxRate = 0.01;
        else if(tot <= 4000000)  taxRate = 0.02;
        else                     taxRate = 0.03;
        tax = (int)(tot * taxRate);
        salary = tot - tax;
    }
    public void update(int no, String position, int basePay, int extraPay) {
        this.no = no;
        this.position = position;
        this.basePay = basePay;
        this.extraPay = extraPay;
        calc();
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat();
        return no  + "\t\t" + name  + "\t\t"  + position  + "\t\t"  + df.format(basePay)  + "\t\t"  + df.format(extraPay)  + "\t\t"
                + df.format(tot)  + "\t\t"  + taxRate  + "\t\t"  + df.format(tax)  + "\t\t"  + df.format(salary);
    }

    @Override
    public int compareTo(EmployeeDTO employeeDTO) {
        if(this.salary > employeeDTO.salary) return -1;
        else if(this.salary < employeeDTO.salary) return 1;
        else return 0;
    }
}
