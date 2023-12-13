package ch10_class.ex09;
/*
 필드 , getter / setter , 기본 생성자 , 매개변수 생성자, toString
 5개 필수요소
 이름 (studentName)
 학번(studentNumber)
 학과(studentMajor)
 전화번호(studentMobile)
 */

// 각 필드의 getter / setter 메서드
// 기본 생성자
// 모든 필드를 매개변수로 하는 생성자
// 필드에 저장된 값을 출력하는 print() 메서드
public class Student {
    private String studentName;
    private int studentNumber;
    private String studentMajor;
    private String studentMobile;


    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
    public int getStudentNumber(){
        return studentNumber;
    }
    public void setStudentMajor(String studentMajor){
        this.studentMajor = studentMajor;
    }
    public String getStudentMajor(){
        return studentMajor;
    }
    public void setStudentMobile(String studentMobile){
        this.studentMobile = studentMobile;
    }
    public String getStudentMobile() {
        return studentMobile;
    }

    public  Student(){
    }
    public  Student(String studentName, int studentNumber, String studentMajor, String studentMobile){
        System.out.println("studentName = " + studentName + ", studentNumber = " + studentNumber + ", studentMajor = " + studentMajor + ", studentMobile = " + studentMobile);
    }
    public void print(){
        System.out.println(getStudentName());
        System.out.println(getStudentNumber());
        System.out.println(getStudentMajor());
        System.out.println(getStudentMobile());
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentNumber=" + studentNumber +
                ", studentMajor='" + studentMajor + '\'' +
                ", studentMobile='" + studentMobile + '\'' +
                '}';
    }
}
