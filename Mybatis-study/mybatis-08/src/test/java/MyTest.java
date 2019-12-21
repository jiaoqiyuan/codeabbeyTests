import com.jony.dao.BlogMapper;
import com.jony.pojo.Blog;
import com.jony.utils.IdUtils;
import com.jony.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {
    public SqlSession sqlSession = null;
    public BlogMapper blogMapper = null;
    @Before
    public void before() {
        // 获取session对象
        sqlSession = MybatisUtils.getSqlSessionFactory();
        // getMapper
        blogMapper = sqlSession.getMapper(BlogMapper.class);
    }

    @Test
    public void testGetId() {
        System.out.println(IdUtils.getId());
    }

    @Test
    public void testAddBlog() {
        Blog blog = new Blog(IdUtils.getId(), "Mybatis如此简单", "xxx say", new Date(), 996);
        Blog blog1 = new Blog(IdUtils.getId(), "Mybatis如此简单1", "xxx say", new Date(), 997);
        Blog blog2 = new Blog(IdUtils.getId(), "Mybatis如此简单2", "xxx say", new Date(), 998);
        Blog blog3 = new Blog(IdUtils.getId(), "Mybatis如此简单3", "xxx say", new Date(), 999);
        blogMapper.addBlog(blog);
        blogMapper.addBlog(blog1);
        blogMapper.addBlog(blog2);
        blogMapper.addBlog(blog3);
        sqlSession.commit();
    }

    @Test
    public void testGetBlogIf() {
        Map map = new HashMap();
        map.put("title", "Mybatis如此简单");
        map.put("author", "xxx say");

        List<Blog> blogs = blogMapper.getBlogIf(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
    }

    @Test
    public void testGetBlogWhere() {
        Map map = new HashMap();
        map.put("title", "Mybatis如此简单");
        map.put("author", "xxx say");

        List<Blog> blogs = blogMapper.getBlogWhere(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
    }

    @Test
    public void testGetBlogChoose() {
        Map map = new HashMap();
        map.put("title", "Mybatis如此简单");
        map.put("author", "xxx say");

        List<Blog> blogs = blogMapper.getBlogChoose(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
    }

    @After
    public void after() {
        sqlSession.close();
    }
}
