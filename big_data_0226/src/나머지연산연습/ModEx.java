package 나머지연산연습;
// 100의 자리 정수 입력받아서 3개의 변수에 나눠 남기 (ex 257 -> a2 b5 c7)
//

import java.util.Scanner;

public class ModEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = 0;
        while(true) {
            try {
                if(start>=1) {
                    sc.nextLine();
                }
                int val = sc.nextInt();
                if(val >1000){
                    System.out.println("100의 자리 까지만 입력해 주세요.");
                    continue;
                }
                int val100 = val / 100;
                int val10 = (val % 100) / 10;
                int val1 = val % 10;
                System.out.println("a :" + val100);
                System.out.println("b :" + val10);
                System.out.println("c :" + val1);
                break;
            } catch (Exception e) {
                System.out.println("정수만 입력 바랍니다.");
                start +=1;
            }
        }

    }
}
