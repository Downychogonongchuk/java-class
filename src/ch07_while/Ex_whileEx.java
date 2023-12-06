package ch07_while;

public class Ex_whileEx {
    public static void main(String[] args) {
        /**
         * for 문  : 정해진 횟수만큼 반복  # 배열과 주로 사용
         * while 문 : 조건식이 true일 경우 계속해서 반복
         * 조건식이 false가 되면 반복 멈추고 종료 
         * # 특정 조건에 만족할 때까지 반복
         */
//         While 사용 1부터 10까지 출력

        int i =0;
        while(i<10){
            i++;
            System.out.println(i);
        }

        // 1~100 까지의 합 구하기
//        int sum=0; // 합계를 저장할 변수
//
//        int i = 1; // 루프 카운터 변수
//        while (i<=100){
//            sum+=i;
//            i++;
//        }
//        System.out.println("1~"+(i-1)+" 합:  "+sum);


        /**
         *  do -While  블록 내부 실행문 우선 실행하고
         *  실행 결과에 따라 반복 실행을 계속할지 결정
         *  do{
         *  실행문;
         *  } while(0
         *
         */


        /**
         *
         1. 횟수가 정해져 있지 않은 상황에서 활용을 할 수 있음
         2. for문과 동일한 목적으로도 사용 가능
         3.while , do while
         a. while : 반복조건을 만족해야 한번이라도 실행
         b. do while : 반복조건 만족과 상관없이 한번은 실행하고 조건을 따짐

         문법

         while(조건식){
         조건을 만족할 경우 실행 할 문장
         }

         do {
         조건을 따지기 전에 한번은 실행됨
         조건을 만족하면 반복실행
         }while(조건식); // 마지막에 세미콜론이 붙음
         */








    }



}
