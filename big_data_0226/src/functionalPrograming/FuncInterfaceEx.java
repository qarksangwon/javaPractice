package functionalPrograming;
// 함수형 인터페이스 : 자바는 함수가 없으므로 (함수 = 클래스 밖에 있는 함수)/ (클래스 안= 메소드)
// 독립적으로 함수만을 만들기 위한 문법
// 함수형 인터페이스는 함수처럼 사용돼야 하기 때문에 단 하나의 메소드만 선언돼야함.
// 어노테이션으로 @FunctionalInterface 를 선언해주면
// 컴파일러가 조건에 맞게 오류를 띄워서 도와줄 수 있음.
// 하지만 이는 old 한 문법이라고 한다... . ..

public class FuncInterfaceEx {
    public static void main(String[] args) {
        // 람다식을 사용
        Calculator cal = (a,b) -> a + b;
        System.out.println(cal.sum(3,4));

    }
}

interface Calculator{
    int sum(int a, int b);
}
