package 문제풀이;
// 알파벳 소문자로 이루어진 N 개의 단어가 아래와 같은 조건으로 정렬하는 프로그램
// 1. 길이가 짧은 순으로
// 2. 길이가 같으면 사전 순으로
// 3. 단어의 개수는 1<=N<=20,000
//  둘째 줄 부터 N 개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어 한줄에 하나씩
// 문자열의 길이는 50을 넘지 않는다.
// 같은 단어가 여러번 입력 된 경우에는 한 번만 출력.

import java.util.*;

public class WordSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        Set<String> str = new HashSet<>();
        for (int i =0; i<count; i++){
            str.add(sc.nextLine());
        }
//        String[] sortArr = new String[str.size()];
//        int index = 0;
//        for(String sVal : str) sortArr[index++] =sVal ;
        // 최적화 -> toArray(new String[0]) 로 하게되면
        // set 의 요소를 저장하기에 크기를 모르거나 충분한 크기가 없다면
        // set 의 요소를 배열에 복사해 그 배열을 반환한다.
        // 즉 toArray() 는 set 의 내용의 크기가 배열과 같으면 배열로 반환하는데
        // 그렇지 않다면 new String[0] 을 하게되면 새 배열을 만들어 그 배열에
        // set 의 내용을 구현하고 이를 반환하는 뜻
        String[] sortArr = str.toArray(new String[0]);

        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()>o2.length()) return 1;
                else if(o1.length()<o2.length()) return -1;
                else{
                    return o1.compareTo(o2);
                }
            }
        };

        Arrays.sort(sortArr,comp);
        for(String rst : sortArr) System.out.println(rst);
    }
}
