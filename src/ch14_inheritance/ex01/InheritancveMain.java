package ch14_inheritance.ex01;

public class InheritancveMain {
    public static void main(String[] args) {
            ParentClass parentClass = new ParentClass();
            ChildClass childClass = new ChildClass();
            // 부모 생성자 출력 > 상속받은 부모 생성자 출력 > 자식 생성자 출력 총 3

            parentClass.setName("이름1");
            parentClass.setAge(10);
            System.out.println("parentClass = " + parentClass); // to String

            parentClass.hello();

            childClass.setName("자식이름1");
            childClass.setAge(12);
            System.out.println(childClass);
            childClass.hello();

            // 좌변 : 부모타입의 객체 , 우변 : 자식클래스 생성자
            ParentClass parentClass1 = new ChildClass();
            // Child Class 생성자를  대입
            parentClass1.hello();
            parentClass1 = new ParentClass();
            // ParentClass 생성자를 대입
            parentClass1.hello();
            
            // 좌변 : 자식타입의 객체, 우변 : 부모클래스 생성자
            ChildClass childClass1 = (ChildClass) new ParentClass();
    }
}
