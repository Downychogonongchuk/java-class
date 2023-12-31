package ch11_array.ex04Book;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int selectNo = 0;
        // bookService 클래스 객체 선언
        BookService bookS = new BookService();

        while (run) {
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("1.도서등록 | 2.도서목록 | 3.도서조회(id) | 4.도서조회(제목) | 5.가격수정 | 6.도서삭제 | 0.종료");
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.print("선택> ");
            selectNo = sc.nextInt();
            if (selectNo == 1) {
                bookS.save();
            } else if (selectNo == 2) {
                bookS.findAll();
            } else if (selectNo == 3) {
                bookS.findById();
            } else if (selectNo == 4) {
                bookS.findByTitle();
            } else if (selectNo == 5) {
                bookS.update();
//            } else if (selectNo == 6) {
//                bookS.delete();
            } else if (selectNo == 0) {
                run = false;
            }
        }
    }
}
