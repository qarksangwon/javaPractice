package 문제풀이;
// 배열의 갯수를 입력 받아 배열의 길이만큼 랜덤 수 생성해 배열에 추가
// 임의의 수를 입력 받아 배열 내에 해당 값이 존재하는 지 확인
// 임의의 수는 1에서 배열의 크기 만큼 임의의 수 (길이 100 >> 1~100)
// 존재하지 않으면 -1 출력


import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("배열 크기 입력 : ");
//        int len = sc.nextInt();
//        int[] array = new int[len];
//        System.out.print("찾을 수 입력 : ");
//        int ranVal = sc.nextInt();
//        boolean isOK = false;
//        for(int i = 0; i < len; i ++){
//            array[i] = (int)(Math.random()*len)+1;
//            if(array[i] == ranVal) isOK = true;
//        }
//        System.out.print("배열 안의 값 : ");
//        for (int e : array) System.out.print(e+" ");
//        System.out.println();
//        if(isOK) System.out.println("존재 : " + ranVal);
//        else System.out.println("-1");

        //Arrays 의 이진검색 사용 시
        System.out.print("배열의 갯수 : ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("찾을 수를 입력 : ");
        int key = sc.nextInt();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * num) + 1;
        }
        Arrays.sort(arr);
        for(int val : arr) System.out.print(val + " ");
        System.out.println();
        int result = Arrays.binarySearch(arr, key);
        if(result >= 0) System.out.println("존재");
        else System.out.println(-1);
    }
}
