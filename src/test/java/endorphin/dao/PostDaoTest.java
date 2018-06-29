package endorphin.dao;

import endorphin.domain.Post;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.sql.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class PostDaoTest {

    @Resource
    private PostDao postDao;

    @Test
    public void addPost() throws Exception {

        Post post = new Post();
        int postId = 3;
        post.setPostBoardId(postId);
        post.setPostTitle("傻逼酱萌烦");
        post.setPostContent("傻逼酱萌烦");
        postDao.addPost(post);
    }

    @Test
    public void findPostByPostId() throws Exception {

        int postId = 1;
        Post post = postDao.findPostByPostId(postId);
        System.out.println(post);
    }


    @Test
    public void listAllPostInfo() throws Exception {

        List<Post> posts = postDao.listAllPostInfo();
        System.out.println(posts);
    }

    @Test
    public void deletePostById() throws Exception {

        int postId = 1;
        postDao.deletePostById(postId);
    }

    @Test
    public void updatePostByPost() throws Exception {

        Post post = new Post();
        postDao.updatePostByPost(post);
    }

}