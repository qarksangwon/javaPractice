package 배열;

public class ArrayEx {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 85;
        arr[1] = 100;
        arr[2] = 101;

//        for(int i=0; i<arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        } 배열은 for each 사용
//        System.out.println();
        int i =0;
        for(int e : arr){
            e += 5;
            System.out.print(e+" ");
        }
        System.out.println();


        String[] weeks = {"월","화","수","목","금","토","일"};
        for (String e : weeks){
            System.out.print(e+ " ");
        }

    }
}
