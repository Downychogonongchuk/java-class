package ch09_arraybasic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex_09 {
    public static void main(String[] args) {
    int [] num ={3,2,1,5,4};
    int a;  // 비교하면서 담을 변수
    for (int i=0; i< num.length; i++ ) { // 인덱스 0번
        for (int j=i+1; j< num.length; j++ ){ // 인덱스 1번
                if (num[i]> num[j]){ // 0번이 1번보다 크다면
                    a=num[i]; // a에 0번 값 대입
                    num[i] = num[j]; // 0번에 1번 값 대입
                    num[j]=a; // 1번에 a 대입
                }
            }
        System.out.print(num[i]);
        }
        }
    }
//        Arrays.sort(num);
//        System.out.println(Arrays.toString(num));


