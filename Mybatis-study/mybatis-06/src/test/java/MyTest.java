import com.jony.dao.StudentMapper;
import com.jony.dao.TeacherMapper;
import com.jony.pojo.Student;
import com.jony.pojo.Teacher;
import com.jony.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;


public class MyTest {
    public SqlSession sqlSession = null;
    public TeacherMapper teacherMapper = null;
    public StudentMapper studentMapper = null;
    @Before
    public void before() {
        // 获取session对象
        sqlSession = MybatisUtils.getSqlSessionFactory();
        // getMapper
        teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        studentMapper = sqlSession.getMapper(StudentMapper.class);
    }

    @Test
    public void testGetTeacher() {
        Teacher teacher = teacherMapper.getTeacher(1);
        System.out.println(teacher);
    }

    @Test
    public void testGetStudent() {
        List<Student> studentAndTeacher = studentMapper.getStudent();
        for (Student student : studentAndTeacher) {
            System.out.println(student);
        }
    }

    @Test
    public void getGetStudent2() {
        List<Student> student2 = studentMapper.getStudent2();
        for (Student student : student2) {
            System.out.println(student);
        }
    }

    @After
    public void after() {
        sqlSession.close();
    }
}