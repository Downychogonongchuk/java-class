package ch10_class.ex03;

public class StudentMain {
    public static void main(String[] args) {
            //기본 생성자로 객체 선언
        Student stu1 = new Student();
        
        // 매개변수가 있는 생성자로 객체 선언
        Student stu2 =  new Student("이름");
    }
    // 매개변수 2개 있는 생성자로 객체 선언
    Student stu3 = new Student("고구마", "개구리");
}
