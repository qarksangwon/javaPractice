package Arrays;
// 일반 배열을 ArrayList로 반환

import java.util.Arrays;
import java.util.List;

public class AsListEx {
    public static void main(String[] args) {
        String[] fruits = {"Kiwi", "Orange", "Apple", "Banana", "Melon",
                "Mango", "Watermelon", "Cherry", "Plum", "Peach"};
        List<String> list = Arrays.asList(fruits);
        System.out.println(list);
    }
}
