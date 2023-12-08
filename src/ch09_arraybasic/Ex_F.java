package ch09_arraybasic;

import java.util.Scanner;

public class Ex_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] student = null;  // 학생 수 만큼의 배열
        int stuNum = sc.nextInt();


            while (true){
                System.out.println("---------------");
                System.out.println("1. 학생수 입력 | 2. 점수 입력 | 3.점수 목록 | 4. 분석 | 5.종료");
                System.out.println("---------------");
                int sel = sc.nextInt();
                if (sel==1){
                    System.out.println("학생수");
                    student=new int [stuNum];
//                    student=new int [sc.nextInt()];

                }else if(sel==2){
                    for (int i=0; i<student.length;  i++){
                        System.out.println("점수입력");
                        int score = sc.nextInt();
                        student[i] =score;
                    }

                }else if (sel==3){
                    for (int i=0; i<student.length; i++){
                        System.out.println(i+1+"학생 점수:  ");
                        System.out.println(student[i]);
                    }

                } else if (sel==4) {
                    System.out.println("분석");
                }else {
                    break;
                }
            }
    }
}
