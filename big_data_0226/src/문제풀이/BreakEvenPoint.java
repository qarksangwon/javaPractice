package 문제풀이;
// 손익분기점 계산하기
// 임대료, 재산세, 보험료, 급여 등 A 만원의 고정 비용.
// 한 대의 기기를 생산하는 재료비와 인건비 등 총 B 만원의 가변 비용.
// ex) A = 1000, b = 70일 시 한 대 생산은 1070만원이고
// 10대 생산시 1700
// 노트북 가격이 C 로 책정. 즉 A B C로 주어졌을 때 손익분기점을 구하는 프로그램.
// A B C는 21억 이하의 자연수.
// 출력은 최초 이익이 발생하는 판매량 출력. 손익분기점 존재하지 않을 시 -1 출력.

import java.math.BigInteger;
import java.util.Scanner;

public class BreakEvenPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fixCost = sc.nextInt();
        int varCost = sc.nextInt();
        int sellPrice = sc.nextInt();
        if(varCost >= sellPrice){
            System.out.println("-1");
            return;
        }
        System.out.println((fixCost/(sellPrice-varCost))+1);
    }
}
