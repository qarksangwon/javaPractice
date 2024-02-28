package 시스템입출력;
import java.util.Scanner;


public class SystemInOut {
    public static void main(String[] args) {
        String name = "곰돌이 사육사";
        String address = "서울시 강남구 역삼동";
        char gender ='M';
        int age = 22;
        int kor = 99;
        int eng = 88;
        int mat = 40;
        double aver = (double)(kor+eng+mat)/3.0;

        System.out.println("=".repeat(5)+"자바 스타일"+"=".repeat(5));
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + address);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);
        System.out.println("총점 : " + (kor+eng+mat));
        System.out.println("평균 : " + (Math.round(aver*100)/100.0));
        System.out.println();

        System.out.println("=".repeat(5)+"C 스타일"+"=".repeat(5));
        System.out.printf("이름 : %s \n",name );
        System.out.printf("주소 : %s \n" ,address );
        System.out.printf("성별 : %c \n" , gender);
        System.out.printf("나이 : %d \n" , age);
        System.out.printf("총점 : %d \n" , kor+eng+mat);
        System.out.printf("평균 : %.2f\n", aver);



    }
}
