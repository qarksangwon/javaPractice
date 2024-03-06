package 매개변수의다형성;

import 스위치문기본.SwitchEx1;

import java.awt.*;
import java.util.Scanner;

public class TypeCast2 {
    public static void main(String[] args) {
        Driver driver = new Driver("박상원");
        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        SportCar sportCar = new SportCar();
        Scanner sc = new Scanner(System.in);
        System.out.print("타고싶은 차 선택 : [1]버스 [2]택시 [3]스포츠카 : ");
        int selMenu = sc.nextInt();
        switch (selMenu){
            case 1: driver.drive(bus); break;
            case 2: driver.drive(taxi); break;
            case 3: driver.drive(sportCar); break;
            default: System.out.println("잘못 선택했어~");
        }
    }
}

class  Driver{
    String name;
    public Driver(String name){
        this.name = name;
    }
    public void drive(Vehicle vehicle){
        System.out.print(name + "씨가 타고있는 ");
        vehicle.run();
    }
}

class Vehicle{
    public void run(){
        System.out.println("차가 달린다~");
    }
}

class Bus extends Vehicle{
    @Override
    public void run(){
        System.out.println("버스가 달린다~");
    }
}

class Taxi extends Vehicle{
    @Override
    public void run(){
        System.out.println("택시가 달린다!");
    }
}

class SportCar extends Vehicle{
    @Override
    public void run(){
        System.out.println("스포츠카 슛~");
    }
}