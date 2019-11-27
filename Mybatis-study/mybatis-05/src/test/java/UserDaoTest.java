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

    @Test
    public void testGetUserById() {
        User user = userMapper.getUserById(1);
        System.out.println(user);
    }

    @Test
    public void testAddUser() {
        User user = new User(4, "Money", "12345677");
        userMapper.addUser(user);
        sqlSession.commit();
        testGetUsers();
    }

    @Test
    public void testDelUser() {
        userMapper.deleteUser(4);
        sqlSession.commit();
    }

    @After
    public void after() {
        sqlSession.close();
    }
}