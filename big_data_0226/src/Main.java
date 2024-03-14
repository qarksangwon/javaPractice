import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("이동 지역 선택 [1]부산 [2]대전 [3]강릉 [4]광주 : ");
//        int endPoint = sc.nextInt();
//        System.out.print("이동할 승객 수 입력: ");
//        int people = sc.nextInt();
//        System.out.print("이동할 차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
//        int choice = sc.nextInt();
//        System.out.print("부가기능 [1]ON [2]OFF");
//        int function = sc.nextInt();

        Tt t1 = new Tt("123");
        Tt t2 = new Tt("123");
        System.out.println(t1.equals(t2));
        System.out.println(t1 == t2);
    }
}

class Tt {
    String name;
    public Tt (String name) {
        this.name = name;
    }
}