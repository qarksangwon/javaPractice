package 생성자;

public class ConstructEx {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("KIA","EV6","Black",260,585);
        Car car3 = new Car("HYUNDAI","Grandeur");
        car1.carInfo();
        car2.carInfo();
        car3.carInfo();
        car2.color = "White";
        System.out.println(car2.color);

    }
}

class Car{
    String company;
    String model;
    String color;
    int speed;
    int horsePower;

    // 기본 생성자는 생성자를 아무것도 선언하지 않았을 때 자동으로 있는처리지만
    // 생성자를 만들고 기본 생성자를 사용하고싶으면 또 선언해주어야 한다.
    // => (생성자) 오버로딩, 오버로딩은 매개변수를 다른 타입을 받는 같은 함수를 뜻한다.
    Car(){

    }
    Car(String company, String model){
        this.company = company;
        this.model = model;
    }
    Car(String company, String model, String color, int speed, int horsePower){
        this.company = company;
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.horsePower = horsePower;
    }

    void carInfo(){
        System.out.println("제조사 : " + company);
        System.out.println("모델명 : " + model);
        System.out.println("색상 : " + color);
        System.out.println("속도 : " + speed);
        System.out.println("마력 : " + horsePower);
        System.out.println();
    }
}
