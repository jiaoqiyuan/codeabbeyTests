import com.jony.dao.UserMapper;
import com.jony.pojo.User;
import com.jony.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {
    public SqlSession sqlSession = null;
    public UserMapper userMapper = null;
    @Before
    public void before() {
        // 获取session对象
        sqlSession = MybatisUtils.getSqlSessionFactory();
        // getMapper
        userMapper = sqlSession.getMapper(UserMapper.class);
    }

    @Test
    public void testGetUsers() {
        List<User> users = userMapper.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @After
    public void after() {
        sqlSession.close();
    }
}