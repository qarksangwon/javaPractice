package 문제풀이;
// 시간조절용 A, B, C버튼 존재. 각 5분, 1분, 10초이다.
// 음식이 조리될 때 걸리는 (전자레인지) 시간 T
// A, B, C를 누른 횟수의 합은 항상 최소로 할 때
// 최소로 버튼을 누르는 횟수를 출력하고
// 세 버튼으로 떨어지지 않는 조리시간 , 즉 1초단위가 있으면 -1출력
// 1<= T <= 10,000


import java.util.Scanner;

public class Microwave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        while(true) {
            T = sc.nextInt();
            if(T>=1&&T<=10000) break;
            else sc.nextLine();
        }
        if(T%10>0) System.out.println(-1);
        else {
            System.out.println((T/300) + ((T%300)/60) + ((T%300)%60)/10);
        }
    }
}
