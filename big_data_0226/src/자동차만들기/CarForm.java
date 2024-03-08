package 자동차만들기;

public abstract class CarForm {

    int speed;
    int fe;
    int fuelBox;
    int seat;
    String carName;
    boolean function = false;
}

class SportCar extends CarForm{

    public SportCar(String carname){
        this.speed = 250;
        this.fe = 8;
        this.fuelBox = 30;
        this.seat = 2;
        this.carName = carname;
    }
    public void onOff(boolean Carfunction){
        if(Carfunction){
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

    public void onOff(boolean Carfunction) {
        if (Carfunction) {
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
    public void onOff(boolean Carfunction){
        if(Carfunction){
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
class seatBox extends CarForm{

}