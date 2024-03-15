package methodReference;

import java.util.function.IntBinaryOperator;

public class methodRefEx {
    public static void main(String[] args) {
        IntBinaryOperator operator;

        //정적 메소드 참조 ---------------------------------
        //람다 방식
        operator = (x, y) -> Calculator.staticMethod(x, y);
        System.out.println("결과1: " + operator.applyAsInt(1, 2));
        //메소드 참조 방식 => :: 사용
        operator = Calculator :: staticMethod;
        System.out.println("결과2: " +  operator.applyAsInt(3, 4));

        //인스턴스 메소드 참조 ---------------------------
        Calculator obj = new Calculator();
        // 람다 방식
        operator = (x, y) -> obj.instanceMethod(x, y);
        System.out.println("결과3: " + operator.applyAsInt(5, 6));

        // 메소드 참조 방식 => :: 사용
        operator = obj :: instanceMethod;
        System.out.println("결과4: " + operator.applyAsInt(7, 8));
    }
}

class Calculator {
    public static int staticMethod(int x, int y) {
        return x + y;
    }
    public int instanceMethod(int x, int y) {
        return x + y;
    }
}