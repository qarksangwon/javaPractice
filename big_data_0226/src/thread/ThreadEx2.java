package thread;
// Thread 를 안전하게 종료하는 방법 (stop 플래그, interrupt())

public class ThreadEx2 {
    public static void main(String[] args) throws  InterruptedException {
        RunThread th = new RunThread();
        th.start();
        Thread.sleep(500);
        th.setStop(true);

        InterruptThread ith = new InterruptThread();
        ith.start();
        Thread.sleep(1000);
        // interrupt() 를 사용할 때에는 sleep 상태여야 한다.
        ith.interrupt();
    }

}

//stop 플래그를 이용하는 방법
class RunThread extends Thread{
    private boolean stop;
    
    public void setStop(boolean stop){
        this.stop = stop;
    }
    
    @Override
    public void run() {
        while(!stop){
            System.out.println("Thread 실행 중");
        }
        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }
}

//interrupt() 를 사용하는 방법
class InterruptThread extends Thread{
    @Override
    public void run(){
        try{
            while(true) {
                System.out.println("Thread 실행 중!");
                Thread.sleep(1);
            }
        }catch (InterruptedException e){
            System.out.println("어어 안된다");
        }
        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }
}