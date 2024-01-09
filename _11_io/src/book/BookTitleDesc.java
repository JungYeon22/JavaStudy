package book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BookTitleDesc implements Book{
    @Override
    public void execute(ArrayList<BookDTO> list) {
        Comparator<BookDTO> comparator = new Comparator<BookDTO>() {    // 정렬 기준 정하는 객체
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o1.getTitle().compareTo(o2.getTitle()) * -1;
            }   // 문자열 비교는 compareTo를 사용한다.
        };

        Collections.sort(list, comparator);

    }
}