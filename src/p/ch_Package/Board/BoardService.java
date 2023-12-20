package p.ch_Package.Board;

import java.util.List;
import java.util.Scanner;

public class BoardService {
    BoardRepository boardRepository = new BoardRepository();
    Scanner scanner = new Scanner(System.in);
    public void save() {
        System.out.print("제목: ");
        String boardTitle = scanner.next();
        System.out.print("작성자: ");
        String boardWriter = scanner.next();
        System.out.print("내용: ");
        String boardContents = scanner.next();
        System.out.print("비밀번호: ");
        String boardPass = scanner.next();
        BoardDTO boardDTO = new BoardDTO(boardTitle, boardWriter, boardContents, boardPass);
        boolean result = boardRepository.save(boardDTO);
        if (result) {
            System.out.println("등록 성공");
        } else {
            System.out.println("등록 실패");
        }
    }

    public void findByAll() {
        List<BoardDTO> boardDTOList = boardRepository.findByAll();
        for (BoardDTO boardDTO : boardDTOList) {   // #
            System.out.println(boardDTO + "\t");
            System.out.println(boardDTO.getCreatedAt());
//        }  listPrint(boardDTOList);
        }
    }
    public void findById() {
        System.out.print("조회할 글번호: ");
        Long findId = scanner.nextLong();
        // 1. 조회수를 1증가
        //2. 상세내용 가져옴


        BoardDTO result = boardRepository.findById(findId);
        if (result != null) {
            System.out.println("조회한 글번호의 글이 있습니다.");
            System.out.println();
//            boardRepository.count(findId);
            System.out.println(result);
        } else {
            System.out.println("조회 결과 글번호에 대한 글이 없습니다.");
        }
    }

    public void update() {
        System.out.print("수정할 글번호: ");
        Long updateId = scanner.nextLong();
        BoardDTO result = boardRepository.findById(updateId);
        if (result != null) {
            System.out.print("비밀번호: ");
            String boardPass = scanner.next();
            boolean passResult = boardRepository.findByPass(updateId, boardPass);
            if(passResult) {
                System.out.print("수정할 제목: ");
                String boardTitle = scanner.next();
                System.out.print("수정할 내용: ");
                String boardContents = scanner.next();
                result = boardRepository.update(updateId, boardPass, boardTitle, boardContents);
                if(result != null) {
                    System.out.println("수정에 성공하셨습니다.");
                    System.out.println(result);
                } else {
                    System.out.println("수정에 실패하셨습니다.");
                }
            } else {
                System.out.println("비밀번호가 틀렸습니다.");
            }
        } else {
            System.out.println("수정할 글 번호를 찾지 못했습니다.");
        }
    }

    public void delete() {
        System.out.print("삭제할 글번호: ");
        Long deleteId = scanner.nextLong();
        BoardDTO result = boardRepository.findById(deleteId);
        if (result != null) {
            System.out.print("비밀번호: ");
            String boardPass = scanner.next();
            boolean passResult = boardRepository.findByPass(deleteId, boardPass);
            if(passResult) {
                boolean deleteResult = boardRepository.delete(deleteId, boardPass);
                if(deleteResult) {
                    System.out.println("삭제에 성공하셨습니다.");
                } else {
                    System.out.println("삭제에 실패하셨습니다.");
                }
            } else {
                System.out.println("비밀번호가 틀렸습니다.");
            }
        } else {
            System.out.println("삭제할 글 번호를 찾지 못했습니다.");
        }
    }

    public void search() {
        System.out.print("검색할 제목: ");
        String boardTitle = scanner.next();
        List<BoardDTO> result = boardRepository.search(boardTitle);
        if(result != null) {
            System.out.println("검색에 성공하셨습니다.");
            for(BoardDTO boardDTO: result) {
                System.out.println(boardDTO);
            }    // 출력 전용 메서드로 검색결과 리스트를 넘겨줌
        } else {
            System.out.println("검색에 실패하셨습니다.");
        }
    }
    //Refactoring (리팩터링)
    // 목록 출력 전용 메서드
    //findAll , search 메서드로 부터 list 데이터를 전달 받아서 출력을 하는 메서드
    private void ListPrint(List<BoardDTO>boardDTOList){

    }


    public void write() {
        System.out.println("입력");
    }


    public void testData() {  
        for (int i = 0; i <11 ; i++) {  // 1~10 번 까지 반복 데이터 생성
            BoardDTO boardDTO = new BoardDTO("Title"+i,"writer"+i,"1234","contents"+i);
            boardRepository.save(boardDTO);
        }
    }
}