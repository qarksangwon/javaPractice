package 문제풀이;
//피시방엔 1번~100번까지의 자리가 있음
//손님은 모두 자기가 앉고 싶은 자리에만 앉고 싶어함.
// 입력은 첫째 줄에 손님의 수, 둘째 줄엔 앉고싶은 자리
// 맨 처음 자리는 모두 비어있고 자리에 앉으면 비우는 일은 없음


import java.util.Scanner;

public class PcRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int count = 0;
        boolean[] seat = new boolean[100];
        for(int i=0; i<total; i++){
            int wantSeat = sc.nextInt();
            if(seat[wantSeat-1]){
                count++;
            }else{
                seat[wantSeat-1] = true;
            }
        }
        System.out.println(count);
    }
}
