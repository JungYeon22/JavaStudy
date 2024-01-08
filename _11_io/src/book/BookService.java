package book;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BookService {
    private ArrayList<BookDTO> list = new ArrayList<>();
    public void menu() throws IOException, ClassNotFoundException {
        boolean play = true;
        while(play){
            System.out.println();
            System.out.println("------------------");
            System.out.println("\t1.등록");
            System.out.println("\t2.출력");
            System.out.println("\t3.파일 저장");
            System.out.println("\t4.파일 읽기");
            System.out.println("\t5.책 제목으로 내림차순 정렬");
            System.out.println("\t6.종료");
            System.out.println("------------------");

            Scanner scanner = new Scanner(System.in);
            System.out.print("메뉴 번호 입력 : ");
            int num = scanner.nextInt();
            System.out.println("------------------");

            Book book = null;     // 부모 클래스(인터페이스) 초기화

            switch (num){
                case 1: book = new BookInsert();
                    break;
                case 2: book = new BookPrint();
                    break;
                case 3: book = new BookFileWrite();
                    break;
                case 4: book = new BookFileRead();
                    break;
                case 5: book = new BookTitleDesc();
                    break;
                case 6: play = false;
                    break;
                default :
                    System.out.println("1 ~ 6중에 선택하세요");
            }
            if(book != null){
                book.execute(list);
            }
        }

    }
}
/*

메뉴
1. 등록
2. 출력
3. 파일 저장
4. 파일 읽기
5. 책 제목으로 내림차순 정렬
6. 종료

번호 선택 :

조건
1.
입력할때 데이터 중복 허용
book01  자바    김자바   35000  10   (입력) /   350000
book02  스프링   박봄    40000  5
book01  자바    김자바   35000  8
book01  자바    김자바   35000  2

출력할 때에는 같은 데이터는 묶어서 출력
book01  자바    김자바   35000  20
book02  스프링   박봄    40000  5

2. 피일에 저장 할 때 입력한 그대로 저장

3. 파일명은 book.txt
 */

