package Ex01_MapBasic;

import java.util.HashMap;
import java.util.Map;

public class Ex01_MapBasic {
    public static void main(String[] args) {
        Map<Integer, String >map1 = new HashMap<>();
        // Key 타입 : 정수 (int ), value : String
        map1.put(1, "안녕");
        map1.put(2, "Hello");
//        map1.put(3, 100); // value 타입 불일치
//        map1.put("4", "안녕");  // Key 타입 불일치
    //key가 1인 데이터
        System.out.println(map1.get(1));
        String s1 = map1.get(2);
        System.out.println(s1);
        map1.put(100, "ㅇㅅㅇ");
        // 동일한 키에 다른 데이터를 넣는다면
        map1.put(1, "다른 데이터");
        System.out.println(map1.get(1));
        // 반복문으로 접근  // map1.keySet() :  key만으로 이루이진 객체 만들기
        for (Integer i: map1.keySet()){  // Integer or int
            System.out.println(i);
        }

        // key : String , value : String
        Map<String , String > map2 = new HashMap<>();
        map2.put("가", "안녕");
        map2.put("나", "소다");
        map2.put("다", "반갑");
        System.out.println(map2.get("다"));

        // 반복문
        for (String  i :map2.keySet()) {
            System.out.println(map2.get(i));
        }

        Map<Long, String >map3 = new HashMap<>();
        String  ss1 = map3.put(1L, "안녕");
        System.out.println("ss1 = " + ss1);
        String  ss2 = map3.put(2L, "안녕하세요");
        System.out.println("ss2 = " + ss2);
        String  ss3 = map3.put(3L, "안녕반갑");
        System.out.println("ss3 = " + ss3);
    }
}
