package 싱글톤;
// 생성자를 private 접근제한자로 외부에서 객체를 생성하지 못하게 만듬
// 내부에서 딱한번, 메모리에 올리기 위해 private static final 을 통해
// 객체를 한번 만들어서 static 영역에 올려둠. (변경 불가, 접근 불가)
// 외부에서 singleton 을 보려면 singleton 을 반환하는
// getSingleton() 을 통해 readonly 식으로 만듬.
// 즉 어디서 불러도 같은 값을 불러오게 만든다.

public class Singleton {
    String name;
    int id;
    private static final Singleton singleton = new Singleton();
    private  Singleton(){
        name = "test";
        id = 100;
    }
    static Singleton getSingleton(){
        return singleton;
    }
}
