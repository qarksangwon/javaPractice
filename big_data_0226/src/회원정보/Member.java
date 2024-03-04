package 회원정보;

import java.util.Scanner;

// 조건
// 1. 이름 (String)
// 2. 나이 (int, 정수로 입력, 1~199)
// 3. 성별 (char, 남자는 M, m 여자는 F, f)
// 4. 직업 (int, 정수, 1:학생, 2:회사원, 3:주부, 4:무직)
// 결과는 한번에 출력
//gender : 성 정체성 (F,M,G,R)
//sex : 생물학적 성 (F,M) 변수명 정할 때 팁!
public class Member {
    private String name;
    private int age;
    private String gender;
    private String job;
    Scanner sc = new Scanner(System.in);



    public void setInfo(){
        setName();
    }

    // this 는 이 객체의 변수를 지칭.
    // 그렇기 때문에 매개 변수로 받는 변수 명과 같아도 구별이 되는 것
    public void setName() {
        System.out.print("이름을 입력해 주세요 : ");
        this.name = sc.nextLine();
        setAge();
    }


    public void setAge() {
        int i = 0;
        while(true){
            try {
                System.out.print("나이를 입력해 주세요(정수만 입력 가능) : ");
                if(i == 1) sc.nextLine();
                this.age = sc.nextInt();
                if(age>199||age<1){
                    System.out.println("나이가 맞나요? 다시 입력해 주세요.");
                    if(i==0) i++;
                    continue;
                }
                break;
            }catch (Exception e){
                System.out.println("정수만 입력 가능 합니다.");
                if(i==0) i++;
            }
        }
        setGender();
    }


    public void setGender() {
        int i = 0;
        char gen;
        while(true){
            try {
                if(i==1) sc.nextLine();
                System.out.print("성별을 입력해 주세요(남자:M,m 여자:F,f 맨 앞 문자만 기록 됩니다.) : ");
                gen = sc.next().charAt(0);
                switch(gen){
                    case 'M':
                    case 'm':
                        this.gender = "남성";
                        break;
                    case 'F':
                    case 'f':
                        this.gender = "여성";
                        break;
                    default:
                        if(i==0) i++;
                        System.out.println("M과F 중에서 선택해 주세요");
                        continue;
                }
                break;
            }catch (Exception e){
                System.out.println("오류!");
                if(i==0) i++;
            }
        }
            setJob();
    }


    public void setJob() {
        int i = 0;
        int j = 0;
        while(true){
            try {
                if(i==1) sc.nextLine();
                System.out.print("직업(1:학생, 2:회사원, 3:주부, 4:무직) : ");
                j = sc.nextInt();
                switch (j){
                    case 1:
                        this.job = "학생";
                        break;
                    case 2:
                        this.job = "회사원";
                        break;
                    case 3:
                        this.job = "주부";
                        break;
                    case 4:
                        this.job = "무직";
                        break;
                    default:
                        System.out.println("4가지 직종 중 숫자로 입력 하세요.");
                        if(i==0) i++;
                        continue;
                }
                break;
            }catch (Exception e){
                System.out.println("정수만 입력해 주세요.");
                if(i==0) i++;
            }
        }
        System.out.println("정보 입력 종료.");
    }

    public void getInfo(){
        System.out.println();
        System.out.println("=".repeat(5)+ name + "님의 정보 입니다." + "=".repeat(5));
        System.out.println("이름 : "+ name);
        System.out.println("나이 : "+ age);
        System.out.println("성별 : "+ gender);
        System.out.println("직업 : "+ job);
    }

}
