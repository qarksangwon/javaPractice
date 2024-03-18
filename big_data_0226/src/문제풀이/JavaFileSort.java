package 문제풀이;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class JavaFileSort {
    public static void main(String[] args) {
        TreeSet<StudentScore> sortStd = new TreeSet<>();
        FileInputStream inputStream = null;

        try{
            inputStream = new FileInputStream("src/문제풀이/score.txt");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        Scanner sc = new Scanner(inputStream);
        while(sc.hasNext()){
            String[] strInfo = sc.nextLine().split(" ");
            int total = Integer.parseInt(strInfo[1])+
                    Integer.parseInt(strInfo[2])+
                    Integer.parseInt(strInfo[3]);
            double avg = total/3.0;
            sortStd.add(new StudentScore(strInfo[0],avg,total));
        }
        int i = 1;
        for(StudentScore s : sortStd){
            System.out.printf("%d등 %s %d %.2f\n",i++,s.name,s.total,s.average);
        }

    }
}

class StudentScore implements Comparable<StudentScore> {
    String name;
    double average;

    int total;

    public StudentScore(String name, double average, int total) {
        this.name = name;
        this.average = average;
        this.total = total;
    }

    @Override
    public int compareTo(StudentScore o) {
        if(this.average < o.average) {
            return 1;
        } else if(this.average > o.average) {
            return -1;
        }
        else {
            return this.name.compareTo(o.name);
        }
    }


}