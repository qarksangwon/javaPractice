package 생성자;

public class TvEx {
    public static void main(String[] args) {
        Tv tv1 = new Tv();
        Tv tv2 = new Tv(true, 20, 50);
        tv1.tvInfo();
        tv2.tvInfo();

        tv1.setON(true);
        tv1.setChannel(202);
        tv1.setVolume(150);
        tv1.tvInfo();

        tv2.setChannel(1001);
        tv2.setVolume(60);
        tv2.tvInfo();
    }
}

