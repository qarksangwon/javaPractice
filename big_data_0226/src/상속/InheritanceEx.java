package 상속;

public class InheritanceEx {
    public static void main(String[] args) {
        Dog hd = new HouseDog();
        hd.setName("poppy");
        hd.sleep();  // HouseDog 의 sleep() 사용됨
                    //하지만 hd.sleep(4) 는 바로 호출하지 못함
        ((HouseDog)hd).sleep(4); // 이런식으로는 사용 가능.
        //하지만 애초에 new 생성자로 인스턴스를 부모로만들 시
        Dog d1 = new Dog();
        // ((HouseDog)d1).sleep(); 이건 사용하지 못한다.

    }
}

class Animal{
    String name;
    void setName(String name){
        this.name = name;
    }
}

class Dog extends Animal{
    void sleep() {
        System.out.println(this.name + " zzz");
    }
}

class HouseDog extends Dog{
    @Override // 어노테이션 사용 이유 = 관계에 대한 문법적 확인
    void sleep(){
        System.out.println(this.name + " zzz in house");
    }
    void sleep(int hour){
        System.out.println(this.name + " zzz in house for "+ hour + " hours");
    }
}