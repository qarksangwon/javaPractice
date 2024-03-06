package 문제풀이;
// 1~45 6개의 수 랜덤함수, 중복값 no


public class Lotto {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        int count = 0;
        while(true){
            boolean isVal = false;
            int ranVal = (int)((Math.random()*45)+1);
            for (int j : lotto) {
                if (ranVal == j) isVal = true;
            }
            if(!isVal){
                for(int i=0; i<lotto.length; i++) {
                    if (lotto[i] == 0) {
                        lotto[i] = ranVal;
                        count++;
                        break;
                    }
                }
            }
            if(count == 6) break;
        }
        for(int lottoVal : lotto) System.out.print(lottoVal + " ");
    }
}
