package BoardProject.service;

import BoardProject.common.Common;
import BoardProject.dto.BoardDTO;
import BoardProject.repository.BoardRepository;
import BoardProject.repository.CommentRepository;
import BoardProject.repository.MemberRepository;

import java.util.List;
import java.util.Scanner;

public class BoardService {
    MemberRepository memberRepository = new MemberRepository();
    CommentRepository commentRepository = new CommentRepository();
    BoardRepository boardRepository = new BoardRepository();
    Scanner sc = new Scanner(System.in);

    public void write() {
        System.out.println("글 제목을 입력하세요");
        String title = sc.nextLine();
        sc.nextLine();
        System.out.println("글 내용을 입력하세요");
        String contents = sc.nextLine();
        sc.nextLine();
        BoardDTO boardDTO = new BoardDTO(title, Common.loginEmail, contents);
        boardRepository.write(boardDTO);
        System.out.println("작성이 완료되었습니다");
    }


    public void boardList() {
        List<BoardDTO> boardDTOList = boardRepository.boardList();
        for (BoardDTO boardDTO : boardDTOList) {
            System.out.println("글 번호 : " + boardDTO.getId() + "작성시간 : " + boardDTO.getCreatedAt() + "작성자 : " + boardDTO.getBoardWriter() + "글 제목 : " + boardDTO.getBoardTitle() + "조회수 : " + boardDTO.getBoardHits());
        }
    }

    public void findById() {
        System.out.println("조회할 글의 번호를 작성하세요");
        Long id = sc.nextLong();
       BoardDTO boardDTO  = boardRepository.findById(id);
        System.out.println(boardDTO);
    }

    public void boardUpdate() {
        System.out.println("수정을 원하는 글의 번호를 입력하세요");
        Long id = sc.nextLong();
        BoardDTO boardDTO =  boardRepository.boardUpdate(id);
        System.out.println("글 제목");
        String title = sc.next();
        System.out.println("글 본문");
        String contents = sc.next();
        boardDTO.setBoardTitle(title);
        boardDTO.setBoardContents(contents);
        System.out.println("수정완");
    }

    public void boardDelete() {
        System.out.println("삭제를 원하는 글의 번호를 입력하세요");
        Long id = sc.nextLong();
        boardRepository.boardDelete(id);
    }

    public void boardSearch() {
        System.out.println("검색어를 입력하세요");
        String search = sc.next();
       List<BoardDTO>search1List =  boardRepository.boardSearch(search);
        if (!search1List.isEmpty()){  // List  0이 아닐 때
            System.out.println("검색 결과");
            System.out.println(search1List);
        }else {
            System.out.println("검색결과가 없습니다.");
        }
    }
}
