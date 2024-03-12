package Arrays;
// java.util , java.lang 엔 많은 유틸리티 클래스가 다수 있음
// 그 중 하나가 java.util.Arrays

import java.util.Arrays;
import java.util.Collections;

public class SortEx {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 7, 8, 9, 2, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr,5));
        // 여기까진 기본타입으로 되는데 Collections.~ 즉 컬렉션 프레임워크 사용하려면
        // Integer 로 써야함.
        Integer[] arr1 = {5, 3, 4, 7, 8, 9, 2, 1};
        Arrays.sort(arr1, Collections.reverseOrder());
        for(int e : arr1) System.out.print(e+ " ");
        // sort() 해주지 않고 binarySearch() 메소드는 사용하면 값이 제대로 나오지 않는다
        // 해당 메소드는 특정 객체의 위치를 이진 검색 알고리즘을 사용해 찾는 것
        // 근데 정렬 돼 있지 않다면 제대로 값을 찾지 못하는것.
        // 이진 검색은 전체 공간에서 절반을 계속 잘라서 해당 값보다 큰가 적은가로
        // 왼쪽에 다시 검색을 할 시 오른쪽에서 다시 검색을 해 값을 찾는 방식인데,
        // 값이 정렬 돼 있지 않는다면 이진 검색으로는 찾을 수 없는것.
        // 즉 그냥 모든 수를 하나하나 확인(검색) 해야 위치를 알 수 있기 때문.


    }
}
