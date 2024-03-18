package fileScanner;
// File 을 읽어들일 때 Scanner 를 사용할 수 있다.


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScannerEx {
    public static void main(String[] args) {
        FileInputStream inputStream = null;

        try{
            inputStream = new FileInputStream("src/fileScanner/sampleData.txt");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        Scanner sc = new Scanner(inputStream);
        while(sc.hasNext()){
            String line = sc.nextLine();
            System.out.println(line);
        }
    }
}
