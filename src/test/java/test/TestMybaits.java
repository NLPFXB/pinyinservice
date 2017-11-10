package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import serviceproject.Application;
import serviceproject.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootApplication
@SpringApplicationConfiguration(Application.class)
public class TestMybaits {
    @Autowired
    private UserService userService;

    @Test
    public void test(){
        System.out.println(userService.findone().getName());;
    }
}
