package ch10_class.ex04;

public class Student {
    // 이름(studentName), 학번(studentNumber), 학과(studentMajor)
    String studentName;
    int studentNumber;
    String studentMajor;

    // 기본 생성자
    public Student() {
        System.out.println();

    }
        public Student(String studentName, int studentNumber, String studentMajor){
                this.studentName = studentName;
                this.studentMajor =studentMajor;
                this.studentNumber=studentNumber;
                // this 필드 값 = 매개변수 값
            System.out.println("studentName = " + studentName + ", studentNumber = " + studentNumber + ", studentMajor = " + studentMajor);


//    public Student(String sName, int studentNumber, String studentMajor){
//                System.out.println("studentName = " + sName + ", studentNumber = " + studentNumber + ", studentMajor = " + studentMajor);
//                studentName=sName;


            }
    //이름 , 학번, 학과를 매개변수로 하는 생성자

}
