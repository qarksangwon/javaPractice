package 메모리구조;

public class MemoryMap {
    public static void main(String[] args) {
        //기본
        int age = 25;
        Integer age2 = 25;

        //참조
        String name = "테스트";
        String name2 = "테스트";
        String name3 = new String("테스트");

        //참조변수 비교
        if(name==name2) System.out.println("주소 같음");
        if(name==name3) System.out.println("주소 같은거 맞아?"); // 구역이 다름
        if(name.equals(name3)) System.out.println("내용은 같음");

        //null, NullPointerException
        // 참조타입 변수가 가리키는 위치의 객체가 없을 때.
        int[] intArray = null;
        try {
            int intVal = intArray[0];
            System.out.println(intVal);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
