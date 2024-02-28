package 윤년계산하기;
// 윤년 ? => 지구가 한바퀴 도는데 걸리는 시간이 365일+1/4정도,
// 또한 100으로 나누어 떨어지는 년도 즉 100년단위는 윤년이 아님.
// 또한 400으로 나누어 떨어지는 년도는 또 윤년임.
// 즉 윤년의 조건은 4년단위로 끊어져야하고, 100으로나누어지면 윤년이 아니어야 하는데 400으로 나눠지면 윤년이다.

import java.util.Scanner;

public class LeapYearEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int year = sc.nextInt();
            if( year%4==0 && year%100!=0 || year%400==0 ){
                System.out.println("윤년임");
            }else{
                System.out.println("윤년이 아님");
            }
        }catch (Exception e){
            System.out.println("년도를 제대로 입력해 주세요.");
        }
    }
    public static int leapYear(int year){
        if( year%4==0 && year%100!=0 || year%400==0 ){
            return 1;
        }else{
            return 0;
        }
    }
}