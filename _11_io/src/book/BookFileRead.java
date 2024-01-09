package book;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookFileRead implements Book{
    @Override
    public void execute(ArrayList<BookDTO> list) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.txt"));
        // 통합된 데이터 결과
        System.out.println("코드\t\t제목\t\t작가\t\t가격\t\t\t개수\t\t총가격");
        ArrayList<BookDTO> result  = new ArrayList<>();
//        list.clear();
        while(true){
            try{
                BookDTO bookDTO = (BookDTO) ois.readObject();
                result.add(bookDTO);
//                List<BookDTO> load = (ArrayList<BookDTO>) ois.readObject();
//                for(BookDTO bookDTO :load){
//                    list.add(bookDTO);
//                }

            }catch (EOFException e){
                break;
            } catch (ClassNotFoundException e){
                e.printStackTrace();
                break;
            }
        }
        ois.close();

        for(BookDTO bookDTO : result){
            System.out.println(bookDTO.toString());
        }

    }
}
