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
        HouseDog d2 = new HouseDog();
        // ((HouseDog)d1).sleep(); 이건 사용하지 못한다.

        // 객체 타입을 확인 할 때에는 instanceof
        // 자식->부모 타입을 만족하지만 부모 -> 자식 타입을 만족하지 못함.
        // 즉 타입은 부모가 가진건 자식이 모두 가졌지만 자식이 가진건 부모가 없을 수 있기에
        // 부모가 자식 타입인지 확인할 때에는 False 가 나오는 것.
        System.out.println(d1 instanceof Dog);       // 부모 객체 -> 부모 타입 (T)
        System.out.println(d1 instanceof HouseDog);  // 부모 객체 -> 자식 타입 (F)
        System.out.println(d2 instanceof Dog);       // 자식 객체 -> 부모 타입 (T)
        System.out.println(d2 instanceof HouseDog);  // 자식 객체 -> 자식 타입 (T)

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