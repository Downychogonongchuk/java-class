package ch05_for;

public class Ex02_For {
    public static void main(String[] args) {
        //1~10까지 순서대로 출력
        // 2,4,6,8,10 출력
        // 5,4,3,2,1, 출력

        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }    // int i 가 1, i가 10보다 작거나 같다면 1씩 증가
        for(int i = 2; i <=10; i+=2){
            System.out.println("i = " + i);
        }  // int i가 2, i가 10보다 작거나 같다면 2씩 증가
        for(int i =5; i>=1; i--){
            System.out.println("i = " + i);
        }   // int i가 5, i가 1보다 크거나 같다면 1씩 감소



    }
}