package book;

import java.io.IOException;

public class BookMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        BookService bookService = new BookService();
        bookService.menu();
        System.out.println("프로그램을 종료합니다.");

    }
}
/*
필드
code, title, author, price, qty,  total
코드, 제목, 작가, 가격, 개수, 전체가격

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
