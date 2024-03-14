package set;
// Set 의 교집합 합집합 차집합

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetEx2 {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));

        // 교집합 - retainAll
        s1.retainAll(s2);
        System.out.println(s1);
        System.out.println();

        s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));

        // 합집합 - addAll
        s1.addAll(s2);
        System.out.println(s1);
        System.out.println();

        s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));

        //차집합
        s1.removeAll(s2);
        System.out.println(s1);

    }
}
