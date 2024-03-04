package 상근날드;
// 햄버거 3종류 (상덕버거, 중덕버거, 하덕버거)
// 음료 2종류 (콜라, 사이다)
// 세트는 햄버거와 음료 비율이 1:1이고 단품 가격의 합보다 세트는 50원 싸다.
// 차례로 다섯번 입력, 세번 째 까지는 햄버거 나머지 두 입력은 음료
// 제일 싼 버거와 음료를 선택했을 시 세트 가격

import java.util.Scanner;

public class Burger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] burgerPrice = new int[3];
        int[] juicePrice = new int[2];
        int b=0,j=0,i=0;
        while(true) {
            int price = sc.nextInt();
            if(price<500||price>1000)continue;
            if (i < 3) {
                burgerPrice[b] = price;
                b++;
            } else {
                juicePrice[j] = price;
                j++;
            }
            i++;
            if(i==5) break;
        }
        int cheapBurger =burgerPrice[0], cheapJuice =juicePrice[0];
        for(int index1 : burgerPrice){
            if(cheapBurger>i){
                cheapBurger = index1;
            }
        }
        for(int index2 : juicePrice){
            if(cheapJuice>index2){
                cheapJuice = index2;
            }
        }
        System.out.println((cheapBurger+cheapJuice)-50);
    }
}
