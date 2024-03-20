package 문제풀이;
// 강 위에 다리 놓을것
// 강의 서쪽에는 N 개의 사이트 , 동쪽에는 M 개의 사이트
// N<=M
// 서쪽의 사이트와 동쪽의 사이트에 연결하는 데
// 하나의 사이트에 하나의 다리만 연결 가능.
// 다리끼리는 서로 겹쳐질 수 없을 때, 지을 수 있는 경우의 수를 구한다.
//입력의 첫 줄에는 테스트 케이스의 개수 T가 주어진다.
// 그 다음 줄부터 각각의 테스트케이스에 대해
// 강의 서쪽과 동쪽에 있는 사이트의 개수 정수 N, M (0 < N ≤ M < 30)이 주어진다.

// 입력 예시
//3
//2 2
//1 5
//13 29
//출력 예시
//1
//5
//67863915
// 중복 없이 순서에 상관 있게 -순열
// nPr -> n!/(n-r)!
//중복 없이 순서와 상관 없게 오른쪽 다리를 왼쪽 다리개수만큼 =조합
// nCr -> n!/r!(n-r)!
import java.math.BigInteger;
import java.util.Scanner;

public class Bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer rst = new StringBuffer();
        int cnt = sc.nextInt();
        for(int i =0; i<cnt; i++){
            int west = sc.nextInt();
            int east = sc.nextInt();
            rst.append(nCr(east,west)+"\n");
        }
        System.out.println(rst);
    }

    static BigInteger nCr(int n, int r) {
        BigInteger numerator = factorial(n);
        BigInteger denominator = factorial(n - r).multiply(factorial(r));
        return numerator.divide(denominator);
    }

    static BigInteger factorial(int v) {
        if(v <= 1) return BigInteger.ONE;
        else return factorial(v - 1).multiply(BigInteger.valueOf(v));
    }
}
