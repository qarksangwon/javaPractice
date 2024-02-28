package 조건문기본;
// 삼항, if else, switch case

import java.util.Scanner;

public class ConditionEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력:");
        int start = 0;
        while(true) {
            try {
                if(start ==1){
                    sc.nextLine();
                }
                int num1 = sc.nextInt();
                sc.nextLine();
                if (num1 > 0) {
                    System.out.println("양수 입니다.");
                } else if (num1 < 0) {
                    System.out.println("음수 입니다.");
                } else {
                    System.out.println("0 입니다.");
                }
                break;
            } catch (Exception e) {
                System.out.println("정수만 입력 바랍니다.");
                if(start == 0) start +=1;
            }
        }

    }
}
