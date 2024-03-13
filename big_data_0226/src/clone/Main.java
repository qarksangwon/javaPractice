package clone;

public class Main {
    public static void main(String[] args) {
        Member m1 = new Member("id","name","password",25,true);
        Member m2 = m1;
        System.out.println(m1.equals(m2));
        Member m3 = m1.getMember();
        System.out.println(m3.equals(m1));

    }
}

class Member implements Cloneable{
    public String id;
    public String name;
    public String password;
    public int age;
    public boolean adult;

    public Member(String id, String name, String password, int age, boolean adult) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.adult = adult;
    }
    public Member getMember() {
        Member cloned = null;
        try {
            cloned = (Member) clone(); // 클론 메서드는 Object 타입이므로 Member 타입으로 변경
        } catch (CloneNotSupportedException e) { }
        return cloned;
    }
}
