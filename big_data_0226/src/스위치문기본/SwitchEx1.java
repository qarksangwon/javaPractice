package 스위치문기본;

import java.util.Scanner;

public class SwitchEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = 0;

        while(true) {
            System.out.print("성별 입력(M/m,F/f) : ");
            if(start ==1) sc.nextLine();
            char gender = sc.next().charAt(0);
            switch (gender) {
                case 'M':
                case 'm':
                    System.out.println("남성");
                    break;
                case 'F':
                case 'f':
                    System.out.println("여성");
                    break;
                default:
                    System.out.println("잘못 입력했습니다.");
                    continue;
            }
            break;
        }
    }
}
