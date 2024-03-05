package 메소드와필드;

public class MethodEx {
    public static void main(String[] args) {
        say("안니옹~");
        int result = sum(1,2,3,4,5);
        System.out.println(result);
    }

    // static - 클래스 메소드 => 클래스명으로 호출, 객체로 생성되지 않는다.

    //매개변수 개수를 모를 때
    static int sum(int ... values){
        int sum = 0;
        for (int value : values){
            sum +=value;
        }
        return sum;
    }
    static void say(String str){
        System.out.println(str);
    }

}
