package SungJuk;

import java.util.ArrayList;

public class SungJukPrint implements SungJuk{
    @Override
    public void execute(ArrayList<SungJukDTO> list) {
        if(list.size() == 0){
            System.out.println("등록된 회원이 없습니다.");
        }else {
            System.out.println("번호\t\t  이름\t\t국어\t\t영어\t\t수학\t\t총점\t\t평균");
            for(SungJukDTO data : list){
                System.out.println(data.toString());
            }
        }
    }
}
/*
8. SungJukPrint.java
- ArrayList에 저장된 모든 데이터를 출력한다.

번호	이름	국어	영어	수학 	총점	평균

 */