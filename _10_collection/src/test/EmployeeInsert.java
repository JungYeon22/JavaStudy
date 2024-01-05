package test;

import java.util.ArrayList;

public class EmployeeInsert implements Employee{
    @Override
    public void execute(ArrayList<EmployeeDTO> list) {
        EmployeeDTO employeeDTO = new EmployeeDTO();    // 생성
        list.add(employeeDTO);
        System.out.println("등록 되었습니다.");
    }
}
