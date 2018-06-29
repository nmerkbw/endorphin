package endorphin.service;

import endorphin.domain.UserLoginLog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Timestamp;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class LoginLogServiceTest {

    @Autowired
    private LoginLogService loginLogService;

    @Test
    public void listAllUserLoginLog() throws Exception {

        loginLogService.listAllUserLoginLog();
    }

    @Test
    public void addUserLoginLog() throws Exception {

        UserLoginLog userLoginLog = new UserLoginLog();
        userLoginLog.setUserName("皮皮磊");
        userLoginLog.setLoginIp("192.168.1.1");
        long time = new Date().getTime();
        userLoginLog.setLoginDateTime(new Timestamp(time));
        loginLogService.addUserLoginLog(userLoginLog);
    }

}