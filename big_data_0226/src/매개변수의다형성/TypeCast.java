package 매개변수의다형성;

import java.util.Scanner;

public class TypeCast {
    public static void main(String[] args) {
        Buyer client = new Buyer();
        TV tv = new TV();
        Computer pc = new Computer();
        Audio audio = new Audio();
        client.viewInfo();
        Scanner sc = new Scanner(System.in);
        System.out.print("구입할 제품을 입력(TV[1] Computer[2] Audio[3] 종료[4]) : ");
        while(true){
            int selNum = sc.nextInt();
            switch (selNum){
                    case 1:
                        client.buy(tv);
                        break;
                    case 2:
                        client.buy(pc);
                        break;
                    case 3:
                        client.buy(audio);
                        break;
                    case 4:
                        client.viewInfo();
                        return;
                    default:
                        System.out.println("뭘 선택한거니?");
                        break;
                    }
        }

    }
}

class Product{
    int price;
    int bonusPoint;
}

class TV extends Product{
    TV(){
        this.price = 100;
        this.bonusPoint = 10;
    }
}
class Computer extends Product {
    Computer(){
        this.price = 200;
        this.bonusPoint = 20;
    }
}

class Audio extends Product{
    Audio(){
        this.price = 120;
        this.bonusPoint = 12;
    }
}

class Buyer{
    int money = 1000;
    int bonusPoint = 0;
    void buy(Product p){
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println("잔액 : " +money);
    }
    void viewInfo(){
        System.out.println("잔액 : " + money);
        System.out.println("포인트 : " + bonusPoint);
    }
}