package stream;

import java.util.ArrayList;
import java.util.List;

public class StreamEx2 {
    public static void main(String[] args) {
        TravelCustomer cA = new TravelCustomer("둘리",21,100);
        TravelCustomer cB = new TravelCustomer("또치",21,100);
        TravelCustomer cC = new TravelCustomer("도우너",24,80);
        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(cA);
        customerList.add(cB);
        customerList.add(cC);
        customerList.add(new TravelCustomer("희동이",2,100));
        System.out.println("명단 순서대로 출력");
        customerList.stream().map(c -> c.getName()).forEach(s -> System.out.print(s+ " "));
        System.out.println();
        int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
        System.out.println("총 비용 : " + total);

        System.out.println("==5세 이상 출력 명단==");
        customerList.stream().filter(c -> c.getAge()>=5)
                .map(c -> c.getName())
                .sorted()
                .forEach(s -> System.out.printf(s+ " "));
        System.out.println();
    }
}

class TravelCustomer {
    private String name;
    private  int age;
    private  int price;

    public TravelCustomer(String name, int age, int price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPrice() {
        return price;
    }
}