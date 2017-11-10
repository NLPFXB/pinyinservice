package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import serviceproject.Application;
import serviceproject.cache.RedisBaseDao;
import serviceproject.domain.user.User;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class TestRedis {
    @Autowired
    private RedisBaseDao redisBaseDao;

    @Test
    public void Test(){
//        redisBaseDao.addValue("1",new User());
//        redisBaseDao.addValue("2",new User());
//        User user = new User();
//        user.setName("ttt");
//        redisBaseDao.addValue("3",user);
        User res = (User)redisBaseDao.getValue("3");
        System.out.println(res.getName());
    }

}
