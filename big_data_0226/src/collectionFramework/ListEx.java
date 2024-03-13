package collectionFramework;

import java.util.*;

public class ListEx {
    public static void main(String[] args) {
        // List 컬렉션 클래스의 종류
        // ArrayList, LinkedList, Vector, Stack
        // 이는 모두 List interface 를 상속받음.
        // 특징
        // 배열과 유사, 데이터 크기 동적으로 변화
        // 요소의 저장 순서 유지, 중복 저장 허용, 여러 메소드 허용


        // ArrayList
        ArrayList<String> pitches = new ArrayList<>();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        pitches.add(1,"111"); // index 1에 넣으니 원래 1에 있던거부터 밀림
        System.out.println(pitches);
        System.out.println(pitches.get(1)); // index 개념
        System.out.println(pitches.size());
        System.out.println(pitches.contains("142"));
        System.out.println(pitches.remove("129")); // 삭제되면 true
        System.out.println(pitches.remove(0)); // 해당 index 삭제 후 삭제 항목 출력
        System.out.println();

        String[] data = {"138", "129", "142"};
        // Arrays = 배열 관련 클래스
        // Arrays.asList() = 배열을 리스트로 변경
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(data));
        System.out.println(arrayList);
        String result = String.join(",", arrayList);
        System.out.println(result); //join 은 구분 문자 넣으면 각 사이에 넣어서 구별해줌
        String result2 = String.join("-",arrayList);
        System.out.println(result2);
        System.out.println();

        ArrayList<String> arrayList1 = new ArrayList<>(Arrays.asList("138", "129", "142"));
        // Comparator 의 compare() 메서드를 오버라이딩 해서 정렬 방법 만들기 가능.
        arrayList1.sort(Comparator.naturalOrder());  // 오름차순으로 정렬
        System.out.println(arrayList1);
        arrayList1.sort(Comparator.reverseOrder()); // 내림차순
        System.out.println(arrayList1);
        System.out.println();


        // ArrayList 의 값을 객체로 받기
        ArrayList<MenuInfo> menuList = new ArrayList<>();
        menuList.add(new MenuInfo("Americano", 2000, true));
        menuList.add(new MenuInfo("Latte", 4000, true));
        menuList.add(new MenuInfo("Espresso", 2500, true));

        for(MenuInfo i : menuList) System.out.println(i.getJsonFormat());
        System.out.println();


        // Vector 는 ArrayList 와 동일한 내부구조지만
        // 동기화된 메소드로 구성돼 있기 때문에 멀티 쓰레드에서 안전하다.
        List<MenuInfo> vector = new Vector<>();
        vector.add(new MenuInfo("Americano", 2000, true));
        vector.add(new MenuInfo("Latte", 4000, true));
        vector.add(new MenuInfo("Espresso", 2500, true));
        for(MenuInfo m : vector) System.out.println(m.getJsonFormat());
    }
}

class MenuInfo{
    String name = "";
    int price;
    String category = "";
    String desc = "";
    boolean isTax;

    public MenuInfo(String name, int price, boolean isTax) {
        this.name = name;
        this.price = price;
        this.isTax = isTax;
    }
    public String getJsonFormat(){
        return "{"+"\"name\":"+name+","+"\"price\":"+price+","+"\"isTax\":"+isTax+"}";
    }
}
