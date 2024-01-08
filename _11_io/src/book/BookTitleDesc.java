package book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BookTitleDesc implements Book{
    @Override
    public void execute(ArrayList<BookDTO> list) {
        Comparator<BookDTO> comparator = new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o1.getTitle().compareTo(o2.getTitle()) * -1;
            }
        };

        Collections.sort(list, comparator);

    }
}
