package 문제풀이;
// 호수판 제작
// 숫자와 숫자 사이 왼쪽 오른쪽으로 여백이 들어가줘야 하고
// 숫자마다 차지하는 간격이 다름
// 각 숫자 사이 여백은 1cm 여백
// 1은 2cm 차지, 0은 4cm 차지, 나머지는 모두 3cm 차지.
// 호수판의 경계와 숫자 사이에는 1cm 여백(즉 좌우 1cm씩)
// 호수판의 너비가 얼마나 되는가?
// 호수판의 들어갈 숫자의 범위는 1<=N<=9999
// 입력은 마지막에 0이 들어오기 전까지 줄 단위로 주어진다.
// 마지막의 0은 처리하지 않는다.
// 입력예시
// 120
// 5611
// 100
// 0
// 출력예시
// 13
// 15
// 14

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String outStr = "";
        List<Integer> rst = new ArrayList<>();
        while(true){
            int length = 1;
            String value = sc.nextLine();
            if(value.equals("0")) break;
            length += numLen(value);
         //   outStr += length +"\n";
            rst.add(length);
        }
        //System.out.println(outStr);
        for(int e : rst){
            System.out.println(e);
        }
    }

    public static int numLen(String num){
        char[] number;
        number = num.toCharArray();
        int numLen = 0;

        for( char i : number){
            if(i=='1') numLen +=2;
            else if(i=='0') numLen +=4;
            else numLen +=3;
            numLen += 1;
        }
        return numLen;
    }
}
