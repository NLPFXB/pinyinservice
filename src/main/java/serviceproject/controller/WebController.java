package serviceproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import serviceproject.cache.RedisBaseDao;
import serviceproject.domain.user.User;

@RestController
@EnableCaching
public class WebController {
    @Autowired
    private RedisBaseDao redisBaseDao;

    @RequestMapping("/redis/{id}")
//    @Cacheable(value = "user",key = "#id")
    public Object ControllerInitUserInfo(String id){
        User user = new User();
        user.setName("test");
        redisBaseDao.addValue(id,user);
        return user;
    }
}
