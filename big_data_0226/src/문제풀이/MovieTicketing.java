package 문제풀이;
// 영화표 예매 시스템
// 사용자가 좌석을 선택하고 선택한 좌석 수에 따라 총 금액 계산
// 1. 예매하기와 종료하기 메뉴 설정
//       - 예매하기는 좌석 상태 보여준 뒤 에약 받음
//       - 예약 하게되면 에약된 상태를 보여줌
//       - 종료 시 총 금액 출력
// 2. 좌석은 총 10개
// 3. 각 좌석당 판매 가격은 생성자를 통해 넣을 수 있도록.


import java.util.Scanner;

public class MovieTicketing {
    private int[] seat = new int[10];
    private int ticketPrice;

    MovieTicketing(int ticketPrice){
        this.ticketPrice = ticketPrice;
    }
    public void showSeat(){
        for(int i = 0; i < 10; i++){
            if(seat[i]==0) System.out.print("[ ]");
            else System.out.print("[V]");
        }
        System.out.println();
    }
    public void selectSeat(){
        showSeat();
        Scanner sc = new Scanner(System.in);
        System.out.print("좌석 번호 입력 : ");
        int seatNum = sc.nextInt();
        if(seat[seatNum-1]==1) System.out.println("이미 예약된 좌석입니다.");
        else{
            seat[seatNum-1] = 1;
            showSeat();
        }
    }

    public int totalAmount(){
        int cnt = 0;
        for (int val : seat){
            if(val==1) cnt ++;
        }

        return cnt*ticketPrice;
    }
}
