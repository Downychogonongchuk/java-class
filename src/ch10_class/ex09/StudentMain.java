package ch10_class.ex09;

public class StudentMain {
    public StudentMain() {
    }

    public static void main(String[] args) {
        // 기본 생성자로 Student 클래스 객체 만들고 setter 를 이용하여  필드값 채우기
        // 모든 필드를 매개변수로 하는 생성자로 Student 클래스 객체 만들기
        // 각각의 객체에서 print 메서드 호출하여 필드값 출력

        Student stu = new Student();

        stu.setStudentName("김승경");
        stu.setStudentNumber(111333);
        stu.setStudentMajor("커피");
        stu.setStudentMobile("333666");

        Student stu2 = new Student("종소리",110022,"울려라","종소리울려");

        stu.print();
    }
}
