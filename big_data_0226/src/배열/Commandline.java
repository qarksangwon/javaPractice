package 배열;

public class Commandline {
    public static void main(String[] args) {
        if(args.length!=2) {
            System.out.println("자바 Main String Argument num1과 num2 받아야 하니 2개 넣어주세요");
            System.exit(0);
        }
        String strNum1 = args[0];
        String strNum2 = args[1];
        System.out.println((strNum1 + "+" + strNum2 + "=" + (Integer.parseInt(strNum1)+Integer.parseInt(strNum2))));

    }
}
