package ch10_class.ex02;

public class StudentMain {
    public static void main(String[] args) {
        // Student 클래스 객체 선언
        Student stu1 = new Student();
        //Student 클래스의 필드값에 값 저장하기
        stu1.studentName = "학생1";
        stu1.studentMajor = "컴퓨터 공학";
        stu1.studentMobile = "010-1111-1111";
        System.out.println("stu1.studentName = " + stu1.studentName);
        System.out.println("stu1.studentMajor = " + stu1.studentMajor);
        System.out.println("stu1.studentMobile = " + stu1.studentMobile);

        Student stu2 = new Student();
        //Student 클래스의 필드값에 값 저장하기
        stu2.studentName = "학생2";
        stu2.studentMajor = "경영학";
        stu2.studentMobile = "010-2222-2222";
        System.out.println("stu2 = " + stu2.studentName);
        System.out.println("stu2 = " + stu2.studentMajor);
        System.out.println("stu2.studentMobile = " + stu2.studentMobile);
    }
}
