package 대소문자변경;
// 소문자 -> 대문자, 대문자 -> 소문자
// ex) AbCdEf ==> aBcDeF

import java.util.Scanner;

//ASCII 대문자 65~90, 소문자 97~122
public class UpperLowerEx {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            if (str.length() > 100) {
                continue;
            }
            char[] word = str.toCharArray();
            for (char c : word) {
                if (c >= 65 && c <= 90) {
                    c += 32;
                } else if (c >= 97 && c <= 122) {
                    c -= 32;
                }
                System.out.print(c);
            }
            break;
        }
    }
}
