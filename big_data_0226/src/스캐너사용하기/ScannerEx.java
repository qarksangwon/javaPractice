package 스캐너사용하기;
import java.util.Scanner;


public class ScannerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        String name = sc.next();
        sc.nextLine();
        System.out.print("주소를 입력하세요 : ");
        String address = sc.nextLine();
        System.out.print("성별 입력 : ");
        char gender = sc.next().charAt(0);
        System.out.print("나이 입력 : ");
        int age = sc.nextInt()+1;

        System.out.println("=".repeat(5)+"결과"+"=".repeat(5));
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + address);
        System.out.println("성별 : " + gender);
        System.out.println("한국나이 : " + age);

    }
}
