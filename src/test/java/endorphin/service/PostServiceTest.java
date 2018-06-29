package endorphin.service;

import endorphin.domain.Post;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml",
        "classpath:dispatcher-servlet.xml"})
public class PostServiceTest {

    @Autowired
    private PostService postService;

    @Test
    public void addPostByPost() throws Exception {

        Post post = new Post();
        post.setPostBoardId(3);
        post.setPostContent("上啊皮皮磊");
        post.setPostTitle("上啊皮皮磊");
        postService.addPostByPost(post);
    }

    @Test
    public void listPostContent() throws Exception {

        int postId = 4;
        Post post = postService.listPostContent(postId);
        System.out.println(post);
    }

    @Test
    public void listAllPost() throws Exception {

        List<Post> posts = postService.listAllPost();
        System.out.println(posts);
    }

    @Test
    public void deletePost() throws Exception {

        int postId = 3;
        postService.deletePost(postId);
    }

}