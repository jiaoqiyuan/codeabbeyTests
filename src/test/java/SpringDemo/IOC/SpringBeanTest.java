package SpringDemo.IOC;

import SpringDemo.Bean.Bean1;
import SpringDemo.Bean.Bean2;
import SpringDemo.Bean.Bean3;
import SpringDemo.Bean.Bean3Factory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Bean bean = context.getBean("bean", Bean.class);
        System.out.println("bean: " + bean);
    }

    @Test

    public void Bean1Test() {
        ClassPathXmlApplicationContext contex = new ClassPathXmlApplicationContext("spring.xml");
        /**
         * 通过构造方法实例化Bean1
         */
        Bean1 bean1 = contex.getBean("bean1", Bean1.class);
        System.out.println("bean1:" + bean1);

        /**
         * 通过静态方法实例化Bean2
         */
        Bean2 bean2 = contex.getBean("bean2", Bean2.class);
        System.out.println("bean2:" + bean2);

        /**
         * 通过实例方法实例化Bean3
         */
        Bean3 bean3 = contex.getBean("bean3", Bean3.class);
        System.out.println("Bean3:" + bean3);

        Bean1 bean1_1 = contex.getBean("bean1_1", Bean1.class);
        System.out.println("bean1_1 = " + bean1_1);
        Bean1 bean1_2 = contex.getBean("bean1_2", Bean1.class);
        System.out.println("bean1_2 = " + bean1_2);
        Bean1 bean1_3 = contex.getBean("bean1_3", Bean1.class);
        System.out.println("bean1_3 = " + bean1_3);
    }

}
