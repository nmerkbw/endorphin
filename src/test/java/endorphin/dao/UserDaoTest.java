package endorphin.dao;

import endorphin.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserDaoTest {

    @Resource
    private UserDao userDao;
    @Test
    public void findUserByUserName() throws Exception {

        String userName = "酱萌烦";
        User user = userDao.findUserByUserName(userName);
        System.out.println(user);
    }

    @Test
    public void findUserByUserId() throws Exception {

        int userId = 2;
        User user = userDao.findUserByUserId(userId);
        System.out.println(user);
    }

    @Test
    public void addUser() throws Exception {

        User user = new User();
        user.setUserName("酱萌烦");
        user.setPassword("123456");
        user.setUserSex("男");
        user.setUserEmail("sbjmf@222.com");
        userDao.addUser(user);
    }

    @Test
    public void deleteUserByUserName() throws Exception {

        String userName = "酱萌烦";
        userDao.deleteUserByUserName(userName);
    }

    @Test
    public void updateUserByUserName() throws Exception {

        User user = new User();
        user.setUserName("酱萌烦");
        user.setUserSex("女");
        userDao.updateUserByUserName(user);
    }

    @Test
    public void getUserPasswordByUserName() throws Exception {

        String userName = "酱萌烦";
        String password = userDao.getUserPasswordByUserName(userName);
        System.out.println(password);
    }

    @Test
    public void getAllUserInfo() throws Exception {

        List<User> allUserInfo = userDao.getAllUserInfo();
        System.out.println(allUserInfo);
    }

}