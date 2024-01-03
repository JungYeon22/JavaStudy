package abstract_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *      homework
 * */
class CalendarEX{
    private int year;
    private int month;
    private String targetDate;
    private int startWeekday;
    private int targetDayCount;

    public CalendarEX() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("연도 입력 : ");
        this.year = scanner.nextInt();
        System.out.print("월 입력 : ");
        this.month = scanner.nextInt();
        calc();
    }

    public void calc() throws ParseException {
        String monthStr = "";
        if(month < 10){
            monthStr = "0" + month;
        }else {
            monthStr = String.valueOf(month);
        }
        targetDate = String.valueOf(year) + monthStr + "01";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        Date firstDay = simpleDateFormat.parse(targetDate);
        Calendar c = Calendar.getInstance();
        c.setTime(firstDay);            // 캘린더 설정

        startWeekday = c.get(c.DAY_OF_WEEK);

        c.add(c.MONTH, +1);     // 한달 후
        c.add(c.DATE, -1);      // 1일 전
        targetDayCount = c.get(c.DAY_OF_MONTH);

        String format = simpleDateFormat.format(c.getTime());

    }
    public void display(){
        System.out.println("일\t월\t화\t수\t목\t금\t토");
        for(int i=0;i < startWeekday-1;i++){
            System.out.print("\t");
        }
        for(int i=1;i <= targetDayCount;i++){
            System.out.print(i + "\t");
            if(i % 7 == 8 - startWeekday) System.out.println();
        }
    }

}
public class CalendarMain {
    public static void main(String[] args) throws ParseException {
        CalendarEX calendarEX = new CalendarEX();
        calendarEX.display();
    }
}
/*
[문제] 만년달력

[클래스명] : CalendarEx
[필드] : 원하는 것으로 직접 잡기
[메소드]
- 년도, 월을 입력
- 기본생성자 : 입력
- 메소드 : calc() -> 매달 1일의 요일이 무엇인지? (Calendar에 메소드 찾아서 적용)
                 -> 매달 마지막이 28, 29, 30, 31 무엇인지? (Calendar에 메소드 찾아서 적용)
         display() 출력

[클래스]
CalendarMain

[실행결과]
년도 입력 : 2002
월 입력 : 10

일	월	화	수	목	금	토
		1	2	3	4	5
6	7	8	9	10	11	12
13	14	15	16	17	18	19
20	21	22	23	24	25	26
27	28	29	30	31
 */