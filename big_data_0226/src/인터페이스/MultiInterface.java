package 인터페이스;

public class MultiInterface {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Buy buyer = customer;
        buyer.buy();
        buyer.order();

        Sell seller = customer;
        seller.sell();
        seller.order();

        Customer customer1 = (Customer) seller;
        customer1.buy();
        customer1.sell();
        customer1.order();
    }
}

interface Sell{
    void sell();
    default void order(){
        System.out.println("판매 주문");
    }
}
interface Buy{
    void buy();
    default void order(){
        System.out.println("구매 주문");
    }
}

class Customer implements Buy, Sell{

    @Override
    public void sell() {
        System.out.println("고객이 판매하기");
    }

    @Override
    public void buy() {
        System.out.println("고객이 구매하기");
    }

    @Override
    public void order() {
        System.out.println("주문");
    }

}