package ch06_for;

public class Ex08_ForEx {
    /**
     *  긴 주석
     * @param args
     */
    public static void main(String[] args) {

        for(int i=2; i<=9; i++){ // 몇 단 
            // 2부터 9까지 1씩 더해지는  i
            System.out.println(i + "단");
            for(int j=1; j<=9; j++){
                // 1부터 9까지 1씩 더해지는 j
                System.out.print(i+"x"+j+"="+(i*j));
                // i와 j 의 곱
                System.out.print("\t"); // "\t" 자바 공백
            }
            System.out.print("\n"); // "\n" 자바 줄바꿈
        }

    }
}
