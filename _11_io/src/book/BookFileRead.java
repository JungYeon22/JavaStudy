package book;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BookFileRead implements Book{
    @Override
    public void execute(ArrayList<BookDTO> list) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.txt"));
        ArrayList<BookDTO> result = new ArrayList<>();      // 통합된 데이터 결과
        Map<String, Integer> map = new HashMap<>();


        BookDTO bookDTO1 = (BookDTO) ois.readObject();
        BookDTO bookDTO2 = (BookDTO) ois.readObject();
        BookDTO bookDTO3 = (BookDTO) ois.readObject();
        BookDTO bookDTO4 = (BookDTO) ois.readObject();

        result.add(bookDTO1);
        result.add(bookDTO2);
        result.add(bookDTO3);
        result.add(bookDTO4);
        for(BookDTO bookDTO : result){
            String currentCode = bookDTO.getCode();
            int count = map.getOrDefault(currentCode, 0);
            map.put(bookDTO.getCode(), bookDTO.getQty() + count);
        }


        for(BookDTO bookDTO : result){
            System.out.println(bookDTO.toString());
        }





//        while(true){
//            BookDTO bookDTO = (BookDTO)ois.readObject();
//            if(bookDTO == null){
//                break;
//            }
//            for(BookDTO data : result){
//                if(data.isSameData(bookDTO)){
//                    data.integrate(bookDTO.getQty());
//                }
//            }
//            result.add(bookDTO);
//            System.out.println("저장");
//        }

        ois.close();
    }
}
