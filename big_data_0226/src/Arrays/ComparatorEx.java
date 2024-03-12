package Arrays;
// 과일 길이순으로 정렬 이후 길이 같다면 사전 순으로 정렬
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEx {
    public static void main(String[] args) {
        String[] fruits = {"Kiwi", "Orange", "Apple", "Banana", "Melon",
                "Mango", "Watermelon", "Cherry", "Plum", "Peach"};
        Comparator<String> comp = new Comparator<String>() {
            // compare(param1, param2) 는 두 매개 변수를 받아 비교하는것
            // return 0 = 같음, 양수 = 첫 번째 더 큼, 음수 = 두 번째 더 큼
            // 정수는 크기를 비교하고 문자열은 사전적 순서를 비교한다.
            // 즉 뭐가 더 큰지 return, 반환값으로 알려 주면 정렬이 된다.
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()) return 1; // 정렬 조건
                else{
                    if(o1.length() == o2.length()){
                        return o1.compareTo(o2);
                        // o1이 사전적으로 앞설 때 음수 반환 = 오름차순 시 변경 필요 x
                        // o2이 사전적으로 앞설 때 양수 = 오름차순 시 변경 필요 o
                        // 사전적으로 동일 시 0 반환.
                    }
                    return -1;
                }
            }
        };
        Arrays.sort(fruits, comp);
        System.out.println(Arrays.toString(fruits));
    }
}
