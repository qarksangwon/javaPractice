package 프로텍트테스트2;

import 프로텍트테스트.Protect1;

//프로텍트는 직접 상속받은 클래스 내에서는 사용이 가능하다.(패키지가 달라도)
// 하지만 상속받은 클래스를 다른 클래스에서 인스턴스로 만들어 사용은 불가하다

public class Protect2 extends Protect1 {
    public static void main(String[] args) {
        Protect2 pc = new Protect2();
        System.out.println(pc.val);
        Protect3 pc2 = new Protect3();
        // System.out.println(pc2.val); 즉 이렇게 상속받은 클래스 객체를 만들어서 접근은 X
        pc2.message(); //하지만 내장함수를 사용하면 이것도 가능
    }
}

class Protect3 extends Protect1{
    void message(){
        System.out.println(this.val);
    }
}

