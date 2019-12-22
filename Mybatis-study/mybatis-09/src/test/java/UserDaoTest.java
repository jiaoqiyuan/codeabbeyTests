import com.jony.dao.UserMapper;
import com.jony.pojo.User;
import com.jony.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    public SqlSession sqlSession = null;
    public SqlSession sqlSession_bak = null;
    public UserMapper userMapper = null;
    public UserMapper userMapper_bak = null;
    @Before
    public void before() {
        // 获取session对象
        sqlSession = MybatisUtils.getSqlSessionFactory();
        // getMapper
        userMapper = sqlSession.getMapper(UserMapper.class);

        sqlSession_bak = MybatisUtils.getSqlSessionFactory();
        userMapper_bak = sqlSession_bak.getMapper(UserMapper.class);
    }

    @Test
    public void testGetUserById() {
        User user = userMapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();

        System.out.println("==========");

        User user2 = userMapper_bak.getUserById(1);
        System.out.println(user2);

        System.out.println(user == user2);
    }

    @After
    public void after() {
        if (sqlSession != null) {
            sqlSession.close();
        }
        if (sqlSession_bak != null) {
            sqlSession_bak.close();
        }
    }
}