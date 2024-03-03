package 회원정보;
// 조건
// 1. 이름 (String)
// 2. 나이 (int, 정수로 입력, 1~199)
// 3. 성별 (char, 남자는 M, m 여자는 F, f)
// 4. 직업 (int, 정수, 1:학생, 2:회사원, 3:주부, 4:무직)
// 결과는 한번에 출력
public class Main {
    public static void main(String[] args) {
        Member mb1 = new Member();
        mb1.setInfo();
        mb1.getInfo();
    }
}
