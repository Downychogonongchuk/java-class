package ch11_array.Ex02;
/**
 * 필드
 * 관리번호(id)
 * 이름(studentName)
 * 학번(studentNumber)
 * 학과(studentMajor)
 * 전화번호(studentMobile)
 *
 * getter/ setter
 * 생성자 2가지
 * toString
 *
 */
public class Student {
    private long id;
    private  String studentName;
    private  String studentNumber;
    private  String studentMajor;
    private  String studentMobile;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    public String getStudentMobile() {
        return studentMobile;
    }

    public void setStudentMobile(String studentMobile) {
        this.studentMobile = studentMobile;
    }

        public Student(){
        }
        public Student(long id, String studentName, String studentNumber, String studentMajor, String studentMobile){
            System.out.println("id = " + id + ", studentName = " + studentName + ", studentNumber = " + studentNumber + ", studentMajor = " + studentMajor + ", studentMobile = " + studentMobile);
        }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", studentNumber='" + studentNumber + '\'' +
                ", studentMajor='" + studentMajor + '\'' +
                ", studentMobile='" + studentMobile + '\'' +
                '}';
    }
}
