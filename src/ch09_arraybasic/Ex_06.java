package ch09_arraybasic;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        int num[] = {5, 2, 1, 3, 4, 7, 6, 9, 10, 8};
        /**
         * 위와 같은 배열이 있을 때 1~10 사이의 숫자 중에서 하나를
         * 입력했을 때 그 숫자가 몇 번 인덱스에 있는지 출력ㄴ
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("찾으시는 숫자를 입력해주세요");
        int put = sc.nextInt();
        for (int i=0; i<num.length; i++){
            if (put==num[i]){  // 입력받은 값과 배열의 숫자가 같다면
                System.out.println(i);
                System.out.println(put+"은"+i+"인덱스에 있습니다.");
                // i번째를 출력 
                /**
                 * 0 ~ num.length까지 for 문이 돌고
                 * i의 값이 계속 증가 num[i] 배열의 i번째 와
                 * 입력받은 값을 계속 비교 값이 동일하다면 i 번째 = 인덱스 출력
                 */
            }
        }
    }
}
