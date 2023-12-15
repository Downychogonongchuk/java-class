package ch11_array.Ex01_ListBasic;

import java.util.ArrayList;
import java.util.List;

public class ex02ex {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        List newList = new ArrayList<>(list);  // List 복사 본
        list.add(30);
        list.add("안녕");
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        for (Object oo:list) {
            System.out.println(oo);
        }

            
        }
    }

