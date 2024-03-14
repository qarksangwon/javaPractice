package comparator_able;

import java.util.Comparator;
import java.util.TreeSet;

// Comparator 또한 객체를 정렬하기 위해 사용하는 인터페이스
// 두 개의 파라미터를 받아서 비교함.
public class ComparatorEx {
    public static void main(String[] args) {
        TreeSet<Fruit> treeSet = new TreeSet<>(new DescendingComparator());
        treeSet.add(new Fruit("포도", 3000));
        treeSet.add(new Fruit("수박", 10000));
        treeSet.add(new Fruit("딸기", 6000));
        treeSet.add(new Fruit("망고",3000));
        for(Fruit f : treeSet) System.out.println(f.name + " : " + f.price);
    }
}

class Fruit{
    String name;
    int price;

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

class DescendingComparator implements Comparator<Fruit>{

    @Override
    public int compare(Fruit o1, Fruit o2) {
        if(o1.price > o2.price) return -1;
        else if(o1.price<o2.price) return 1;
        else {
            return o1.name.compareTo(o2.name);
        }
    }
}