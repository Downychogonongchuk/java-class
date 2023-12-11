package ch10_class.ex04;

public class StudentMain {
    public static void main(String[] args) {
            // 기본생성자로 student1 객체생성
        Student stu1 = new Student();
        // 매개변수 있는 생성자로 student2 객체 생성
        Student stu2 = new Student("김승경",184455,"멋짐");
    }
}
