package ch11_array.T;

public class StudentService { //
    StudentRepository sr = new StudentRepository();

    public void method1(){
        System.out.println("StudentService.method1");
        //Repository의 method1 호출
        sr.method1();
    }
    public void method2(){
        System.out.println("StudentService.method2");
        String str1 ="집에 가고 싶다";
        sr.method2(str1);
    }
    public  void method3(){
        System.out.println("StudentService.method3");
    }


}
