package mathCalss;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println((int)(Math.random() * 100)); // 0 ~ 99
        Random ran = new Random();
        System.out.println(ran.nextInt(100));           // 0 ~ 99

        // abs() = 절댓값
        System.out.println(Math.abs(10));    // 10
        System.out.println(Math.abs(-10));   // 10

        // floor() 소수점 이하 내림, ceil() 올림, round() 반올림
        // 그렇기 때문에 *100해서 메소드 사용하고 /100 하면 소수점
        // 둘째 자리까지 표현 가능
        System.out.println(Math.floor(10.00000001));
        System.out.println(Math.ceil(10.00000001));
        System.out.println(Math.round(10.5));

        // max() , min() 매개변수 2개 비교
        System.out.println(Math.max(3.14, 3.14159)); // 3.14159
        System.out.println(Math.min(3.14, 3.14159)); // 3.14
    }
}
