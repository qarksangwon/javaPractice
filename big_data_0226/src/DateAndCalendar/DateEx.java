package DateAndCalendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
    public static void main(String[] args) {
        Date now = new Date();
        String strNow1 = now.toString();
        System.out.println(strNow1);
        // 날짜를 원하는 포맷으로 파싱 시켜 줍니다.(패턴 매칭)
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        String strNow2 = sdf.format(now);
        System.out.println(strNow2);

        SimpleDateFormat f1, f2, f3, f4, f5, f6, f7;
        f1 = new SimpleDateFormat("yyyy-MM-dd");
        f2 = new SimpleDateFormat("yy/MM/dd");
        f3 = new SimpleDateFormat("yyyy년M월d일");
        // MM 월에서 M월로 변경할 시 03월 -> 3월 , 자리수 안맞춰지고 그냥 출력.
        // 모든 시간 단위 마찬가지
        f4 = new SimpleDateFormat("HH:mm:ss");
        f5 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        f6 = new SimpleDateFormat("오늘은 M월의 W번째 주, d번째 날 입니다.");
        f7 = new SimpleDateFormat("오늘은 yyyy년의 w주차 입니다.");
        // 대문자 W 는 한 월의 몇 주차인지와
        // 소문자 w 는 한 년도의 몇 주차인지
        System.out.println(f1.format(now));
        System.out.println(f2.format(now));
        System.out.println(f3.format(now));
        System.out.println(f4.format(now));
        System.out.println(f5.format(now));
        System.out.println(f6.format(now));
        System.out.println(f7.format(now));
    }
}
