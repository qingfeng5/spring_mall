package java.com.qingfeng.dao.test;

import com.qingfeng.dao.UserMapper;
import com.qingfeng.pojo.User;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.com.qingfeng.test.TestBase;
import java.sql.Timestamp;
import java.util.Date;

/**
 * @author 清风
 * @date 2020/2/20 10:29
 */
public class DaoTest  extends TestBase {

    @Autowired
    private UserMapper userMapper;

    @Ignore
    @Test
    public void testDao(){
        User a = new User();
        a.setPassword("111");
        a.setUsername("aaaaageely");
        a.setRole(0);
        a.setCreateTime(new Date());
        a.setUpdateTime(new Timestamp(System.currentTimeMillis()));
        System.out.println(userMapper.insert(a));
        System.out.println("aaaaaaaaaaaaaa");
    }

}
