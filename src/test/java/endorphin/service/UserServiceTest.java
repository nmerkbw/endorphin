package endorphin.service;

import endorphin.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml",
        "classpath:dispatcher-servlet.xml"})
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void addUser() throws Exception {

        User user = new User();
        user.setUserName("皮皮磊");
        user.setPassword("123456");
        user.setUserSex("男");
        user.setUserEmail("pipilei@222.com");
        userService.addUser(user);
    }

    @Test
    public void updateUserByUserName() throws Exception {

        User user = new User();
        user.setUserName("皮皮磊");
        user.setUserSex("男");
        user.setUserEmail("pipilei22@222.com");
        userService.updateUserByUserName(user);
    }

    @Test
    public void getUserByUserName() throws Exception {

        String userName = "酱萌烦";
        User user = userService.getUserByUserName(userName);
        System.out.println(user);
    }

    @Test
    public void deleteUserByUserName() throws Exception {

        String userName = "酱萌烦";
        userService.deleteUserByUserName(userName);
    }

    @Test
    public void getPassword() throws Exception {

        String userName = "酱萌烦";
        String password = userService.getPassword(userName);
        System.out.println(password);
    }

    @Test
    public void getAllUser() throws Exception {

        List<User> users = userService.getAllUser();
        System.out.println(users);
    }

}