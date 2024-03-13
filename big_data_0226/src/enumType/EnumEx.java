package enumType;
// Enum = 열거 타입이란 한정된 값이 열거 상수 중에서
// 하나의 상수를 저장하는 타입
// 입력의 타입을 제한, 즉 입력 값을 열거 상수중에 하나를 정해 저장하면
// 그 외에 값은 못들어오는듯

//사용은 enum.value 식으로 사용하는듯함.

public class EnumEx {
    public static void main(String[] args) {
        Developer developer = new Developer("박상원", DevType.FRONTEND, Career.JUNIOR, Gender.MALE);
        developer.devInfo();
    }
}

// 타입제한 걸고 이는 index 값도 가진다.
enum Career{
    JUNIOR, SENIOR
}

enum DevType{
    MOBILE, FRONTEND, BACKEND, DBA
}

enum Gender{
    MALE, FEMALE
}
class Developer{
    private String name;
    private Career career;
    private DevType type;
    private Gender gender;
    public Developer(String name, DevType type, Career career, Gender gender) {
        this.name = name;
        this.type = type;
        this.career = career;
        this.gender = gender;
    }

    public void devInfo() {
        System.out.println("이름 : " + name);
        System.out.println("업무 : " + type);
        System.out.println("경력 : " + career);
        System.out.println("성별 : " + gender);
    }
}