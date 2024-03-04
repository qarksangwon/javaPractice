package 문제풀이;
//첫 번째는 성을 모두 쓰고 이를 하이픈(-) 으로 이어붙인것.
// ex) Knuth-Morris-Pratt
//이렇게 출력되는 문자를 이어붙이면 된다.

import java.util.Scanner;

public class Kmp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 스플릿으로 앞자 따오기
        String[] pullN = sc.nextLine().split("-");
        for(String str : pullN){
            System.out.print(str.charAt(0));
        }

        System.out.println();

        // 대문자인것만 출력하기
        String pullN2 = sc.nextLine();
        for(int i =0; i<pullN2.length();i++){
            if(pullN2.charAt(i)>='A'&&pullN2.charAt(i)<='Z'){
                System.out.print(pullN2.charAt(i));
            }
        }

    }
}
