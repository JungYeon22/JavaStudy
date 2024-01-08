package book;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class BookFileWrite implements Book{
    @Override
    public void execute(ArrayList<BookDTO> list) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.txt"));  // 파일이 없으면 만듦
        for(BookDTO bookDTO : list){
            oos.writeObject(bookDTO);
        }
        oos.close();
        System.out.println("데이터가 <book.txt>에 저장 되었습니다.");
    }
}
