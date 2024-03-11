package 인터페이스;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Animal[] animals = {new Dog("말티즈"),new Dog("푸들")
//                ,new Cat("고영희"),new Dog("말티푸")
//                , new Cat("김영희"),new Cow("워낭소리"), new Cow("황소")};
//        for(Animal ani : animals){
//            if(ani instanceof Dog){
//                ani.sound();
//                ((Dog)ani).yum();
//                Dog dog = (Dog)ani;
//                dog.yum();
//                System.out.println(dog.name + dog.type);
//            }
//        }
        DownCastingEx downcasting = new DownCastingEx();
        downcasting.addAnimal();
        for(int i=0; i < downcasting.aniList.size(); i++){
            Animal getAni = downcasting.aniList.get(i);
            if(getAni instanceof Dog) {
                Dog dog1 = (Dog)getAni;
                dog1.yum();
            } else if(getAni instanceof Cat){
                Cat cat1 = (Cat)getAni;
                cat1.sound();
            } else if(getAni instanceof Cow){
                Cow cow1 = (Cow)getAni;
                cow1.sound();
            }
        }

//        Animal ani;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("키우고 싶은 동물: [1]강아지 [2]고양이 [3]소");
//        int num = sc.nextInt();
//        switch (num){
//            case 1 : ani = new Dog("뽀삐"); break;
//            case 2 : ani = new Cat("고영희"); break;
//            case 3 : ani = new Cow("워낭소리"); break;
//            default: System.out.println("그런 동물은 없어~"); return;
//        }
//        ani.sound();
    }
}
class DownCastingEx {
    ArrayList<Animal> aniList = new ArrayList<>();
    public void addAnimal(){
        aniList.add(new Dog("멍멍이"));
        aniList.add(new Cat("야옹희"));
        aniList.add(new Cow("워낭소리"));
        for(Animal e : aniList) e.sound();
    }
}

class Dog implements Animal{
    String name;
    Dog(String name){
        this.name = name;
    }

    @Override
    public void sound(){
        System.out.println(name + " 멍멍");
    }

    public void yum(){
        System.out.println(name + "(이)가 밥먹고 기분이 좋아보인다!");
    }
}

class Cat implements Animal{
    String name;
    Cat(String name){
        this.name = name;
    }
    @Override
    public void sound(){
        System.out.println(name + " 야옹");
    }
}

class Cow implements  Animal{
    String name;
    Cow(String name){
        this.name = name;
    }
    @Override
    public void sound() {
        System.out.println(name + " 음메");
    }
}