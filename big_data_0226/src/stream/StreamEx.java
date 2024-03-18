package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamEx {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> sList = new ArrayList<>(Arrays.asList(arr));
        // 스트림은 생성 -> 중간 연산 -> 최종 연산 순으로 연산이 이루어진다.
        sList.stream().filter(s->s >=5).forEach(s -> System.out.print(s + " "));
        System.out.println();
        // 스트림은 한번 사용하면 소멸이니 다시 쓰고싶으면 다시 생성
        // 또한 원본 데이터를 변경하지 않는다.
        sList.stream().forEach(s -> System.out.print(s + " "));
        System.out.println();

        int sumVal = sList.stream().mapToInt(e -> e).sum();
//        int sumVal = sList.stream().reduce(0, (a, b) -> Integer.sum(a, b));
//        int sumVal = sList.stream().reduce(0, Integer::sum);
        int count = (int) sList.stream().filter(s->s>5).count();
        System.out.println("[합 : " + sumVal + "] [5보다 큰 숫자의 개수 : " + count+"]");
    }
}
