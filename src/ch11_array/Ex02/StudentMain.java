package ch11_array.Ex02;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        // Student 클래스 객체를 담기위한 List
        // studentList

        List<Student> studentList= new ArrayList<>();

//        studentList.add("Student 객체");
        // Student 객체
            Student stu = new Student(1L,"학생1","20231111","현대문학","01055554444");
            studentList.add(stu);
            Student stu2 = new Student(2L,"학생2","111112222","한국사","01033334444");
            studentList.add(stu2);

        Student a = studentList.get(0);
        System.out.println(a.getStudentName());
        // studentList 1번 인덱스의 학과 출력
        System.out.println(studentList.get(1).getStudentMajor());

        for (int i =0; i <studentList.size(); i++){
            System.out.println(studentList.get(i));
            //학생의 이름만 따로 출력
            System.out.println(studentList.get(i).getStudentName());
        }
    for (Student stuv: studentList){
        // for (변수 : 컬렉션){   컬렉션 : List >>배열 >>Set , Map
                // 실행문;
        System.out.println("stuv = " + stuv);
        System.out.println(stuv.getStudentName());
    }
    for (Student st: studentList){
        System.out.println(st.getStudentNumber());
    }


    }
}
