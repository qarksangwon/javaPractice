package 인터페이스;

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
//                System.out.println("강아지는 너무 " + ani.type);
//            }
//            else if(ani instanceof  Cat) System.out.println("고양이도 " + ani.type);
//        }
        Animal ani;
        Scanner sc = new Scanner(System.in);
        System.out.print("키우고 싶은 동물: [1]강아지 [2]고양이 [3]소");
        int num = sc.nextInt();
        switch (num){
            case 1 : ani = new Dog("뽀삐"); break;
            case 2 : ani = new Cat("고영희"); break;
            case 3 : ani = new Cow("워낭소리"); break;
            default: System.out.println("그런 동물은 없어~"); return;
        }
        ani.sound();
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
        System.out.println(" 음메");
    }
}