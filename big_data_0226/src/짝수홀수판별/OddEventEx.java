package 짝수홀수판별;

import java.util.Scanner;

public class OddEventEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("☆홀★짝☆판★별기☆");
        int start = 0;
        while(true) {
            try {
                System.out.print("수를 입력해 주세요:");
                if(start>=1) {
                    sc.nextLine();
                }
                int val = sc.nextInt();
                System.out.println(val%2==0?"짝수":"홀수");
                break;
            } catch (Exception e) {
                System.out.println("정수만 입력 바랍니다.");
                if(start==0) start +=1;
            }
        }
    }
}
