package thread;
// 동기화(Synchronized) : 여러 개의 스레드가 동작하는 경우
// 동시에 같은 자원을 접근하지 못하게 락(Lock) 을 걸어
// 다른 스레드의 접근을 막는것

public class SyncThreadEx {
    public static void main(String[] args) {
        ShareThread sh = new ShareThread();
        Thread thread1 = new Thread(()->{
            sh.setValue(100);
        });
        Thread thread2 = new Thread(()->{
            sh.setValue(10);
        });
        thread1.setName("쓰레드 1");
        thread2.setName("쓰레드 2");
        thread1.start();
        thread2.start();
    }
}

class ShareThread{
    private int value = 0;
    public int getValue(){return value;}
    public synchronized void setValue(int value){
        this.value=value;
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()
                + "의 value 값은 " + this.value);
    }
}