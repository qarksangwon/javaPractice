package map;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx2 {
    static Map<String, MenuInfo> map = new HashMap<>();
    public static void main(String[] args) {
        makeMenu();
        selectMenu();
    }

    static void makeMenu(){
        map.put("Americano",new MenuInfo("Americano",2000,"Coffee","기본 커피"));
        map.put("Espresso",new MenuInfo("Espresso",2500,"Coffee","진한 커피"));
        map.put("Latte",new MenuInfo("Latte",4000,"Coffee","우유 포함"));
    }

    static void selectMenu(){
        Scanner sc = new Scanner(System.in);
        String key;
        while (true){
            System.out.print("메뉴 선택 : ");
            System.out.println("[1]보기  [2]조회  [3]추가  [4]삭제  [5]수정  [6]종료");
            int selMenu = sc.nextInt();
            switch (selMenu){
                case 1 :
                    System.out.println("=====메뉴 보기=====");
                    for(String e : map.keySet()){
                        System.out.println("메뉴 : " + map.get(e).name);
                        System.out.println("가격 : " + map.get(e).price);
                        System.out.println("분류 : " + map.get(e).category);
                        System.out.println("설명 : " + map.get(e).desc);
                        System.out.println("---------------");
                    }
                    break;
                case 2:
                    System.out.println("조회 할 메뉴 선택");
                    key = sc.next();
                    if(map.containsKey(key)){
                        System.out.println("메뉴 : " + map.get(key).name);
                        System.out.println("가격 : " + map.get(key).price);
                        System.out.println("분류 : " + map.get(key).category);
                        System.out.println("설명 : " + map.get(key).desc);
                    }else System.out.println("해당 메뉴는 존재 X");
                    break;
                case 3:
                    System.out.print("추가 할 메뉴 입력 : ");
                    key = sc.next();
                    if(map.containsKey(key)) System.out.println("해당 메뉴는 이미 있습니다.");
                    else{
                        System.out.print("가격 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 : ");
                        String ctg = sc.next();
                        System.out.print("설명 : ");
                        String desc = sc.next();
                        map.put(key,new MenuInfo(key,price,ctg,desc));
                    }
                    break;
                case 4:
                    System.out.print("삭제할 메뉴 입력 : ");
                    key = sc.next();
                    if(!map.containsKey(key)) System.out.println("없는 메뉴입니다.");
                    else {
                        map.remove(key);
                        System.out.println(key + " 메뉴를 삭제했습니다.");
                    }
                    break;
                case 5:
                    System.out.print("수정할 메뉴 입력 : ");
                    key = sc.next();
                    if(!map.containsKey(key)) System.out.println("없는 메뉴입니다.");
                    else{
                        System.out.print("가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 입력 : ");
                        String ctg = sc.next();
                        System.out.print("설명 입력 : ");
                        String desc = sc.next();
                        map.replace(key,new MenuInfo(key,price,ctg,desc));
                    }
                    break;
                case 6:
                    System.out.println("종료");
                    return;
            }
        }
    }
}

class MenuInfo{
    String name;
    int price;
    String category;
    String desc;

    public MenuInfo(String name, int price, String category, String desc) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.desc = desc;
    }
}