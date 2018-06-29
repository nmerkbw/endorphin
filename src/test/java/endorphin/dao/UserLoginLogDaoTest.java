package endorphin.dao;

import endorphin.domain.UserLoginLog;
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
public class UserLoginLogDaoTest {

    @Resource
    private UserLoginLogDao userLoginLogDao;

    @Test
    public void listAllUserLoginLog() throws Exception {

        List<UserLoginLog> userLoginLogs = userLoginLogDao.listAllUserLoginLog();
        System.out.println(userLoginLogs);
    }

    @Test
    public void addUserLoginLog() throws Exception {

        UserLoginLog userLoginLog = new UserLoginLog();
        userLoginLog.setUserName("酱萌烦");
        userLoginLog.setLoginIp("192.168.1.153");
        long loginTime = new Date().getTime();
        userLoginLog.setLoginDateTime(new Timestamp(loginTime));
        userLoginLogDao.addUserLoginLog(userLoginLog);
    }

}