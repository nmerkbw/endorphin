package endorphin.service;

import endorphin.domain.Reply;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml",
        "classpath:dispatcher-servlet.xml"})
public class ReplyServiceTest {

    @Autowired
    private ReplyService replyService;

    @Test
    public void addReply() throws Exception {

        Reply reply = new Reply();
        reply.setReplyContent("傻逼酱萌烦啊");
        reply.setReplyUserName("傻逼酱萌烦");
        reply.setReplyPostId(3);
        replyService.addReply(reply);
    }

    @Test
    public void listReplyByPostId() throws Exception {

        int postId = 3;
        List<Reply> replies = replyService.listReplyByPostId(postId);
        System.out.println(replies);
    }

    @Test
    public void deleteReply() throws Exception {

        int replyId = 4;
        replyService.deleteReply(replyId);
    }

}