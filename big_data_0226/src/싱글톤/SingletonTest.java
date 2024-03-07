package 싱글톤;

public class SingletonTest {

    // 객체 생성하지 않고 이미 있는 singleton 객체에 접근.
    Singleton singleton = Singleton.getSingleton();

    void setInfo(String name, int id){
        singleton.name = name;
        singleton.id = id;
    }

    void view(){
        System.out.println("싱글톤 이름 : " + singleton.name);
        System.out.println("싱글톤 ID : " + singleton.id);
    }


}
