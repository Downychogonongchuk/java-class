package BoardProject.service;

import BoardProject.repository.BoardRepository;
import BoardProject.repository.CommentRepository;
import BoardProject.repository.MemberRepository;

public class BoardService {
    MemberRepository memberRepository = new MemberRepository();
    CommentRepository commentRepository = new CommentRepository();
    BoardRepository boardRepository  = new BoardRepository();


}
