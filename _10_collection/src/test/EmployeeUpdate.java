package test;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeUpdate implements Employee{
    @Override
    public void execute(ArrayList<EmployeeDTO> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("수정할 사원번호 입력 : ");
        int inputNo = scanner.nextInt();
        int i = 0;
        for(i=0;i < list.size();i++){
            if(list.get(i).getNo() == inputNo){
                list.get(i).toString();
                System.out.print("사원번호 입력 : ");
                int no = scanner.nextInt();
                System.out.print("직급 입력 : ");
                String position = scanner.next();
                System.out.print("기본급 : ");
                int basePay = scanner.nextInt();
                System.out.print("수당 : ");
                int extraPay = scanner.nextInt();
                list.get(i).update(no, position, basePay, extraPay);
                break;
            }
        }
        if(i == list.size()){
            System.out.println("잘못된 번호 입니다.");
        }else {
            System.out.println("수정하였습니다.");
            System.out.println();
            EmployeePrint employeePrint = new EmployeePrint();
            employeePrint.execute(list);
        }
    }
}
