package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeSort implements Employee{
    @Override
    public void execute(ArrayList<EmployeeDTO> list) {
        Collections.sort(list);

    }

}
