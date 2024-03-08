package 인터페이스;

public class MusicMain {
    public static void main(String[] args) {
        Playable[] play = {new Music(15,15), new Video(40,40)};
        for(Playable p : play) {
            p.play();
            if(p instanceof Video){
                System.out.print("비디오 버튼 사이즈 : ");
                ((Video) p).buttonSize();
            }else{
                System.out.print("MP3 버튼 사이즈 : ");
                ((Music)p).buttonSize();
            }
        }
    }
}

class Music implements Playable, Size {
    int width=0;
    int length=0;
    Music (int w, int l){
        size(w,l);
    }
    @Override
    public void play(){
        System.out.println("음악 재생");
    }
    @Override
    public void size(int width, int length){
        this.width=width;
        this.length=length;
        System.out.println("MP3의 크기는 가로:"+width+" 세로:"+length);
    }
    @Override
    public void buttonSize(){
        System.out.println("가로:300 세로:150");
    }
}

class Video implements Playable, Size {
    int width;
    int length;
    public Video(int w, int l){
        size(w,l);
    }
    @Override
    public void play(){
        System.out.println("비디오 재생");
    }
    @Override
    public void size(int width, int length){
        this.width=width;
        this.length=length;
        System.out.println("비디오의 크기는 가로:"+width+" 세로:"+length);
    }
    @Override
    public void buttonSize(){
        System.out.println("가로:50 세로:25");
    }
}
