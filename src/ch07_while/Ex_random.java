package ch07_while;

public class Ex_random {
    public static void main(String[] args) {
        /**
         *  random() 메서드
         *  (int)  (Math.random()  * 10)    +1 )   ;
         *  1 ~ 10까지의  정수
         * System.out.println(Math.random());

         */
        // Random 메서드: 지정한 범위 내에서 숫자를 무작위로 발생시킴
        // 1 ~ 10 사이의 정수
        // (int) (Math.random() * 10) + 1

        // Math 클래스의 random() 메서드
        // 메서드: 어떤 출력(리턴타입) => double (0.0 ~ 1.0)
        System.out.println(Math.random());
        // 결과값에 10을 곱해서 정수 부분을 만듦 (0 ~ 10)
        System.out.println(Math.random() * 10);
        // 결과값에 45을 곱해서 정수 부분을 만듦 (0 ~ 45)
        System.out.println(Math.random() * 45);
        // 실수(double) => 정수(int) : 형변환(type conversion)
        System.out.println((int)(Math.random() * 10)); // 0 이상 9 이하의 정수
        System.out.println((int)(Math.random() * 10) + 1); // 1 이상 10 이하의 정수
        System.out.println((int)(Math.random() * 45) + 1); // 1 이상 45 이하의 정수
        // random () 메서드 = 실수 소수점 자리의 메서드
        // 강제 형 변환시  +1 : 실수 0.34355   * 2  = 0 ~ 2 미만 # 0~ 1 이하
        // + 1시  0 ~ 2미만 에서 >> 1 ~ 3미만


        // 형변환
        int int1 = 10;
        double double1 = 1.2345678;

        // 정수형 변수를 실수형 변수에 대입
        double double2 = int1;
        System.out.println("double2 = " + double2);

        // 실수형 변수를 정수형 변수에 대입(강제형변환)
        int int2 = (int) double1; // 형변환 에러
        System.out.println("int2 = " + int2);



    }
}
