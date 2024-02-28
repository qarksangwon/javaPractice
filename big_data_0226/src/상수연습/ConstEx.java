package 상수연습;
import java.util.Scanner;

public class ConstEx {
    public static void main(String[] args) {
        final double TAX_RATE = 0.10; // 세율
        Scanner sc = new Scanner(System.in);
        System.out.print("수입 입력:");
        int income = sc.nextInt();
        System.out.println("내야 할 세금 : " + income*TAX_RATE);
    }
}
