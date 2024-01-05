package test;

import java.util.ArrayList;

public class EmployeePrint implements Employee{
    @Override
    public void execute(ArrayList<EmployeeDTO> list) {
        if(list.size() == 0){
            System.out.println("등록된 회원이 없습니다.");
        }else {
            System.out.println("사원번호\t\t이름\t\t\t직급\t\t\t기본급\t\t\t수당\t\t\t합계\t\t\t세율\t\t\t세금\t\t\t월급");
            for(EmployeeDTO data : list){
                System.out.println(data.toString());
            }
        }
    }
}
