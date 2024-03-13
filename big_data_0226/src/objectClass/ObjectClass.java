package objectClass;
// Object = java.lang 패키지 중 가장 많이 사용
// => 모든 자바 클래스의 조상 클래스

public class ObjectClass {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car();
        System.out.println(car.toString());
        System.out.println(car1.toString());
        System.out.println(car.equals(car1));
        car = car1;
        System.out.println(car.toString());
        System.out.println(car1.toString());
        System.out.println(car.equals(car1));
    }
}

class Student{
    int id;
    String name;
}

class Car{

}