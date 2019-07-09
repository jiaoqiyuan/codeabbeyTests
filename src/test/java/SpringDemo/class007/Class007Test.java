package SpringDemo.class007;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Class007Test {
    @Test
    public void test() {
        //同一个上下文环境下单例模式下每种类Spring只会返回一个实例对象，多利模式下相反，会返回多个实例对象。
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_class007.xml");
//        Bean2 bean2_1 = context.getBean("bean2", Bean2.class);
//        System.out.println("bean2_1 = " + bean2_1);
//        Bean2 bean2_2 = context.getBean("bean2", Bean2.class);
//        System.out.println("bean2_2 = " + bean2_2);
//        Bean1 bean1 = context.getBean("bean1", Bean1.class);
//        System.out.println("bean1 = " + bean1);

        Bean1 bean1_1 = context.getBean("bean1", Bean1.class);
        System.out.println("bean1_1 = " + bean1_1);
        bean1_1.printBean2();
        bean1_1.printBean2();
        bean1_1.printBean2();

        Bean1 bean1_2= context.getBean("bean1", Bean1.class);
        System.out.println("bean1_2 = " + bean1_2);
        System.out.println("bean1_1 == bean1_2 : " + bean1_1.equals(bean1_2));

//        ApplicationContext context1 = new ClassPathXmlApplicationContext("spring_class007.xml");
//        Bean2 bean2_3 = context1.getBean("bean2", Bean2.class);
//        System.out.println("bean2_3 = " + bean2_3);
//        Bean2 bean2_4 = context1.getBean("bean2", Bean2.class);
//        System.out.println("bean2_4 = " + bean2_4);

    }
}
