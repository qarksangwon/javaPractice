package 문자열;

import java.awt.*;

public class StringEx {
    public static void main(String[] args) {
        String a = "Hello Java";  //리터럴 상수 = static 구역
        String b = new String("b"); //객체 생성 방식 = heap 구역
        String c = new String("b");
        // 따라서 new 없이 생성한 String 은 ==으로 주소값이 같은걸 비교할 수 있지만
        // new 객체로 생성한 String 은 heap 구역에 제각각 저장되기 때문에 주소 자체가 다름

        // 문자열 내장 메소드
        // 1. 비교 연산 (equals)
        String str1 = "hello";
        String str2 = "Hello";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2)); // 대소문자 무시

        // 2. 특정 문자가 시작하는 인덱스 반환 (indexOf)
        String str3 = "Hello java";
        System.out.println(str3.indexOf("java")); // "java"가 시작하는 인덱스를 찾아줌

        // 3. 포함 여부 확인 (contains)
        System.out.println(str3.contains("oj")); // 중간에 공백도 문자에 포함되는것

        // 4. 특정 위치의 문자(char) 반환
        System.out.println(str3.charAt(6));

        // 5. 특정 문자열을 다른 문자열로 바꾸기 (replace)
        String str4 = "Java is fun";
        String str5 = str4.replace("a","i");
        String str6 = str4.replaceAll("a","i"); // 정규식 사용 가능
        String str7 = str4.replaceAll("\\s", ""); // 이런식으로
        String str8 = str4.replaceFirst("a","i");
        System.out.println(str5);
        System.out.println(str6);
        System.out.println(str7);
        System.out.println(str8);

        // 6. 특정 부분 뽑아 낼 때 (subString)
        System.out.println(str3.substring(2)); // index 2 부터 ~
        System.out.println(str3.substring(2,4)); // index 2부터 4미만

        // 7. 앞뒤 공백 제거 (trim)
        String str9 = "    끼얏호    ";
        System.out.println(str9.trim());

        // 8. 특정 문자를 기준으로 분리해서 배열에 저장할 때 (split)
        String str10 = "24:10:12";
        String[] strArray;
        strArray = str10.split(":");
        System.out.println(strArray[0]+"년"+strArray[1]+"시"+strArray[2]+"분");

        // 9. 문자열 포매팅 (format) == printf 와 같은 방식
        String strf = String.format("I like %s, I have %d fingers","apple",5);
        System.out.println(strf);

        // 10. 문자 열을 문자 배열로 (toCharArray)
        char[] word = strf.toCharArray();
        System.out.println(word.length);

        // 11. 문자열 전체 대문자/ 소문자 변경
        String strr = "Hello Java";
        System.out.println(strr.toUpperCase());
        System.out.println(strr.toLowerCase());
    }
}
