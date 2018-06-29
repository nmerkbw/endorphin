package endorphin.service;

import endorphin.domain.Board;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml",
                        "classpath:dispatcher-servlet.xml"})
public class BoardServiceTest {

    @Autowired
    private BoardService boardService;

    @Test
    public void addBoardByBoard() throws Exception {

        Board board = new Board();
        board.setBoardName("车模");
        board.setBoardDesc("这里美女云集，欢迎前来养眼");
        boardService.addBoardByBoard(board);
    }

    @Test
    public void deleteBoardByBoardName() throws Exception {

        String boardName = "车模";
        boardService.deleteBoardByBoardName(boardName);
    }

    @Test
    public void listAllBoard() throws Exception {

        List<Board> boards = boardService.listAllBoard();
        System.out.println(boards);
    }

    @Test
    public void listAllPostOfBoard() throws Exception {

        int boardId = 3;
        Board board = boardService.listAllPostOfBoard(boardId);
        System.out.println(board);
    }

    @Test
    public void intoBoardByBoardId() throws Exception {

        int boardId = 3;
        Board board = boardService.intoBoardByBoardId(boardId);
        System.out.println(board);
    }

    @Test
    public void intoBoardByBoardName() throws Exception {

        String boardName = "车模";
        Board board = boardService.intoBoardByBoardName(boardName);
        System.out.println(board);
    }

    @Test
    public void updatePostNum() throws Exception {

        int boardId = 3;
        boardService.updatePostNum(boardId);
    }

    @Test
    public void updateBoardInfo() throws Exception {

        Board board = new Board();
        board.setBoardName("傻逼酱萌烦");
        boardService.updateBoardInfo(board);
    }

    @Test
    public void deleteBoard() throws Exception {

        int boardId = 3;
        boardService.deleteBoard(boardId);
    }

}