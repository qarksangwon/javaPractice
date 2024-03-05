package 문제풀이;
// 0보다 크거나 같고 99보다 작거나 같은 정수가 주어질 때 다음과 같이 연산 가능.
// 주어진 수가 10보다 작으면 앞에 0을 붙여 두자리 수로 만들고 각 자리 숫자 더함.
// 다음 주어진 수의 가장 오른쪽 자리 수와 합의 오른쪽 자리 수를 이어 붙이면 새로운 수 만듬
// ex) 26 => 2+6=8 => 6+8=14 => 8+4=12 => 4+2=6 =>26 -> 4번만에 돌아옴.
// 즉 이 26의 사이클 길이는 4
// 더할 때 count 해서 조합해서 출력하면될듯.

//첫 줄애 N 주어지는데 0보다 크거나 같고 99보다 작거나 같은 정수.

import java.util.Scanner;

public class SumCycle {
    static Scanner sc = new Scanner(System.in);
    static int value = sc.nextInt();
    static int cnt = 0;

    public static void main(String[] args) {
        System.out.println(sumCycleRoutine(value/10,value%10));
    }
    public static int sumCycleRoutine(int fv, int sv){
        cnt++;
        if((sv*10+((fv+sv)%10))==value) return cnt;
        else{
              int opVal = (fv+sv)%10;
              return sumCycleRoutine(sv,opVal);
        }
    }
}
