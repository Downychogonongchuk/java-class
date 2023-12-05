package ch06_for;

public class Ex11_For2 {
    public static void main(String[] args) {

        for (int i=1; i<=5; i++){ // 줄 수 , 별을 출력할 횟수
            for (int j =(i+1); j <= 5 ; j++){ // 별을 줄수만큼 출력
                System.out.print(" ");
            }
            System.out.println("*"); // 줄을 바꾸기 위한 용도  ㅇㅅㅇ
        }

        for (int i=1; i<=5; i++){ // 줄 수 , 별을 출력할 횟수
            for (int j =1; j <= i ; j++){ // 별을 줄수만큼 출력
                System.out.print("*");
            }
            System.out.println(" "); // 줄을 바꾸기 위한 용도  ㅇㅅㅇ
        }
    }
    }




