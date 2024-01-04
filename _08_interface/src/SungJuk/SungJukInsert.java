package SungJuk;

import java.util.ArrayList;

public class SungJukInsert implements SungJuk{
    @Override
    public void execute(ArrayList<SungJukDTO> list) {   // 넘어온 값은 list의 주소
        SungJukDTO sungJukDTO = new SungJukDTO();       // 생성자에서 입력받음
        list.add(sungJukDTO);                           // list의 주서에 해당 sungJukDTO 주소가 들어간다.
        System.out.println("입력되었습니다.");
    }
}
