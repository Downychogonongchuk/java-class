package ch09_arraybasic;

public class Ex01_arrayBasic {
    public static void main(String[] args) {
        // 크기가 5인 정수형 배열 numbers1
        int[] numbers1 = new int[5];
        System.out.println(numbers1[0]);
        //크기가 3인 String 배열 strings1
        String[] strings1 = new String[3];
        // 크기가 10인 실수형 배열 doubles1
        double[] doubles1 = new double[10];
        // 정수형 배열 numbers2 이름만 선언하고
        // 다음 줄에 크기 8을 지정하여 배열 선언
        int[] numbers2 = null;
        numbers2 = new int[8];
        // 10 , 20, 30, 40 이 들어있는 number2 배열 선언
        int[] numbers3 = {10, 20, 30, 40};
        // "가", "나", "다", "라"가 들어있는 strings2 배열 선언
        String[] strings2 = {"가", "나", "다", "10"};


        int[] number1 = {10, 20, 30, 40, 50, 60};

        //number1 에 저장된 모든 데이터의 총합, 평균 계산

        for (int i = 0; i < number1.length; i++) {
            System.out.println(number1[i]);
        }

        int sum =0;
        for (int i = 0; i < number1.length; i++) {
                sum += number1[i];
        }
            int avg = sum/number1.length;
        System.out.println(avg);
    }
}