package 메소드와필드;

//오버로딩
//오버로딩의 조건
// 1. 메소드 명은 같아야 한다.
// 2. 반환 타입은 내가 리턴해 줄 타입 어느것이든 상관 없다.
// 3. 매개변수의 타입이나 개수가 반드시 달라야 한다.

public class OverloadingEx {
    public static void main(String[] args) {
        System.out.printf("%d\n", sum(10, 20, 30));
        System.out.printf("%.2f\n", sum(10.22, 20.33, 30.44));
        System.out.printf("%s\n", sum("Korea", "Seoul", "Gang-nam"));
        System.out.printf("%d\n", sum(10, "100", 50));

        // char 문자 타입은 아스키 코드 번호로 int 타입과 같이 연산할 수 있다.
        System.out.printf("%d\n", sum(10, 'A', 'B'));
    }

    static int sum(int x, int y, int z){
        return x + y + z;
    }

    static double sum(double x, double y, double z){
        return x + y + z;
    }

    static String sum(String x , String y, String z){
        return x + y + z;
    }

    static int sum(int x, String y, int z){
        if(y.equals("100")) return x + 100 + z;
        else return 0;
    }
}
