package ch10_class.ex03;

public class Student {
    // 필드 선언 // 지역변수
    String studentName;
    String studentMajor;
    String studentMobile;

    // 기본 생성자
    public Student() {
        System.out.println("Student 기본생성자");
        }
        public  Student(String studentName){
            System.out.println("name을 매개변수로 하는 생성자");
            System.out.println("studentName = " + studentName);
            //soutp 매개변수 // soutv 마지막 
        }
        // 매개변수가 2개 있는 생성자
    public  Student(String studentName, String studentMajor){
        System.out.println("studentName = " + studentName + ", studentMajor = " + studentMajor);
    }
    }