package ch_Package2.Board;

import ch_Package.Board.BoardService;

import java.util.Scanner;

public class BoardMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BoardService boardService = new BoardService();

        while(true){
            System.out.println("-----------------------------");
            System.out.println("1.  | 2  . | 3.  | ... ");
            System.out.println("-----------------------------");
            int sel = sc.nextInt();
            if (sel==1){
                boardService.write();
            }if (sel==2){
                boardService.list();
            }if (sel==3){
                boardService.view();
            }if (sel==4){
                boardService.
            }if (sel==5){
                break;
            }

        }
    }
}
