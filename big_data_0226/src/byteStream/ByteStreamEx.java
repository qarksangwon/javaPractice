package byteStream;
// Byte Stream : 데이터 전송을 바이트 단위로 하는 것.
// 이는 동영상, 이미지 전송에 적합하다.
// Byte Stream 의 최상위 클래스는 InputStream 과 OutputStream


import java.io.*;

public class ByteStreamEx {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("src/byteStream/test2.db");
//        byte a = 10;
//        byte b = 20;
//        byte c = 30;
        byte[] bArr = {10,20,30};
//        os.write(a);
//        os.write(b);
//        os.write(c);
        os.write(bArr);

        os.flush(); // 버퍼 지움
        os.close(); // 자원 다 반납 후 스트림 닫음.

        InputStream is = new FileInputStream("src/byteStream/test.db");
        while(true){
            int data = is.read(); // 1byte 씩 읽음
            if(data == -1) break; // 파일의 끝은 read 시 -1 값 들어옴
            System.out.println(data);
        }
    }
}
