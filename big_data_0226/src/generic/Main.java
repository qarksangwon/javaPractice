package generic;

import 회원정보.Member;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Person<String> p1 = new Person<>("문자열!");
//        Person<Integer> p2 = new Person<>(50);


        // 받을 수 있는 타입을 Material 로 받아서
        // Material 과 이를 상속받는 클래스만 선언
        // 또한 받고자 하는 객체를 받을 수 있음
        // 왜냐, 제네릭의 타입을 Material 로 받았기 때문에.
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(new Powder());
        Powder powder = powderPrinter.getMaterial();
        System.out.println(powderPrinter);
        powder.doPrinting();

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        plasticPrinter.setMaterial(new Plastic());

    }
}

class Person <T> {
    public T info;
    Person(T info){
        this.info = info;
    }
}

abstract class Material {
    public abstract void doPrinting();
}

class GenericPrinter<T extends Material> {
    private T material; // T 자료형으로 선언한 변수

    public void setMaterial(T material) {
        this.material = material;
    }
    public T getMaterial() {
        return material;
    }
    @Override
    public String toString() {
        return material.toString();
    }
    public void printing() {
        material.doPrinting();
    }

}
class Powder extends Material {
    public void doPrinting(){
        System.out.println("Powder 재료로 출력합니다.");
    }
    @Override
    public String toString(){
        return "재료는 Powder 입니다.";
    }
}

class Plastic extends  Material{
    public void doPrinting(){
        System.out.println("Plastic 재료로 출력합니다.");
    }
    @Override
    public String toString(){
        return "재료는 Plastic 입니다.";
    }
}

