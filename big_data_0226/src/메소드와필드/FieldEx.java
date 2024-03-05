package 메소드와필드;
//필드 = 클래스 내부에 선언된 변수
// = 클래스로 생성된 각각의 객체마다 별도의 값을 저장함
// = 인스턴스 필드 = 객체가 생성될 때 마다 생성
// static 키워드로 변수 생성 시 객체 생성할 때 마다 생기는 것이 아닌
// 클래스 생성할 때 단 한번만 생성된다

public class FieldEx {
    public static void main(String[] args) {
        // 객체 생성하지 않아도 선언과 동시에 static 에 선언이 되는것.
        System.out.println(Field.ymd);

        Field f1 = new Field();
        Field f2 = new Field();
        // 이렇게 static 구역이 여러 인스턴스에서 공유하는것을 볼 수 있음.
        // 메모리 구조가 static | heap | stack 영역으로 나뉘어져
        // 선언될 때 어디에 어떻게 저장되느냐에 따라 나뉘는것 같음.
        // new 생성자를 통해 객체 생성 시 heap 구역에 할당된다는 것.
        f1.ymd = "2024:03:05_10:44";
        System.out.println(Field.ymd);

        int localVal;
//        System.out.println(localVal);  로컬 변수는 초기화되지 않지만
        System.out.println(f1.stdID); // 객체 안의 변수는 heap 구역에 할당 되므로 초기화 됨.

    }
}

class Field{
    int stdID;
    String stdName;
    int grade;
    static String ymd = "20240305";
}