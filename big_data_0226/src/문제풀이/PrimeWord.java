package 문제풀이;
// 이 문제에선 1도 소수로 포함
// a를 1로 b를 2로 z를 26으로, A를 27로 ~Z를 52로 하여 그 합을 구함.
// 예를 들어 cyworld 는 합이 100
// 구한 수가 소수일 경우 소수 단어,
// 판별하는 프로그램
// 단어 길이는 20자 이하
// 알파벳 소문자와 대문자로 이루어져 있다.

import java.util.Scanner;

public class PrimeWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char[] charArray = word.toCharArray();
        if(charArray.length>20) return;
        int sum = 0;
        for (char w : charArray) {
            if(w>='a'&&w<='z') sum+= w-'a'+1;
            else if(w>='A'&&w<='Z') sum+= w -'A'+27;
        }
        boolean prime = true;
        for(int i=2; i<sum; i++){
            if(sum%2==0) prime = false;
        }
        if(prime) System.out.println("It is a prime word.");
        else System.out.println("It is not a prime word.");
    }
}
