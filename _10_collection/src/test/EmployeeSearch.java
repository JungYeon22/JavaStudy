package test;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeSearch implements Employee{
    @Override
    public void execute(ArrayList<EmployeeDTO> list) {
        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.next();
        int count = 0;
        System.out.println("사원번호\t\t이름\t\t직급\t\t기본급\t\t수당\t\t세율\t\t세금\t\t월급");
        for(EmployeeDTO data : list){
            if(data.getName().equals(inputName)){
                System.out.println(data.toString());
                count++;
            }
        }
        if(count == 0){
            System.out.println("검색하신 이름이 등록되어있지 않습니다.");
        }
        else {
            System.out.println(count + "명 검색되었습니다.");
        }

    }
}
