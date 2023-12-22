package BoardProject.repository;

import BoardProject.dto.CommentDTO;

import java.util.ArrayList;
import java.util.List;

public class CommentRepository {
    List<CommentDTO>commentDTOList = new ArrayList<>();

    public void commentSave(CommentDTO commentDTO) {
       commentDTOList.add(commentDTO);
    }

    public CommentDTO findById(Long id) {
        CommentDTO commentDTO =null;
        for (int i = 0; i <commentDTOList.size() ; i++) {
            if (id.equals(commentDTOList.get(i).getBoardId())){
          commentDTO = commentDTOList.get(i);
            }
        }return commentDTO;
    }
}
