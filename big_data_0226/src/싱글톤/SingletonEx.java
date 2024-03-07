package 싱글톤;
// 싱글톤 = 단 하나의 객체만 생성되게 하는 패턴
// 사용 이유는 메모리 절약(스프링부트_Bean)과 데이터 공유에 목적이 있다.


public class SingletonEx {
    public static void main(String[] args) {
        SingletonTest st = new SingletonTest();
        st.view();
        st.setInfo("동그라미",2);
        st.view();

        Singleton st2 = Singleton.getSingleton();
        System.out.println(st2.name);
        System.out.println(st2.id);
    }
}

