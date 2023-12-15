package ch11_array.T;

import java.util.List;
import java.util.Scanner;

public class StudentService { //
    StudentRepository sr = new StudentRepository();
    Scanner sc = new Scanner(System.in);
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
    // StudentDto 객체를 생성하고
    // Repository의 method3로 Dto 객체를 전달함

    public  void method3() {
        StudentDto stuD = new StudentDto("크레용","222222","귤","신형만");
        sr.method3(stuD);
        System.out.println("StudentService.method3");
        System.out.println(sr.method3(stuD));
    }
//    public void method4(){
//        StudentDto stuD = new StudentDto("신짱구","222222","봉미선","신형만");
//        // DTO 클래스를 선언함 Dto 필드에 저장하려고
//        // 저장 값은 생성자 타입에 맞춰 넘겨줘 저장가능
//        sr.method4(stuD);
//        // 레포지토리에 메서드 4에 선언한 객체 stuD 를 전달함
//    }
    public  void method4(){
        List<StudentDto> studentDtoList = sr.method4();
        for(StudentDto stuD: studentDtoList){
            System.out.println("stuD = " + stuD);
        }
    }
    /**
     * 조회 할 id를 입력받고 
     * id를 Repository로 전달
     * repository로 부터 id에 해당하는 학생정보를 리번받고
     * 학생 정보를 출력
     */
    public  void method5() {
        System.out.println("조회 할 id");
        Long id = sc.nextLong();
        StudentDto stuD = sr.method5(id);  // ??
        if (stuD != null) {
            // 조회결과 있음
            System.out.println("stuD = " + stuD);
        } else {
            //조회결과 없음
            System.out.println("요청정보 없음");
        }
    }
    public  void method6(){

    }
}
