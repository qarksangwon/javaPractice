package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        // Map < key 타입, value 타입 > map = new HashMap<key 타입, value 타입>();
        // 파이썬의 딕셔너리와 비슷 , 순서 보장하지 않음
        // hash table 은 hash map 과 동일한 구조지만
        // 동일화된 메소드로 구현돼 멀티 스레드 환경에서 안전하다.
        //put(key, value) 지정된 키와 값으로 맵에 항목을 추가
        //get(key) 지정된 키에 해당하는 값을 반환합니다. 없으면 null 반환
        //remove(key) 지정된 키에 해당하는 항목을 제거
        //containsKey(key) 특정 키가 맵에 포함되어 있는지 여부를 확인
        //containsValue(value) 특정 값이 맵에 포함되어 있는지 여부를 확인
        //isEmpty() 맵이 비어 있는지 여부를 확인
        //size() 맵에 저장된 키-쌍의 개수를 반환
        //clear() 맵에 모든 항목을 제거하여 비움
        // keySet() 맵의 모든 키를 포함하는 Set 컬렉션 반환
        // values() 맵의 모든 값을 포함하는 컬렉션 반환
        // entrySet() 맵의 모든 키+값 쌍을 포함하는 Set 컬렉션 반환

        Map<String,Integer> map = new HashMap<>();
        map.put("우영우", 99);
        map.put("동그라미", 55);
        map.put("최수연", 95);
        map.put("이준호", 80);
        map.put("동그라미", 96); // 키가 같아서 value 만 변경되어 저장됨
        System.out.println("같은 키 추가했는데도 총 개수 : "+ map.size());
        System.out.println("같은 키 추가했는데도 나오는 값 : " + map.get("동그라미"));

        // 반복자 - Iterator 사용 방법
        // 방식은 for( : ) 문과 비슷하지만
        // 자바 버전에 따라 포문을 사용하지 못하므로 해당 방식을 사용하는것.
        // 구조는 Set<> 을 사용해 keySet() , 즉 모든 키를 Set 객체에 담고
        // 모든 키가 담겨있는 set 객체를 iterator 객체로 만들어줌.
        // 키 값을 모두 가져올 때 까지 hasNext() 를 통해 계속 가져오고
        // 그에 맞는 key 값을 .next()로 하나씩 가져와 map.get()을 통해 value 가져옴
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            Integer value = map.get(key);
            System.out.println(key + " : " + value);
        }
        System.out.println();

        // 이를 반복문으로 하게되면 (for)
        for(String key : map.keySet()){
            System.out.println(key + " - " + map.get(key));
        }
        System.out.println();


        // 객체 삭제
        map.remove("최수연");
        System.out.println("남은 데이터 수 : " + map.size());
        System.out.println();

        // replace 로 값 수정, 두가지 방법이 있다.
        // 만약에 매개변수를 3개 키, old val, new val 로 실행하는 메소드 실행 시
        // old val 이 현재 값과 같지 않다면 실행되지 않는다.
        map.replace("이준호",80,90);
        System.out.println(map.get("이준호"));
        map.replace("이준호",100);
        System.out.println(map.get("이준호"));
        System.out.println();
    }
}
