package 연습문제;

import 윤년계산하기.LeapYearEx;
import java.util.Scanner;

public class Practice1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        alarm();
    }
    public static void grade(){
        int score;
        while(true) {
            try {
                System.out.print("점수 입력:");
//                if (start == 1) sc.nextLine();
                score = sc.nextInt();
                if (score >= 90 && score <= 100) {
                    System.out.println("점수 : A");
                }else if(score>=80){
                    System.out.println("점수 : B");
                }else if(score>=70){
                    System.out.println("점수 : C");
                }else if(score>=60){
                    System.out.println("점수 : D");
                }else if(score>=0){
                    System.out.println("점수 : F");
                }else{
                    System.out.println("점수는 0~100점만 기입 가능합니다.");
                    sc.nextLine();
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("정수만 입력해 주세요.");
                sc.nextLine();
            }
        }
    }

    public static void maximum(){
        int start =0;
        while(true) {
            try {
                System.out.print("숫자 입력:");
                if (start == 1) sc.nextLine();
                int num = sc.nextInt();
                if(num>=1000||num<100){
                    System.out.println("세자리만 입력해 주세요.");
                    continue;
                }else{
                    int num1 = num/100;
                    int num2 = (num%100)/10;
                    int num3 = num%10;
                    int max = Math.max(num1, num2);
                    max = Math.max(max,num3);
                    System.out.println("세 숫자는 각 "+num1+","+num2+","+num3+" 이며" +
                            "가장 큰 숫자는 "+ max +"입니다.");
                }
                break;
            } catch (Exception e) {
                System.out.println("정수만 입력해 주세요.");
                if (start == 0) start += 1;
            }
        }
    }

    public static void invitation(){
        int start =0;
        while(true) {
            try {
                if (start >= 1) sc.nextLine();
                System.out.print("이름 입력:");
                String name = sc.nextLine();
                System.out.print("제목 입력:");
                String title = sc.nextLine();
                System.out.print("날짜(연월일) 입력(ex 20240228):");
                String date = sc.nextLine();
                System.out.print("시간 입력(00~24H):");
                int time = sc.nextInt();
                String outStr = "";
                int year = Integer.parseInt(date.substring(0,5));
                int month = Integer.parseInt(date.substring(4,6));
                int day = Integer.parseInt(date.substring(6,8));
                if(month<1||month>12){
                    System.out.println("월을 잘못 입력하셨습니다.");
                    start +=1;
                    continue;
                }

                if((month%2==0)&&(month!=2)){
                    if(day>30||day<0) {
                        System.out.println("일자를 잘못 입력하셨습니다.");
                        start +=1;
                        continue;
                    }
                }else if(month==2){
                    switch (LeapYearEx.leapYear(year)){
                        case 0:
                            if(day>28||day<0){
                                System.out.println("일자를 잘못 입력하셨습니다.");
                                start +=1;
                                continue;
                            }
                            break;
                        case 1:
                            if(day>29||day<0){
                                System.out.println("일자를 잘못 입력하셨습니다.");
                                start +=1;
                                continue;
                            }
                            break;
                    }
                }
                else{
                    if(day>31||day<0) {
                        System.out.println("일자를 잘못 입력하셨습니다.");
                        start +=1;
                        continue;
                    }
                }

                if(time<0||time>24){
                    System.out.println("시간을 잘못 입력하셨습니다.");
                    start +=1;
                    continue;
                }

                switch (month){
                    case 12: case 1: case 2:
                        outStr = "한파의 연속인 "+month+"월 입니다.";
                        break;
                    case 3:
                        outStr = "봄의 기운이 느껴지는 3월 입니다.";
                        break;
                    case 4:
                        outStr = "새싹이 피어나는 4월 입니다.";
                        break;
                    case 5:
                        outStr = "계절의 여왕 5월 입니다.";
                        break;
                    case 6:
                        outStr = "활동하기 좋은 6월 입니다.";
                        break;
                    case 7:
                        outStr ="휴가가 기다려지는 7월 입니다.";
                        break;
                    case 8:
                        outStr = "무더운 8월 입니다.";
                        break;
                    case 9:
                        outStr = "신선한 9월 입니다.";
                        break;
                    case 10:
                        outStr ="천고마비의 계절 10월 입니다.";
                        break;
                    case 11:
                        outStr ="쓸쓸한 늦가을 11월 입니다.";
                        break;
                }
                System.out.println(name+"님,\n"+outStr+"\n아래와 일정으로 " +
                        title+"을(를) 진행하고자 하오니 오셔서 자리를 빚내 주시기 바랍니다. \n\n" +
                        "====행사 안내====\n" +
                        "일시 : " +year+"년 "+month+"월 "+day+"일\n" +
                        "시간 : "+time+"시");
                break;
            } catch (Exception e) {
                System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
                if (start == 0) start += 1;
            }
        }
    }

    public static void alarm(){
        int start =0;
        while(true) {
            try {
                String time = sc.nextLine();
                int hour = Integer.parseInt(time.split(":")[0]);
                int min = Integer.parseInt(time.split(":")[1]);
                if(hour>23||hour<0){
                    System.out.println("시간을 잘못 입력하셨습니다.");
                    start +=1;
                    continue;
                }
                if(min>59||min<0){
                    System.out.println("분을 잘못 입력하셨습니다.");
                    start +=1;
                    continue;
                }
                if(min>=45){
                    min -= 45;
                    System.out.println(hour+":"+min);
                }else{
                    int hourCheck = hour-1;
                    hour = (hourCheck<0)?23:hourCheck;
                    min = min+15;
                    System.out.println(hour+":"+min);
                }
                break;
            } catch (Exception e) {
                System.out.println("정수만 입력해 주세요.");
            }
        }
    }

}
