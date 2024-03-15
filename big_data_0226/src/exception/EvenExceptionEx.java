package exception;



public class EvenExceptionEx {
    public static void main(String[] args) {
        try{
            System.out.println(CheckEven.printEven(100));
            System.out.println(CheckEven.printEven(99));
        }catch (EvenException e){
            e.printStackTrace();
        }

    }
}


class EvenException extends Exception{
    private Integer number = null;
    public EvenException (int number){
        this.number = number;
    }
    @Override
    public String getMessage(){
        if(number == null) return "숫자가 아닙니다";
        else return number + "는 짝수가 아닙니다.";
    }
}

class CheckEven {
    public static int printEven(int number) throws EvenException {
        if(number % 2 != 0) {
            throw new EvenException(number);
        }else{
            return number;
        }
    }
}