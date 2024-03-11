package 인터페이스;

import java.util.Scanner;

public class CocoaMain {
    public static void main(String[] args) {
        CocoaTalk cocoaTalk = new CocoaTalk("너에게");
        cocoaTalk.writeMsg("날씨가 따뜻하네. 봄이 오나 봐.");
        NetworkAdaptor adaptor;
        Scanner sc = new Scanner(System.in);
        System.out.print("네트워크 [1]Wifi [2]5G [3]LTE : ");
        int select = sc.nextInt();
        switch (select){
            case 1 : adaptor = new Wifi(); break;
            case 2 : adaptor = new FiveG(); break;
            case 3 : adaptor = new LTE(); break;
            default: adaptor = new LTE(); break;
        }
        cocoaTalk.send(adaptor);

    }
}
