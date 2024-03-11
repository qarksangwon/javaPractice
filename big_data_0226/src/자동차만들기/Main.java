package 자동차만들기;
// 1리터에 2000원
// 연비 = 리터당 주행 거리, 부산400km 강릉200km 대전150km 광주300km
// 출발 시 연료는 없으며, 한 번 주유할 때 무조건 가득 채운다.
// 이동 횟수는 편도로 가는 횟수만 계산
// 이동 시간은 차량의 최고 속도 기준 계산

//기능은 지역 선택 -> 승객 수 선택 -> 차량 선택 -> 부가 기능 ON/OFF 선택

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in); // 입력에 대한 예외 처리를 위해 전역 변수로 선언.

    public static void main(String[] args) {
        int endPoint;
        int people;
        int choice;
        int function;
        boolean onOff;
        int pcnt =0;

        endPoint = returnSVal("이동 지역 선택 [1]부산 [2]대전 [3]강릉 [4]광주",1);
        people = returnSVal("이동할 승객 수 입력(1~100)",2);
        choice = returnSVal("이동할 차량 선택 [1]스포츠 카 [2]승용차 [3]버스",3);
        function = returnSVal("부가기능 [1]ON [2]OFF",4);
        onOff = (function==1)? true:false; // 나중의 기능 구현의 연산을 위해 부가 기능의 사용 여부 저장
        int[] nav = {0, 400, 200, 150, 300}; // 도착지 거리를 사용한 연산 위해 index 1~4 에 각 1,2,3,4번에 맞는 거리 저장

        CarForm car = null; // 어느 차를 선택 했을지 모르기 때문에 그들의 추상 타입 변수 car 선언

        // 선택한 차량의 실제 객체를 만드는 부분
        // 1:스포츠 카, 2:승용차, 3:버스
        // pcnt 변수는 이동할 인원 수를 통해 이동 횟수를 구해 총 이동 거리를 얻기 위한 변수
        if(choice == 1){
            car = new SportCar("Ferrari");
            car.onOff(onOff);
            pcnt = people%2==0?people/2:people/2+1;
        } else if (choice == 2) {
            car = new Car("GV80");
            car.onOff(onOff);
            if(onOff){ // 승용차 이용 이동 횟수는 부가 기능에 따라 달라짐.
                pcnt = people%5==0?people/5:people/5+1;
            }
            else pcnt = people%4==0?people/4:people/4+1;
        } else if (choice == 3) {
            car = new Bus("관광버스");
            car.onOff(onOff);
            pcnt = people%20==0?people/20:people/20+1;
        }else {
            System.out.println("선택하신 차가 없습니다.");
        }

        // 총 비용은 (총 거리* 가야할 횟수)/연비 => 모두 도착하기 위해 걸리는 연료 량
        // 나온 값을 해당 차의 연료 탱크의 크기로 나눈 뒤 몇 번 주유 하는 지 선택 한 뒤
        // 해당 나온 횟수 만큼 연료 통의 크기를 곱해 리터당 가격인 2000을 곱하면 총 가격이 나옴.
        // 이는 한번 주유할 때 무조건 연료 탱크를 가득 채우는 기준.

        int totalPrice=totalLitter(choice,(nav[endPoint]*pcnt/car.fe),onOff)*2000;
        
        int cnt = 0;
        int litter = (nav[endPoint]*pcnt/car.fe);
        if(litter % car.fuelBox != 0){
            cnt = litter / car.fuelBox + 1;
        }else cnt = litter / car.fuelBox;
        

        // 시간은 거리/시속 => n.xx 시간 * 60 => a 분 인것을 이용.
        double totalTime = (double)nav[endPoint]*pcnt/car.speed;
        totalTime *= 60;
        int hour = (int) (totalTime/60);
        int min = (int)(totalTime-hour*60);


        System.out.println("\n====="+car.carName+"=====");
        System.out.println("총 비용 : " + totalPrice + "원");
        System.out.println("총 주유 횟수 : " + cnt + "회");
        System.out.println("총 이동 시간 : " + hour+"시간 "+ min+"분");

    }

    //예외 처리 담당 메소드
    public static int returnSVal(String question, int qCnt){
        int val;
        while(true){
            try{
                System.out.print(question+" : ");
                val = sc.nextInt();
                boolean isOK = false;
                switch (qCnt){
                    case 1:
                        if(val>=1&&val<=4) isOK = true;
                        break;

                    case 2:
                        if(val>=1&&val<=100) isOK = true;
                        break;

                    case 3:
                        if(val>=1&&val<=3) isOK = true;
                        break;

                    case 4:
                        if(val==1||val==2) isOK = true;
                        break;

                    default:
                        System.out.println("해당 질문은 아직 만들지 않음.");
                }
                if(isOK) break;
                else System.out.println("선택지 중에서 입력 바랍니다.\n");
            }catch (Exception e){
                System.out.println("숫자로만 입력 바랍니다.\n");
                sc.nextLine();
            }
        }
        return val;
    }

    // 연료 계산, 즉 총 비용 계산 도움 메소드
    public static int totalLitter(int car, int oil,boolean onOFF){
        // 매개 변수는 car = 차 종류, oil = 총거리/연비 = 총 주행에 필요한 기름, onOFF = 부가 기능
        // car 의 값 1:스포츠 카, 2:승용차, 3:버스
        // 스포츠 카 : 30리터 , 승용차 : 45리터, 버스 : 100리터 / 130리터
        // oilCnt 는 각 주유 횟수
        // rstOil 은 최종 주유한 리터 수
        // 총 주행에 필요한 기름이 아닌 총 주유한 리터 수에 따라 비용이 결정됨.
        int oilCnt;
        int rstOil = 0;
        switch (car){
            case 1:
                if(oil%30==0) oilCnt = oil/30;
                else oilCnt = oil/30 + 1;
                rstOil = oilCnt*30;
                break;
            case 2:
                if(oil%45==0) oilCnt = oil/45;
                else oilCnt = oil/45 + 1;
                rstOil = oilCnt*45;
                break;
            case 3: // 부가 기능이 켜진 버스에 대한 값 연산
                if(onOFF){
                    if(oil%130==0) oilCnt = oil/130;
                    else oilCnt = oil/130 + 1;
                    rstOil = oilCnt * 130;
                }else{
                    if(oil%100==0) oilCnt = oil/100;
                    else oilCnt = oil/100 + 1;
                    rstOil = oilCnt * 100;
                }
                break;
        }
        return rstOil;
    }

}
