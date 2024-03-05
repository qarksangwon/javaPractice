package 문제풀이;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieTicketing mt = new MovieTicketing(13000);
        while(true){
            System.out.println("[1]예매하기");
            System.out.println("[2]종료하기");
            int selMenu = sc.nextInt();
            if(selMenu == 1) mt.selectSeat();
            else {
                System.out.println(mt.totalAmount());
                return;
            }
        }

    }
}

