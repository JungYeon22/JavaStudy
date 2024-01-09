package book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookInsert implements Book{

    @Override
    public void execute(ArrayList<BookDTO> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("도서 코드 입력: ");
        String code = scanner.next();
        System.out.print("도서 제목 입력 : ");
        String title = scanner.next();
        System.out.print("작가 입력 : ");
        String author = scanner.next();
        System.out.print("도서 가격 : ");
        int price = scanner.nextInt();
        System.out.print("구입할 도서 개수 : ");
        int qty = scanner.nextInt();
        BookDTO bookDTO = new BookDTO(code, title, author, price, qty);    // 도서 데이터 생성
        bookDTO.calc();
        list.add(bookDTO);                  // 도서 데이터 list에 저장
        System.out.println("저장 되었습니다.");
    }
}
