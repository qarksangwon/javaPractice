package 문제풀이;
// 2021 12월 강의실 예약하려고 한다.
// 강의실 예약은 거리두기 수칙 지켜야 한다.
// 한 명씩 앉을 수 있는 테이블이 행마다 W 개 씩 H 행에 걸쳐 있을 때,
// 참가자는 세로로 N 칸 또는 가로로 M 칸 이상 비우고 앉아야 한다.
// 즉 다른 모든 참가자와 세로줄 번호의 차가 N보다 크거나 가로줄 번호의 차가 M보다
// 큰 곳에만 앉을 수 있다.
// 최대 몇명을 수용할 수 있는지 보자.

// 입력 H, W, N, M 이 공백으로 주어진다. (0<H,W,N,M <= 50,000)
// 입력 예시
// 5 4 1 1
// 출력 예시
// 6
// W 열 , H 행, N 세로, M 가로
import java.util.Scanner;

public class Zoac4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(w%(m+1) == 0) w = w/(m+1);
        else w = w/(m+1) +1;
        if(h%(n+1) == 0) h = h/(n+1);
        else h = h/(n+1) +1;
        System.out.println(w*h);
    }
}
