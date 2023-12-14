package ch11_array.Ex01_ListBasic;

import java.util.ArrayList;
import java.util.List;

public class Ex01_ListBasic {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        // ArrayList<Integer>intList2 = new ArrayList<>();
//        List<Integer> intList3 = new List<>();
//         10 이라는 데이터를 추가하고
        intList.add(10);
        intList.add(11);
        intList.add(12);
        // 0번 데이터를 출력해본다
//        System.out.println("intList.get(0) = " + intList.get(0));
//        System.out.println("intList.get(1) = " + intList.get(1));
//        System.out.println("intList.get(2) = " + intList.get(2));
//        //remove()
//        intList.remove(1);
        List<String>strList = new ArrayList<>();

        strList.add("안녕");
        strList.add(1,"오랜만이야");
        strList.add(2,"반가워");
//        System.out.println("strList.get(0) = " + strList.get(0));
//        System.out.println("strList.get(1) = " + strList.get(1));
//        String str1 = strList.get(1);
//        System.out.println("str1= " + str1);

        // for문을 이용하여 intList 에 담긴 데이터를 모두 출력
        for (int i=0; i< intList.size();i++){
            System.out.println(intList.get(i));
        }
        // for 문을 이용하여 strList 에 담긴 데이터를 모두 출력
        for (int i=0; i<strList.size(); i++){
            System.out.println(strList.get(i));
        }
        for (String bb:strList){
            System.out.println("bb = " + bb);
        }
        strList.forEach(bb->{
            System.out.println("bb = " + bb);
        });
        intList.forEach(a->{
            System.out.println("a = " + a);
        });


    }
}
