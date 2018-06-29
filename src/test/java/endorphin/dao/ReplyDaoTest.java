package endorphin.dao;

import endorphin.domain.Reply;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ReplyDaoTest {

    @Resource
    private ReplyDao replyDao;

    @Test
    public void addReply() throws Exception {

        Reply reply = new Reply();
        reply.setReplyUserName("傻逼酱萌烦");
        reply.setReplyContent("傻逼酱萌烦啊");
        reply.setReplyPostId(2);
        Date date = new Date();
        long creatTime = date.getTime();
        reply.setReplyCreateTime(new Timestamp(creatTime));
        replyDao.addReply(reply);
    }

    @Test
    public void listReplyByPostId() throws Exception {

        int postId = 2;
        List<Reply> replies = replyDao.listReplyByPostId(postId);
        System.out.println(replies);
    }

    @Test
    public void deleteReplyById() throws Exception {

        int postId = 1;
        replyDao.deleteReplyById(postId);
    }

    @Test
    public void findReplyByReplyId() throws Exception {

        int replyId = 1;
        Reply reply = replyDao.findReplyByReplyId(replyId);
        System.out.println(reply);
    }

}