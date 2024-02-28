package 스위치문연습;

import java.util.Scanner;

public class SwitchEx2 {
    public static void main(String[] args) {
        int x, y;
        char op;
        Scanner sc = new Scanner(System.in);
        System.out.print("계산식 입력:");
        x= sc.nextInt();
        op = sc.next().charAt(0);
        y=sc.nextInt();
        switch (op){
            case '*':
                System.out.println(x*y);
                break;
            case '+':
                System.out.println(x+y);
                break;
            case '-':
                System.out.println(x-y);
                break;
            case '/':
                System.out.println(x/y);
                break;
            default:
                System.out.println("오류");
        }
    }
}
