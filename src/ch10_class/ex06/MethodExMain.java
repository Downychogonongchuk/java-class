package ch10_class.ex06;

public class MethodExMain {
    public static void main(String[] args) {
        MethodEx mEx = new MethodEx();
        // method1 호출
        mEx.method1();;
        System.out.println("호출 후");
        // method2 호출
        mEx.method2("안녕하세요");
        String str1 = "오늘은 화요일";  // 문자열 변수 행성
        mEx.method2(str1); // 다른 클래스의 메소드에 변수 넘기기

        // method3 호출
        String result = mEx.method3();
        System.out.println("result = " + result);
        // or
        System.out.println(mEx.method3());

        int result2 = mEx.method4();
        System.out.println(result2);
        // or
        System.out.println(mEx.method4());

        // method5 호출
        String result3 = mEx.method5("안녕",1000);
        System.out.println("result3 = " + result3);

        int result4 = mEx.method6(10,20);
        System.out.println("result4 = " + result4);
    }
}
