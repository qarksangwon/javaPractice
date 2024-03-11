package 문제풀이;
//전자 제품에는 저항이 들어간다. 저항은 색 3개를 이용해서 그 저항이 몇 옴인지 나타낸다.
// 처음 색 2개는 저항의 값이고,
// 마지막 색은 곱해야 하는 값이다. 저항의 값은 다음 표를 이용해서 구한다.
//첫째 줄에 첫 번째 색, 둘째 줄에 두 번째 색, 셋째 줄에 세 번째 색이 주어진다.
// 위의 표에 있는 색만 입력으로 주어진다.
//예제 입력 1
//yellow
//violet
//red
// 출력
//4700


import java.util.Scanner;

public class Resist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = {"black","brown","red","orange","yellow","green",
        "blue","violet","grey","white"};
        String rst = "";
        for(int j = 0; j < 3; j ++) {
            String input = sc.nextLine();
            for (int i = 0; i < str.length; i++) {
                if (input.equals(str[i])){
                    if(j<2) rst+=Integer.toString(i);
                    else rst+="0".repeat(i);
                }
            }
        }
        System.out.println(rst);
    }
}
