package 문제풀이;
// 정수 N 개로 이루어진 배열 A와 정수 X.
// A에서 X보다 작은 수를 모두 출력.
// 첫 줄에 N과 X 주어짐 (1 <= N, X <= 10,000)
// 입력 예시
// 10 5
// 1 10 4 9 2 3 8 5 7 6
// 출력 예시
// 1 4 2 3

import java.util.Scanner;

public class IntegerX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array = sc.nextInt();
        int x = sc. nextInt();
        for(int i=0 ; i<array; i++){
            int n = sc.nextInt();
            if(n<x) System.out.print(n+ " ");
        }
    }
}
