package 버블정렬;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = {9,4,5,2,8,7,6,3,1,10};
        int temp = 0;
        for(int i =0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                if(arr[i]>arr[j]) { // 부호만 바꾸면 제일 큰숫자부터 고정이기때문에 내림차순.
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }// index 0부터 하나씩 비교해서 작은걸 맨앞으로보내 최솟값을 앞에서부터 만들어내는 형식.
        for(int e : arr) System.out.print(e+" ");
    }
}
