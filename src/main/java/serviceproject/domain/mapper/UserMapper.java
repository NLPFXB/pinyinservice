package serviceproject.domain.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import serviceproject.domain.user.User;

import java.util.List;
/**
 * 配置mapper类，完成数据到
 */
@Mapper
public interface UserMapper {
    @Select("select * from name")
    public List<User> selectAll();

    @Select("select * from name where id=#{id}" )
    public User findOneById(String id);
}
