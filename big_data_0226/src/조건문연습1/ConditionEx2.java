package 조건문연습1;

import java.awt.*;
import java.util.Scanner;

public class ConditionEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = 0;
        int index = 2;
        while(true) {
            try {
                System.out.print("문자 입력(여러 문자 입력 시 세번째 문자만 입력됩니다.) :");
                if (start == 1) sc.nextLine();
                char ch = sc.next().charAt(index);
                if(ch>='a'&&ch<='z') {
                    System.out.println(index + 1 + "번 째 입력 문자:" + ch+"(소문자)");
                    break;
                }else if(ch>='A'&&ch<='Z'){
                    System.out.println(index + 1 + "번 째 입력 문자:" + ch+"(대문자)");
                    break;
                }else{
                    System.out.println(index + 1 + "번 째 입력 문자:" + ch);
                    break;
                }
            }catch (Exception e){
                System.out.println(index+1+"개 이상 문자가 입력되지 않았습니다.");
            }
        }
    }
}
