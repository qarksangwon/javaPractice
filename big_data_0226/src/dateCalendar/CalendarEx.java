package dateCalendar;

import java.util.Calendar;

public class CalendarEx {
    public static void main(String[] args) {
        // Calendar 클래스는 추상 클래스 = 클래스로 접근해야함
        // 특정 국가나 문화의 달력 시스템에 맞게 하위 클래스에서 구현하는것.
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int mon = now.get(Calendar.MONTH)+1;
        // 캘린더는 배열 개념으로 인덱스를 가져옴 = 1월 > 0번인덱스의 + 1
        int day = now.get(Calendar.DAY_OF_MONTH);
        int isPM = now.get(Calendar.AM_PM);
        int hour = now.get(Calendar.HOUR);
        int min = now.get(Calendar.MINUTE);
        int sec = now.get(Calendar.SECOND);
        if(isPM == 1) hour += 12;
        System.out.printf("%d년%02d월%02d일 %02d시%02d분%02d초\n", year, mon, day, hour, min, sec);
        // 데이터 포맷을 %02d 와 같이 자리수 안맞춰 주면 그냥 3월 1일 4분 2초 이런식으로 나온다.
        // 맞춰 주면 03월 01일 04분 02초와 같이 나온다.
        System.out.println(now.get(Calendar.DAY_OF_MONTH)); // 일
        System.out.println(now.get(Calendar.DAY_OF_WEEK));
        // 일 ~ 토 까지 1~7로 반환 즉 3 = 화요일 , 요일을 나타냄

    }
}
