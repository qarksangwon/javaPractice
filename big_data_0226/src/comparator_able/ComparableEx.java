package comparator_able;
// Comparable interface 는 객체를 정렬하는 데 사용되는 메소드인
// compareTo() 메소드를 정의하고 있다. = 같은 타입 인스턴스 비교
// 자기 자신과 전달받은 매개 변수를 비교하는 인터페이스.
// Comparator 는 두 객체를 전달 받아 비교해준다.



import java.util.Iterator;
import java.util.TreeSet;

public class ComparableEx {
    public static void main(String[] args) {
        TreeSet<CarCompare> arrList = new TreeSet<>();
        arrList.add(new CarCompare("Santafe",2016,"White"));
        arrList.add(new CarCompare("Sorento",2012,"Sliver"));
        arrList.add(new CarCompare("Grandeur",2018,"Black"));
        // Tree 구조로 만드는 이유는 TreeSet 을 사용하면 선언해둔
        // Comparable<CarCompare> 안의 compareTo() 메소드의 규칙에 따라
        // 정렬이 되어 저장되기 때문

//        for(CarCompare c : arrList) c.infoView();
//        Iterator<CarCompare> iterator = arrList.iterator();
//        while(iterator.hasNext()){
//            CarCompare car = iterator.next();
//            car.infoView();
//        }
        arrList.add(new CarCompare("Morning",2012,"Orange"));
        // 이는 출력이 안되는데 Set 구조에서 정렬 조건을 modelYear 로 지정해 줬는데
        //  같은 값이 들어와 set 구조에서 중복돼 삭제된것.

        for(CarCompare car : arrList) car.infoView();
    }
}

class CarCompare implements Comparable<CarCompare>{
    String modelName;
    int modelYear;
    String color;

    public CarCompare(String modelName, int modelYear, String color){
       this.modelName = modelName;
       this.modelYear = modelYear;
       this.color = color;
    }

    @Override
    public int compareTo(CarCompare o) {
        if(this.modelYear == o.modelYear) {
            return modelName.compareTo(o.modelName);
            // 같은 연식이 중복으로 제거되는 현상을 방지하기 위해
            // 조건을 하나 추가, 이름이 사전적 정의로 정렬.
        }
        else if(this.modelYear > o.modelYear) return 1;
        else return -1;
    }

    public void infoView(){
        System.out.println(modelName+ " : "+modelYear);
        System.out.println();
    }
}