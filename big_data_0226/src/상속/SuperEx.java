package 상속;

public class SuperEx {
    Child child = new Child("asd");
    // 부모 클래스를 생성하지 않았는데 어떻게 상속받아 자식 객체를 만들었는가?
    // 즉, 부모 클래스가 생성돼야 상속받아 자식을 만들 수 있는것이다.
    // => default 생성자는 생략이 가능 = 부모 클래스는 기본 생성자 즉 따로 만들지 않았을 때
    // 생성자를 생략할 수 있기 때문에 super()가 자식클래스의 생성자 안에서 생략이 되는것이다.
    // 즉 원래는 Child(String name){} 에 super()가 생략돼있는것
    // 아래 2 부모자식 상속관계를 보면,
    // 부모에 생성자를 만들어뒀을 때 반드시 super 로 부모를 먼저 만들게 돼 있다.
    // 즉! default = 생략 가능해서 안보이는 것 뿐
    // 부모를 먼저 만들고 자식을 만드는것은 같은 원리이다.
    // 상속받는 입장에서 먼저 상속받아야 할 클래스를 먼저 생성하고 하는것이다~

}

class Parent {
    String name;

}

class Child extends Parent{
    Child(String name){
        this.name = name;
    }
}

class Parent2{
    String name;
    Parent2(String name){
        this.name = name;
    }
}

class Child2 extends Parent2{
    Child2(String name){
        super(name);
    }

}