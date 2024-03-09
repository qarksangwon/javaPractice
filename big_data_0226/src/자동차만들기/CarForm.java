package 자동차만들기;

// 자동차 추상 클래스 작성
// 상속 받아 스포츠 카, 승용차, 버스에 대한 초기값 설정과
// 조건에 맞게 생성자 사용해 차 이름 생성
// 또한 각 부가 기능에 대해 처리할 메소드 구성

public abstract class CarForm {

    int speed;
    int fe;
    int fuelBox;
    int seat;
    String carName;
    boolean function = false;

    abstract void onOff(boolean carFunction);
}

class SportCar extends CarForm{

    public SportCar(String carname){
        this.speed = 250;
        this.fe = 8;
        this.fuelBox = 30;
        this.seat = 2;
        this.carName = carname;
    }
    public void onOff(boolean carFunction){
        if(carFunction){
            function = true;
            speed += 50;
        }else{
            if (function){
                function = false;
                speed -= 50;
            }

        }
    }

}
class Car extends CarForm {
    public Car(String carname) {
        this.speed = 200;
        this.fe = 12;
        this.fuelBox = 45;
        this.seat = 4;
        this.carName = carname;
    }

    public void onOff(boolean carFunction) {
        if (carFunction) {
            function = true;
            seat += 1;
        } else {
            if (function){
            function = false;
            seat -= 1;
            }
        }
    }
}
class Bus extends CarForm {
    public Bus(String carname){
        this.speed = 150;
        this.fe = 5;
        this.fuelBox = 100;
        this.seat = 20;
        this.carName = carname;
    }
    public void onOff(boolean carFunction){
        if(carFunction){
            function = true;
            fuelBox+=30;
        }else{
            if (function){
            function = false;
            fuelBox-=30;
            }
        }
      }
   }
