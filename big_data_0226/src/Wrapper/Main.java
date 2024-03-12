package Wrapper;
//기본 타입    래퍼 클래스
//byte          Byte
//short         Short
//int           Integer
//long          Long
//float         Float
//double        Double
//char          Character
//boolean       Boolean

// 기본 타입과 참조 타입의 차이
public class Main {
    public static void main(String[] args) {
        Integer num = new Integer(17); // 박싱
        int n = num.intValue();        // 언박싱
        System.out.println(n);

        Character ch = 'X'; // Character ch = new Character('X'); : 오토박싱
        char c = ch;        // char c = ch.charValue();           : 오토언박싱
        System.out.println(c);
    }
}
