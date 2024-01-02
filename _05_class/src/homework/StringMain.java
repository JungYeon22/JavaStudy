package homework;

import java.util.Scanner;

public class StringMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String input = scanner.next();
        System.out.print("현재 문자열 입력 : ");
        String target = scanner.next();
        System.out.print("바꿀 문자열 입력 : ");
        String value = scanner.next();

        String lowerCase = input.toLowerCase();     // 소문자로 치환
        if(lowerCase.length() < target.length()){
            System.out.println("입력한 문자열의 크기가 작습니다\n" +
                    "치환 할 수 없습니다");
            return;
        }
        String replace = lowerCase.replace(target, value);

        // 치환한 문자열 개수 구하기
        int i = 0, count =0;
        while(true){
            int now = lowerCase.indexOf(target, i);
            if(now == -1){
                break;
            }
            count++;
            i = now + target.length();
        }
        System.out.println(replace);
        System.out.println(count + "번 치환");

    }
}
/*
치환하는 프로그램을 작성하시오 - indexOf(?, ?), replace()
String 클래스의 메소드를 이용하시오
대소문자 상관없이 개수를 계산하시오

[실행결과]
문자열 입력 : aabba
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환

문자열 입력 : aAbbA
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환

문자열 입력 : aabbaa
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbbdd
2번 치환

문자열 입력 : AAccaabbaaaaatt
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddccddbbddddatt

4개 치환

문자열 입력 : aabb
현재 문자열 입력 : aaaaa
바꿀 문자열 입력 : ddddd
입력한 문자열의 크기가 작습니다
치환 할 수 없습니다
 */