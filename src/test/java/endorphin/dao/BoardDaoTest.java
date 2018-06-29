package endorphin.dao;

import endorphin.domain.Board;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class BoardDaoTest {

    @Resource
    private BoardDao boardDao;

    @Test
    public void addBoard() throws Exception {

        Board board = new Board();
        board.setBoardName("c++板块");
        board.setBoardDesc("这里是c++板块，欢迎前来讨论c++技术");
        boardDao.addBoard(board);
    }

    @Test
    public void listAllBoard() throws Exception {

        List<Board> boards = boardDao.listAllBoard();
        System.out.println(boards);
    }

    @Test
    public void listAllPostsOfBoard() throws Exception {

        int boardId = 3;
        Board board = boardDao.listAllPostsOfBoard(boardId);
        System.out.println(board);
    }

    @Test
    public void findBoardByBoardId() throws Exception {

        int boardId = 3;
        Board board = boardDao.findBoardByBoardId(boardId);
        System.out.println(board);
    }

    @Test
    public void findBoardByBoardName() throws Exception {

        String boardName = "傻逼酱萌烦";
        Board board = boardDao.findBoardByBoardName(boardName);
        System.out.println(board);
    }

    @Test
    public void updateBoardByBoard() throws Exception {

        Board board = new Board();
        boardDao.updateBoardByBoard(board);
    }

    @Test
    public void deleteBoardById() throws Exception {

        int boardId = 1;
        boardDao.deleteBoardById(boardId);
    }

}