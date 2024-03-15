package thread;
// Thread 란, 작업, 흐름의 단위, 즉 하나의 작업의 최소 단위라 생각한다.
// 즉, Multi Thread 는 동시에 여러 작업을 병렬적 수행하는 것.
// 사용 방법
// 1. Thread Class 를 상속받아 사용
// 2. Runnable Interface 를 상속받아 사용

public class ThreadEx1 {
    public static void main(String[] args) {
        Thread subThread1 = new CustomThread();
        subThread1.start();
        Thread subThread2 = new CustomThread();
        subThread2.start();
        System.out.println("MainThread-----");

        Runnable task = new Sample();
        Thread subThread3 = new Thread(task);
        subThread3.start(); // 인터페이스 상속은 이렇게 매개변수로 넘겨서 Thread 객체 생성해야함

//        Runnable task2 = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("익명 객체로 클래스 없이 바로 만듬!");
//            }
//        };
//         람다식은 이렇게        
        Runnable task2 = () -> System.out.println("익명 객체로 클래스 없이 바로 만듬!");

        Thread subThread4 = new Thread(task2);
        subThread4.start();
    }
}


// Thread Class 를 상속받아 사용하는 방법이다.
// 이는 실제 Thread 객체로 사용할 수 있는것.
class CustomThread extends Thread{
    @Override
    public void run(){
        int sum = 0;
        for(int i = 0; i <= 10; i ++){
            sum += i;
            System.out.println(sum);
        }
    }
}

// 이는 Thread 의 run 을 사용하기위해 interface 상속을 받은거라
// 실제 Thread 객체로 바로 사용할 수는 없다.
class Sample implements Runnable{

    @Override
    public void run() {
        System.out.println("Implements Runnable");
    }
}