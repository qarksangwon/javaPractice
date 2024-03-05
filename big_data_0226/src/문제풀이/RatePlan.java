package 문제풀이;
// 요금제는 2개
// 1요금제는 30초마다 10원씩 청구, 0초~29초 =10원 , 30초~59초 = 20원
// 2요금제는 60초마다 15원씩 청구, 0~59초 =15원, 60초~119초 = 30원
// 즉 요금제는 기본 요금 + 각 요금마다 나누어 떨어질때마다 *요금하면된다.
// 첫줄 입력은 통화의 개수 N, 0<N<=20
// 둘째 줄 통화시간 M, 0<M<=10,000 (입력 형식 10 20 30 40)
// 싼 요금제의 이름과 공백 한칸을 두고 몇 원 나오는지 출력.
// 만일 두 요금제의 요금이 같을 시 Y 요금제 출력 후 M 요금제 출력.

import java.util.Scanner;

public class RatePlan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yTotalPrice = 0;
        int mTotalPrice = 0;
        int callCount;
        while(true){
            callCount = sc.nextInt();
            if(callCount>20||callCount<=0) sc.nextLine();
            else break;
        }
        int[] callTime = new int[callCount];
        for(int i = 0; i < callCount; i++){
            int timeValue;
            while(true){
                timeValue = sc.nextInt();
                if(timeValue<0||timeValue>10000) {
                    sc.nextLine(); 
                    i = 0;
                }
                else break;
            }
            callTime[i] = timeValue;
        }
        for(int time : callTime){
            yTotalPrice += (((time/30)*10)+10);
            mTotalPrice += (((time/60)*15)+15);
        }
        if(yTotalPrice<mTotalPrice) System.out.println("Y "+yTotalPrice);
        else if(mTotalPrice<yTotalPrice) System.out.println("M "+mTotalPrice);
        else System.out.println("Y "+yTotalPrice+" M "+ mTotalPrice);

    }
}
