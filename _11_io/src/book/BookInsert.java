package book;

import java.util.ArrayList;

public class BookInsert implements Book{

    @Override
    public void execute(ArrayList<BookDTO> list) {
        BookDTO bookDTO = new BookDTO();    // 도서 데이터 생성
        list.add(bookDTO);                  // 도서 데이터 list에 저장
        System.out.println("저장 되었습니다.");
    }
}
