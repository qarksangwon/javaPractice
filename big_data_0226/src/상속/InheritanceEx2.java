package 상속;
//final 클래스와 final 필드와 final 메소드는 최종 상태이다
// 수정 불가 상태 = 더이상 변경이 불가능하다.

public class InheritanceEx2 {
    public static void main(String[] args) {
        ElectricCar ec = new ElectricCar("Tesla");
        ec.infoCar();
        ec.accelerator();
        ec.accelerator();
        ec.infoCar();
    }
}

class Car {
    int speed;
    String color;
    String name;
    final void accelerator(){
        System.out.println("속도 증가");
        speed += 10;
    }
    final void breakPanel(){
        System.out.println("속도 감소");
        speed -= 10;
    }
}

class SportCar extends Car{
    boolean isTurbo;
    SportCar(String name) {
        isTurbo = false;
        speed = 280;
        this.name = name;
        this.color = "Red";
    }

    int getSpeed(){
        if (isTurbo) return speed *= 1.2;
        else return speed;
    }
    boolean isTurbo() {
        return isTurbo;
    }

    void setTurbo(boolean turbo){
        this.isTurbo = turbo;
    }

    void infoCar(){
        System.out.println("이름 : " + name);
        System.out.println("속도 : " + getSpeed());
        System.out.println("색상 : " + color);
        System.out.println("터보모드 : " + isTurbo);
    }
}

class ElectricCar extends Car{
    boolean isAutoDrv;
    ElectricCar(String name){
        isAutoDrv = false;
        speed = 200;
        this.name = name;
        color = "White";
    }

    boolean isAutoDrv(){
        return isAutoDrv;
    }
    void setAutoDrv(boolean autoDrv){
        isAutoDrv = autoDrv;
    }

    void infoCar(){
        System.out.println("이름 : " + name);
        System.out.println("속도 : " + speed);
        System.out.println("색상 : " + color);
        System.out.println("자율 주행 : "+ isAutoDrv);
    }
}

