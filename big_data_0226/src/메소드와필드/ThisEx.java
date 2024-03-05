package 메소드와필드;

public class ThisEx {
    public static void main(String[] args) {
        Car car = new Car("santafe");
        car.info();
        Car car2 = new Car(70);
        car2.info();
    }
}
class Car {
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;
    private int currentSpeed;

    Car(String modelName, int modelYear, String color, int maxSpeed) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }

    //생성자의 this 를 통해 선언된 생성자를 이용해먹을 수 있다.
    // this 를 사용한 생성자에 또 this 로 접근 가능.
    Car(String modelName){
        this(modelName, 2020, "은색", 250);
    }

    Car(int currentSpeed){
        this("산타페");
        this.currentSpeed = currentSpeed;
    }

    public void info(){
        System.out.println("차종 : " + modelName);
        System.out.println("연식 : " + modelYear);
        System.out.println("색상 : " + color);
        System.out.println("최대속도 : " + maxSpeed);
        System.out.println("현재속도 : " + currentSpeed);
        System.out.println();
    }
}