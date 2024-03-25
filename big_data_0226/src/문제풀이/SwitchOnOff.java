package 문제풀이;
// 1부터 연속적 번호가 붙어 있는 스위치.
// 스위치는 ON : 1 or OFF : 0
// 학생들에게 1 이상이고 스위치 개수 이하인 자연수를 하나씩 나눠줌.
// 남학생은 자기가 받은 번호의 배수 스위치 상태 바꿈.
// 스위치 1~8번, 3받으면 3,6 스위치 변경
// 여학생은 자기가 받은 스위치 중심으로 좌우 대칭이면서
// 가장 많은 스위치를 포함하는 구간을 찾아 그 구간의 스위치를 모두 바꿈.
// 구간에 속한 스위치 개수는 항상 홀수.
// 01110101 에서 3을 받으면
// 01 1 10 쭉 대충이니 10001로 변경하고,
// 4를 받았다면 110 이기 때문에 자기 번호만 변경 100

//입력 첫줄엔 스위치 개수, ex) 8
// 둘째 줄에는 스위치 상태  ex) 0 1 0 1 0 0 0 1
// 넷 째 줄부터 마지막 줄 까지 한 줄에 학생 성별, 받은 수.
// 남자는 1, 여자는 2
// 총 연산이 모두 끝난 뒤에 나온 스위치 공백 넣어서 출력.

import java.util.Scanner;

public class SwitchOnOff {
    static Scanner sc = new Scanner(System.in);
    static int[] switchArr;
    static int std;
    public static void main(String[] args) throws Exception {
        switchArr = new int[sc.nextInt()];
        for(int i = 0 ; i < switchArr.length; i++){
            switchArr[i] = sc.nextInt();
        }
        std = sc.nextInt();
        for(int j = 0; j < std; j ++){
            int gen = sc.nextInt();
            int val = sc.nextInt();
            change(gen, val);
        }
        int count = 0;
        for(int e : switchArr) {
            System.out.print(e + " ");
            count ++;
            if(count%20 == 0) System.out.println();
        }

    }
    public static void change(int gender, int value) throws Exception{
        if(gender == 1){
            int i = 1;
            while((value*i)-1<switchArr.length){
                if(switchArr[value*i-1] == 1) switchArr[value*i-1] = 0;
                else switchArr[value*i-1] = 1;
                i++;
            }
        }else {
            int i = value-2;
            int j = value;
            while(true){
                if(i<0 || j>=switchArr.length) {
                    if(switchArr[value-1]==1) switchArr[value-1] =0;
                    else switchArr[value-1] = 1;
                    break;
                }
                if(switchArr[i] == switchArr[j]){
                    if(switchArr[i] == 1) switchArr[i] = 0;
                    else switchArr[i] = 1;
                    if(switchArr[j] == 1) switchArr[j] = 0;
                    else switchArr[j] = 1;
                    i--;
                    j++;
                }
                else{
                    if(switchArr[value-1]==1) switchArr[value-1] =0;
                    else switchArr[value-1] = 1;
                    break;
                }
            }
        }
    }
}
