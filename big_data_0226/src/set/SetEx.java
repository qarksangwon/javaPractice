package set;
// Set 특징
// 중복 허용하지 않음

// HashSet 특징
// 개념적 기능은 수학의 집합과 같은 기능을 한다.
// 구조는 HashCode() 의 리턴값이 같다 = 주소값이 같다 -> 안의 내용물과 같다 ->같은 객체다
// 구조 중 HashCode 혹은 안의 내용물(equals) 가 false 라면 다른 객체


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(Arrays.asList("H","e","l","l","o"));
        System.out.println(set);
        set.add("Java");
        set.add("C");
        set.add("C++");
        set.add("Python");
        System.out.println(set);

        Set<Member> hashSet = new HashSet<>();
        Member mem1 = new Member(1001,"박재훈");
        Member mem2 = new Member(1002,"장성엽");
        Member mem3 = new Member(1003,"김건우");
        hashSet.add(mem1);
        hashSet.add(mem2);
        hashSet.add(mem3);

        Member mem4 = new Member(1003,"김강민");
        // object 의 equals 를 override 하여
        // id 값으로 해당 값이 중복 값인지 아닌지 판별하게 함.
        // 또한 hashCode() 도 오버라이드 하여 값을 지정함.
        // 즉 object 의 hashCode 는 객체의 주소를 16진수 hash code 로
        // 반환하는 메소드인데
        // HashSet 의 특징을 살려 내가 규칙을 새로 만들고 싶기 때문에
        // hashCode 로 된 주소값이 같고 -> equals 를 통한 중복확인이 모두 이뤄 져야
        // 중복 저장이 되지 않기 때문에
        // HashCode 의 값을 중복하지 못하게 하려는 id 값으로 오버라이드 해주고
        // equals 또한 값을 중복하지 못하게 하려는 id 값으로 비교해 true false 를 반환하게 해주어
        // id 값으로 중복값을 Set 에 저장하지 못하게 하는 나만의 class 를 설정한것.
        // hashCode 로 같은 자료구조에 저장하더라도 그를 참조하는 주소가 직접
        // 바뀌는 건 아니라서 hashCode() 메소드와 equals() 메소드를 모두 오버라이딩 해줘야 하는것.
        // 객체의 equals 는 참조가(주소) 같아야 하기 때문.
        hashSet.add(mem4);
        for(Member e : hashSet) e.showMember();

    }
}

class Member{
    int id;
    String name;

    @Override
    public int hashCode() {
        return id;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member) {
            Member member = (Member) obj;
            if(this.id == member.id) return true;
            else return false;
        }
        return false;
    }

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void showMember() {
        System.out.println("아이디 : " + id);
        System.out.println("이름 : " + name);
    }
}
