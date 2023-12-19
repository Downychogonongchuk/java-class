package ch_Package2.Board;

public class BoardDTO {
    private String boardTitle;
    private String boardWriter;
    private String boardPass;
    private Long id;
    private int count;

    public String getBoardTitle() {
        return boardTitle;
    }

    public void setBoardTitle(String boardTitle) {
        this.boardTitle = boardTitle;
    }

    public String getBoardWriter() {
        return boardWriter;
    }

    public void setBoardWriter(String boardWriter) {
        this.boardWriter = boardWriter;
    }

    public String getBoardPass() {
        return boardPass;
    }

    public void setBoardPass(String boardPass) {
        this.boardPass = boardPass;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private Long idVaule =1L;
    public BoardDTO(String boardTitle, String boardWriter, String boardPass) {
        this.id=idVaule++;
        this.boardTitle = boardTitle;
        this.boardWriter = boardWriter;
        this.boardPass = boardPass;
    }

    @Override
    public String toString() {
        return "BoardDTO{" +
                "boardTitle='" + boardTitle + '\'' +
                ", boardWriter='" + boardWriter + '\'' +
                ", boardPass='" + boardPass + '\'' +
                ", id=" + id +
                ", count=" + count +
                '}';
    }
}
