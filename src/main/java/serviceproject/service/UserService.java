package serviceproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import serviceproject.domain.mapper.UserMapper;
import serviceproject.domain.user.User;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User findone(){
        return userMapper.findOneById("1");
    }
}
