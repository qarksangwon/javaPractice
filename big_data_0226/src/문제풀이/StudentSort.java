package 문제풀이;
// 첫 줄에 학생 수 N, 1<=N<=100,000
// 두 번째 줄 부터 N + 1 줄 까지(마지막 줄 까지) 학생의 이름을 나타내는
// 문자열과 학생의 성적을 나타내는 정수가 공백으로 구분돼 입력
// 문자열 길이와 성적은 100 이하 자연수
// 입력 예시
// 2
// 홍길동 95
// 이순신 77
// 학생의 이름을 성적이 낮은 순으로 출력 , 성적이 동일한 학생은 자유롭게 출력
// 출력 예시
// 이순신 홍길동


import java.util.*;

public class StudentSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        TreeSet<Student> std = new TreeSet<>();
        sc.nextLine();
        for(int i = 0; i<cnt; i++){
            String name = sc.next();
            int score = sc.nextInt();
            std.add(new Student(name,score));
        }
        for(Student s : std) System.out.println(s.name);
    }
}

class Student implements Comparable<Student>{
    String name;
    int score;

    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        if(this.score>o.score) return 1;
        else if(this.score==o.score) return this.name.compareTo(o.name);
        else return -1;
    }
}


