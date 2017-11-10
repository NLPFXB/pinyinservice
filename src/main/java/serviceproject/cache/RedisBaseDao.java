package serviceproject.cache;

import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class RedisBaseDao {

    @Resource(name="redisTemplate")
    protected ValueOperations<String, Object> valueOperations;

    public void addValue(String key, Object value){
        valueOperations.set(key, value);
    }

    public Object getValue(String key){
        return valueOperations.get(key);
    }
}