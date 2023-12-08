package ch09_arraybasic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex_09 {
    public static void main(String[] args) {
    int [] num ={3,2,1,5,4};
    int a;
    for (int i=0; i< num.length; i++ ) {
        for (int j=i+1; j< num.length; j++ ){
                if (num[i]> num[j]){
                    a=num[i];
                    num[i] = num[j];
                    num[j]=a;
                }
            }
        System.out.print(num[i]);
        }
        }
    }
//        Arrays.sort(num);
//        System.out.println(Arrays.toString(num));


