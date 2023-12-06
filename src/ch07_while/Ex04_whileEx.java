package ch07_while;

public class Ex04_whileEx {
    public static void main(String[] args) {
        /**
         * random() 메서드를 이용해서 1~6이 나오는 주사위를 설정하고
         * 주사위가 계속던져지면서 6이 나오면 종료되는 코드 작성
         */
//        System.out.println((int)(Math.random()  *6) + 1);
            boolean x = true;
            //  boolean  타입 true or false  변수 x는 true;
            while (x){
                // while문 조건문이  true 일 경우 무한 반복 x가 true 반복
                int num = (int)(Math.random()   *6)+1;
                // 반복문 안에서 랜덤으로 1~6까지의 변수 num 무한생성
                System.out.println("num =" + num);
                // 계속 생성 되는 변수 num 찍어보기
                if (num ==6){
                    // 변수 num 이 6일 경우
                    x = false;
                    // while 조건문에 넣어준 true를 false를 대입 무한 루프 종료
                }
            }

    }
}
