package book;

import java.util.ArrayList;

public class BookPrint implements Book{
    @Override
    public void execute(ArrayList<BookDTO> list) {
        System.out.println("코드\t\t\t제목\t\t\t작가\t\t\t가격\t\t\t개수\t\t\t총가격");
        for(BookDTO bookDTO : list){
            System.out.println(bookDTO.toString());
        }
    }
}

