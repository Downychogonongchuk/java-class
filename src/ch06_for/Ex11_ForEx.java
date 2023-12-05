package ch06_for;

public class Ex11_ForEx {
    public static void main(String[] args) {
        /**
         * 별찍기
         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = (i + 1); j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
