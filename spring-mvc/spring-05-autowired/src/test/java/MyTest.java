import com.jony.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void testPeople() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people = (People) context.getBean("people");
        System.out.println(people);
        people.getCat().shout();
        people.getDog().shout();
    }
}
