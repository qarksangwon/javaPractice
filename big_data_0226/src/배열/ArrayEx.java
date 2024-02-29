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


        int[][] arr2 = {{1,2,3},{4,5,6}};
        int[][] arr3 = new int[2][3]; //2차원에선 arr[0]도 주소값.
        for(int z =0; z<arr2.length; z++){ // 행에 관한 for
            for(int j=0; j<arr2[i].length; j++){ //열에 관한 for
                System.out.print(arr2[z][j]);
            }
            System.out.println();
        }

    }
}
