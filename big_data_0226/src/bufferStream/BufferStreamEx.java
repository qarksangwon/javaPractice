package bufferStream;
// Buffer Stream : 보조 스트림
// 성능 향상 보조 스트림
// 입력 스트림과 출력 스트림의 속도보다 프로그램이 처리하는 속도가 빠르다
// 즉 입출력 장치가 느려 프로그램의 느려짐을 완화시키기 위해 사용하는것.

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferStreamEx {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        // Input -> inputStream -> BufferInputStream -> 프로그램 -> 파일
        // 파일 -> 프로그램 -> BufferOutputStream -> OutputStream -> Output

        int data = -1;
        long start = 0;
        long end = 0;

        fis = new FileInputStream("src/bufferStream/forest.jpg");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("src/forest.jpg");

        while((data = bis.read())!= -1){
            fos.write(data);
        }
        fos.flush();
        end = System.currentTimeMillis();
        fos.close();
        bis.close();
        fis.close();
        System.out.println("사용하지 않음 : " + (end-start) + "ms");

        fis = new FileInputStream("src/bufferStream/forest.jpg");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("src/forest2.jpg");
        bos = new BufferedOutputStream(fos);
        start = System.currentTimeMillis();
        while((data = bis.read()) != -1) {
            bos.write(data);
        }
        bos.flush();
        end = System.currentTimeMillis();
        bos.close(); fos.close(); 	bis.close(); fis.close();
        System.out.println("사용했을 때: " + (end-start) + "ms");
    }

}
