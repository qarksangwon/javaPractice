package 상속;
//final 클래스와 final 필드와 final 메소드는 최종 상태이다
// 수정 불가 상태 = 더이상 변경이 불가능하다.

public class InheritanceEx2 {
    public static void main(String[] args) {

    }
}

class Car {
    int speed;
    String color;
    String name;
    final void accelerator(){
        System.out.println("속도 증가");
    }
    final void breakPanel(){
        System.out.println("속도 감소");
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

}


