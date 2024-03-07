package 문제풀이;
// 알파벳 대소문자 단어 주어지면 가장 많이 사용된 알파벳 무엇인지 알아내는 프로그램.
// 대, 소문자 구별하지 않음.
// 여러개 존재하는 경우 ? 출력.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 내가 짠 코드
//        String str = sc.nextLine();
//        str = str.toUpperCase();
//        char[] lst = str.toCharArray();
//        //abcdefghijzlmnopqrstuvwxzy
//        int[] word = new int[26];
//        for(char i : lst){
//            word[i-65]++;
//        }
//        boolean oneCheck = false;
//        int max = 0;
//        int maxIndex = 0;
//        for(int j=0; j<word.length; j++){
//            if(max<word[j]){
//                oneCheck = false;
//                max = word[j];
//                maxIndex = j;
//            }else if(max == word[j] && max != 0){
//                oneCheck = true;
//            }
//        }
//        if(!oneCheck){
//            char rst = (char)(maxIndex+'A');
//            System.out.println(rst);
//        }else{
//            System.out.println("?");
//        }



//        최적화 코드
        int[] alphabet = new int[26];
        int max = 0;
        char result = 0;
        System.out.print("단어 입력 : ");
        String word = sc.nextLine();
        word = word.toLowerCase();
        for(int i =0; i<word.length(); i++){
            alphabet[word.charAt(i) - 'a']++;
        }
        for(int i =0; i<alphabet.length; i++){
            if(alphabet[i] == max) result = '?';
            else if(alphabet[i] > max){
                max = alphabet[i];
                result = (char)('A'+i);
            }
        }
        System.out.println(result);
    }
}
