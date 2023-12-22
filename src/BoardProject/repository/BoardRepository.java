package BoardProject.repository;

import BoardProject.common.Common;
import BoardProject.dto.BoardDTO;

import java.util.ArrayList;
import java.util.List;

public class BoardRepository {
    private static List<BoardDTO> boardDTOList = new ArrayList<>();

    public void write(BoardDTO boardDTO) {
        boardDTOList.add(boardDTO);
    }

    public List<BoardDTO> boardList() {
        return boardDTOList;
    }

    public BoardDTO findById(Long id) {
        BoardDTO result = null;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId())) {
              result = boardDTOList.get(i);
            }
        }return result;
    }

    public BoardDTO boardUpdate(Long id) {
        BoardDTO result = null;
        for (int i = 0; i <boardDTOList.size() ; i++) {
            if (Common.loginEmail.equals(boardDTOList.get(i).getBoardWriter()) && id.equals(boardDTOList.get(i).getId())){
                result = boardDTOList.get(i);
            }
        }return  result;
    }

    public void boardDelete(Long id) {
        for (int i = 0; i <boardDTOList.size() ; i++) {
               if (id.equals(boardDTOList.get(i).getId())){
                   boardDTOList.remove(i);
               }
        }
    }

    public List<BoardDTO> boardSearch(String search) {
        List<BoardDTO>searchList = new ArrayList<>();
        for (int i = 0; i <boardDTOList.size() ; i++) {
            if (boardDTOList.get(i).getBoardTitle().contains(search)){
                // boardDTOList.get(i).getBoardTitle()에 contains(search)가 속하면 
                searchList.add(boardDTOList.get(i));
                // 만들어둔 리스트에 포함된 리스트의 목록을  담는다
            }
        }return  searchList; // 검색어가 포함된 부분을 담은 리스트
    }
}


