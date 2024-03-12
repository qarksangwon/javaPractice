package SystemClass;
import java.lang.Thread;

public class Main extends Thread {
    public static void main(String[]args) throws InterruptedException {
        // 현재 시간 읽는 법
        //nanoTime () : 10억분의 1초를 의미 함(1/100,000,000)
        //current~() : UTC 1970년 1월 1일 00:00:00.000을 기준으로 현재 시간 반환(1/1000초 단위)
        long time = System.currentTimeMillis();
        long timeNano = System.nanoTime();
        System.out.println(time);
        System.out.println(timeNano);

        int[] data = new int[1000];
        int cnt = 0, i;
        // 배열내에서 찾고자 하는 임의의 수
        int randVal = (int)(Math.random() * 1000) + 1;
        for(i = 0; i < data.length; i++) {
            data[i] = i + 1;
        }

        long time1 = System.currentTimeMillis();
        // 순차 검색
        for(i = 0; i < data.length; i++) {
            cnt++; // 총 검색 횟수 구하기
            sleep(1);
            if(randVal == data[i]) {
                System.out.println("위치 : " + (i+1));
                break;
            }
        }
        long time2 = System.currentTimeMillis();
        System.out.println("총 검색 횟수 : " + cnt);
        System.out.println("검색에 소요된 시간은 " + (time2 - time1) + "밀리초 입니다.");
        // 이처럼 메소드가 진행되는 동안의 시간을 측정할 수 있는것.
        //성능 측정인 면에서 currentTimeMillis() 사용

        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("os.home"));
    }
}
