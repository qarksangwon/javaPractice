package 프로텍트테스트;

public class Protect1 extends  Protect3 {
    public static void main(String[] args) {
        Protect1 pc1 = new Protect1();
        System.out.println(pc1.val);
    }
}

class Protect3 {
    protected int val = 10;
}