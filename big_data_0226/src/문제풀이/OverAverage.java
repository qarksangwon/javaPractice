package 문제풀이;
// 첫 줄에 테스트 케이스 개수 C 주어짐
// 두번 째 줄부터 각 테스트 케이스마다 학생 수 (1<= N <=1000, N은 정수)
// 학생수 N이 주어지고 N명의 점수가 주어짐. 점수는 0~100
// 각 케이스마다 한 줄씩 평균을 넘는 학생의 비율을 반올림 해서 소수점 셋째 자리까지 출력
//입력
//5
//5 50 50 70 80 100
//7 100 95 90 80 70 60 50
//3 70 90 80
//3 70 90 81
//9 100 99 98 97 96 95 94 93 91
//출력
//40.000%
//57.143%
//33.333%
//66.667%
//55.556%



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OverAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tCnt = sc.nextInt();
        List<Double> rst = new ArrayList<Double>();
        for(int i=0; i<tCnt; i++){
            int current = sc.nextInt();
            int[] currents = new int[current];
            for(int j=0; j<current; j++){
                currents[j] = sc.nextInt();
            }
            rst.add(ratio(current,currents));
        }
        for(double d : rst) System.out.printf("%.3f%% \n",d);
    }

    static double ratio(int stdCnt, int[] score){
        int cnt = 0;
        int sum = 0;
        for(int e : score) sum +=e;
        int avg = sum/stdCnt;
        for(int c : score){
            if(c > avg) cnt++;
        }
        double ratio = (double) Math.round(((100 * cnt) / (double) stdCnt) * 1000) /1000;
        return ratio;
    }

}
// 총인원 : 100 / 평균넘는인원 : 비율
// 비율 x 총인원 = 100 x 평균넘는인원
// 비율 = (100*평균넘는인원)/총인원
