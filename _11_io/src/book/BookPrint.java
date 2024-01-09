package book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookPrint implements Book{
    @Override
    public void execute(ArrayList<BookDTO> list) {
        System.out.println("코드\t\t제목\t\t작가\t\t가격\t\t\t개수\t\t총가격");

        // 중복 확인
        Map<String, Integer> map = new HashMap<>(); //<도서코드, 개수>
        for(BookDTO bookDTO : list){
            if(map.containsKey(bookDTO.getCode())){
                map.put(bookDTO.getCode(), map.get(bookDTO.getCode()) + bookDTO.getQty());
            }
            else {
                map.put(bookDTO.getCode(), bookDTO.getQty());
            }
        }
        // 결과 담기
        List<BookDTO> resultList = new ArrayList<>();
        for(BookDTO bookDTO : list){
            if(map.containsKey(bookDTO.getCode())){ //
               BookDTO resultBook = new BookDTO(bookDTO.getCode(), bookDTO.getTitle(),
                       bookDTO.getAuthor(), bookDTO.getPrice(), map.get(bookDTO.getCode()));
               resultBook.calc();
               resultList.add(resultBook);
               map.remove(bookDTO.getCode());       // 결과를 담은 항목은 제거
            }
        }

        //출력
        for(BookDTO bookDTO : resultList){
            System.out.println(bookDTO);
        }


    }
}

