import com.jony.dao.StudentMapper07;
import com.jony.dao.TeacherMapper07;
import com.jony.pojo.Teacher07;
import com.jony.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;


public class MyTest {
    public SqlSession sqlSession = null;
    public TeacherMapper07 teacherMapper = null;
    public StudentMapper07 studentMapper = null;
    @Before
    public void before() {
        // 获取session对象
        sqlSession = MybatisUtils.getSqlSessionFactory();
        // getMapper
        teacherMapper = sqlSession.getMapper(TeacherMapper07.class);
        studentMapper = sqlSession.getMapper(StudentMapper07.class);
    }

    @Test
    public void testGetTeachers() {
        List<Teacher07> teachers = teacherMapper.getTeachers();
        System.out.println(teachers);
    }

    @Test
    public void testGetTeacher() {
        Teacher07 teacher = teacherMapper.getTeacher(1);
        System.out.println(teacher);
    }

    @After
    public void after() {
        sqlSession.close();
    }
}