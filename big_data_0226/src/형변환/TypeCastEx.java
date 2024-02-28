package 형변환;

public class TypeCastEx {
    public static void main(String[] args) {
        int num1 = 1, num2 = 4;
        double result1 = num1/num2;
        double result2 = num1/(double)num2;
        //num2 = 명시적 형변환, num1 = 묵시적 형 변환
        System.out.println(result1);
        System.out.println(result2);

        int value1 = Integer.parseInt("123");
        System.out.println(value1);
    }
}
