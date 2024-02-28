package 비트연산;

public class BitOperateEx {
    public static void main(String[] args) {
        byte num1 = 6;
        byte num2 = 2;
        System.out.println(num1&num2);
        System.out.println(num1|num2);
        System.out.println(num1>>2);
        System.out.println(num1<<2);
        System.out.println(num2>>1);
        System.out.println(num2<<3);
        System.out.println(~num2);
        System.out.println(num1^num2);

    }
}
