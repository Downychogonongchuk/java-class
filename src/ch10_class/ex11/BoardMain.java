package ch10_class.ex11;

import java.util.Scanner;

public class BoardMain {
    public static void main(String[] args) {
        /*
        메뉴 
        1. 글작성 (매개변수 있는 생성자 이름)
            글 작성 정보는 스캐너로 받음. 글 번호도 같이 입력함 
          2. 글조회
            글번호를 입력받고 Board 클래스의 finById로 글번호를 넘긴다
            3. 종료
         */
        Scanner sc = new Scanner(System.in);
        Board board = new Board();

        while (true){
            System.out.println("-----------");
            System.out.println("1. 글작성 | 2. 글조회 | 3. 종료");
            System.out.println("-----------");
            System.out.println("번호 선택");
             int sel= sc.nextInt();
        if (sel==1){
            System.out.println("글 내용 입력");
            board.setBoardContent(sc.next());
            System.out.println("글 번호 입력");
            board.setId(sc.nextLong());
            System.out.println("제목 입력");
            board.setBoardTittle(sc.next());
            System.out.println("작성자");
            board.setBoardWriter(sc.next());
        }
        if (sel==2){
            System.out.println("글번호 입력");
            board.findById(sc.nextLong());
        }
        else if (sel==3){
            break;
        }
        }
    }

}
