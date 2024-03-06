package 프로텍트테스트2;

import 프로텍트테스트.Protect1;

public class Protect2 {
    public static void main(String[] args) {
       Test test = new Test();
       //System.out.println(test.val); 불가능
        Protect1 test2 = new Protect1();
       // System.out.println(test2.val); 불가능
    }
}

class Test extends Protect1{

}
