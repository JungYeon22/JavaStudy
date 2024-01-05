package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeDelete implements Employee{
    @Override
    public void execute(ArrayList<EmployeeDTO> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("삭제할 이름 입력 : ");
        String inputName = scanner.next();

        int count = 0;
        Iterator<EmployeeDTO> iterator = list.iterator();
        while(iterator.hasNext()){
            if(iterator.next().getName().equals(inputName)){
                iterator.remove();
                count++;
            }
        }
        if(count == 0){
            System.out.println("회원 정보가 없습니다.");
        }
        else {
            System.out.println(count + "건의 항목을 삭제하였습니다.");
        }
    }
}
