import java.util.Scanner;

public class test {
    int speed;
    int fe;
    int fuelBox;
    int seat;
    String carName;
    boolean function = false;
}

class SportCar extends test{

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
            function = false;
            speed -= 50;

        }
    }

}
class Car extends test {
    public Car(String carname){
        this.speed = 250;
        this.fe = 8;
        this.fuelBox = 30;
        this.seat = 2;
        this.carName = carname;
    }
    public void onOff(boolean Carfunction){
        if(Carfunction){
            function = true;
            seat += 1;
        }else {
            function = false;
            seat -= 1;
        }
}
class Bus extends test {
    public Bus(String carname){
        this.speed = 250;
        this.fe = 8;
        this.fuelBox = 30;
        this.seat = 2;
        this.carName = carname;
    }
    public void onOff(boolean Carfunction){
        if(Carfunction){
            function = true;
            fuelBox+=30;
        }else{
            function = false;
            fuelBox-=30;
        }
      }
   }

 }

