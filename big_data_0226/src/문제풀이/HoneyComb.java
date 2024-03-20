package 문제풀이;
// 육각형으로 이루어진 벌집
// 중앙 방 1부터 이웃하는 방에 돌아가면서 1씩 증가,
// 중앙 1 에서 N 번방 까지 최소 개수 방을 지나서 갈 때
// 몇개의 방을 지나가는 지 계산,
// 사진 참고, 시작과 끝방 포함, 13- > 3, 58 - > 5


// 1 -> 7 -> 19 -> 37 -> 61 -> 91
// 한 레이어마다 이 전 첫숫자의 6의 배수로 더해짐
// n+6, n+12, n+18, n+24, n+30 ...
// f(n)+6r

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HoneyComb {
//    static int cnt = 1;
//    static int cal = 1;
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int val = sc.nextInt();
//        layer(val);
//        System.out.println(cnt);
//    }
//
//    static void layer(int n){
//        while(true){
//            if(n>cal){
//                cal = cal + (6*cnt);
//                cnt++;
//            }else break;
//        }
//    }
    //최적화
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int x = 1;
        int cnt = 1;
        while(N > x) {
            x += 6 * cnt;
            cnt++;
        }

        System.out.println(cnt);
    }
}
