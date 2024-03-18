package stringStream;
// 문자 Stream 은 char 단위로 전송하고 사용 방법은 byte Stream 과 동일.

import java.io.*;

public class StringStreamEx {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("src/stringStream/test.txt");
        char[] data = "호잇끼얏호우".toCharArray();
        for(int i = 0; i<data.length; i++) writer.write(data[i]);

        writer.flush();
        writer.close();

        Reader reader = new FileReader("src/stringStream/test.txt");
        int readData;
        while(true){
            readData = reader.read();
            if(readData == -1) break;
            System.out.print((char)readData);
        }
        reader.close();
    }
}
