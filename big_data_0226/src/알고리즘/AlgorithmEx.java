package 알고리즘;

public class AlgorithmEx {
    public static void main(String[] args) {
        System.out.println(euclidean(30,18));

    }

    //재귀 함수
    //조건이 달성할 때 까지 자신(함수)를 다시 호출 하는 Algorithm.
    //등차 수열 : f(n) = f(n-1) + a
    //등비 수열 : f(n) = f(n-1) * a
    //factorial : f(n) = f(n-1)*n  >> n보다 작거나 같은 모든 양의 정수의 곱.
    //fibonacci : f(n) = f(n-1)+f(n-2) >> 0항을 0, 1항을 1로 두고, 둘째 번 항부터 그 뒤의 모든 항이 바로 앞 두 항의 덧셈.

    public static int factorial(int n){
        if(n == 1){
            return 1;
        }
        else{
            return factorial(n-1)*n;
        }
    }

    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
        // ex fibonacci(5)
        // fibonacci(5) = fibonacci(4)+fibonacci(3) = 3 + 2 = 5
        // fibonacci(4) = fibonacci(3)+fibonacci(2) = 2 + 1 = 3
        // fibonacci(3) = fibonacci(2)+fibonacci(1) = 1 + 1 = 2
        // fibonacci(2) = fibonacci(1)+fibonacci(0) = 1 + 0 = 1
        // fibonacci(1) = 1
        // fibonacci(0) = 0
    }



    //Euclidean algorithm (유클리드 호제법) : 2개의 자연 수의 최대 공약 수를 구하는 algorithm
    public static int euclidean(int x, int y){
        if(y==0){
            return x;
        }
        else{
            return euclidean(y,x%y);
        }
    }
}
