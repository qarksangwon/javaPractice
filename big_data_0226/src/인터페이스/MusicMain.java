package 인터페이스;

public class MusicMain {
    public static void main(String[] args) {
        Playable[] play = {new Music(15,15), new Video(40,40)};
        for(Playable p : play) p.play();
    }
}

class Music implements Playable, Size {
    int width=0;
    int length=0;
    Music (int w, int l){
        resize(w,l);
    }
    @Override
    public void play(){
        System.out.println("음악 재생");
    }
    @Override
    public void resize(int width, int length){
        this.width=width;
        this.length=length;
        System.out.println("MP3의 크기는 가로:"+width+" 세로:"+length);
    }
}

class Video implements Playable, Size {
    int width;
    int length;
    public Video(int w, int l){
        resize(w,l);
    }
    @Override
    public void play(){
        System.out.println("비디오 재생");
    }
    @Override
    public void resize(int width, int length){
        this.width=width;
        this.length=length;
        System.out.println("비디오의 크기는 가로:"+width+" 세로:"+length);
    }
}
