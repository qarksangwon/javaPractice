package thread;
// DaemonThread 는 다른 Thread 의 작업을 돕는 보조 Thread
// DaemonThread 이외 Thread 의 작업이 모두 종료되면
// DaemonThread 도 강제 종료된다.
// start() 호출 전에 setDaemon(true) 를 호출해서
// DaemonThread 를 정하는 식 인듯 함.
public class DaemonThreadEx  {
    public static void main(String[] args) throws InterruptedException {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();
        Thread.sleep(3000);
        // Thread.sleep 으로 main Thread 를 3초 늦춰서
        // DaemonThread 가 실행되게 하고
        // mainThread  가 종료되면 알아서 종료되기 때문에
        // 따로 Thread 를 종료시켜주는 작업 필요 없음
    }
}

class AutoSaveThread extends Thread{
    public void save(){
        System.out.println("내용 저장");
    }

    @Override
    public void run(){
        while(true){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
            }
            save();
        }
    }
}