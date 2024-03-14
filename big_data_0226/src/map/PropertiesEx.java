package map;
// Properties 란 키와 값을 String 타입으로 제한한다.
// 제한하는 이유는 설정 정보 등을 파일에 쓰기 위해서 이다.
// Properties 를 사용하는 이유는
// 환경 설정이나 뭔가 중요한 파일을 만들어놓고 해당 파일을 숨기기 위해
// 위의 해당하는 경우에 사용하게 된다고 한다.
// HashTable 을 상속받아 기능을 제한해 몇몇 기능만 사용한다.

import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesEx {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        String path = PropertiesEx.class.getResource("./database.properties").getPath();
        path = URLDecoder.decode(path, "utf-8"); // 한글이 포함된 경우를 위해 
        properties.load(new FileReader(path));
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        System.out.println("drive : " + driver);
        System.out.println("url : " + url);
        System.out.println("username : " + username);
        System.out.println("password : " + password);
    }
}
