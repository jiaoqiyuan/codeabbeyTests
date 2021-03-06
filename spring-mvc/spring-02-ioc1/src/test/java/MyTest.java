import com.jony.pojo.User;
import com.jony.pojo.UserBak;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void testGetUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("user");
        UserBak userBak = (UserBak) context.getBean("userBak");
        System.out.println(user);
        System.out.println(userBak);
    }
}
