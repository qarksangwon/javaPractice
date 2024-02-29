package 반복문;

import java.util.Scanner;

public class WhileEx1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        WhileEx1.ex6();
    }

    public static void ex1(){
        int n = sc.nextInt();
        for(int i=n; i>=0; i--){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void ex2(){
        System.out.print("숫자 더하기: ");
        int n = sc.nextInt();
        int sum = 0;
        while(n>0){
            sum +=n;
            n-=1;
        }
        System.out.println(sum);
    }

    public static void ex3(){
        int i =0;
        while(true){
            System.out.print("나이 입력:");
            int age = sc.nextInt();
            if(age >= 0 && age<200){
              System.out.println(2024-age+"년생 입니다.");
              break;
            }
            System.out.println("혹시 좀비?");
        }
    }

    public static void ex4(){
        int age;
        do{
            System.out.print("나이 입력:");
            age = sc.nextInt();
        }while(age>200||age<0);
        System.out.println(2024 - age + "년생 입니다.");

    }

    public static void ex5() {
        // 양의 정수 n 입력받아 n*n 크기의 행렬 출력
        int n = sc.nextInt();
        int i =1;
        while(i<=(n*n)){
            // printf 형식쓰면 더 깔끔하게 가능함.
            /*if(i<10) {
                System.out.print("   " + i);
            }else if(i<100){
                System.out.print("  "+i);
            }else{
                System.out.print(" "+i);
            }*/

            System.out.printf("%4d",i);
            if(i%n==0){
                System.out.println(" ");
            }
            i++;
        }

    }

    public static void ex6(){
        //입력 받은 수가 소수인지 아닌지 판별(소수 - 약수가 1과 자기자신인것)
        int start = 0;
        while(true) {
            try {
                if(start==1) sc.nextLine();
                int n = sc.nextInt();
                if (n == 1 || n == 0) System.out.println("소수 아님");
                else {
                    boolean ok = false;
                    for (int i = 2; i < n; i++) {
                        if (n % i == 0) ok = true;
                    }
                    if (ok) System.out.println("소수 아님");
                    else System.out.println("소수");
                }
                break;
            } catch (Exception e) {
                System.out.println();
                if(start==0) start++;
            }
        }
    }
}
