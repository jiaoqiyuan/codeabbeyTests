package SpringDemo.class006;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Class006Test {
    @Test
    public void test() {
        //通过spring给属性赋值
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_class006.xml");
        Bean bean = context.getBean("bean", Bean.class);
        //通过构造方法注入bean
        System.out.println("bean.getAnotherBean() = " + bean.getAnotherBean());
        //通过set方法注入bean或注入式创建内部bean，参见spring_class006.xml
        System.out.println("bean.getAnotherBean1() = " + bean.getAnotherBean1());
        //通过类bean类型注入
        System.out.println("bean.getStringList() = " + bean.getStringList());
        System.out.println("bean.getStringSet() = " + bean.getStringSet());
        System.out.println("bean.getStringMap() = " + bean.getStringMap());
        System.out.println("bean.getAnotherBeanList() = " + bean.getAnotherBeanList());
        System.out.println("bean.getAnotherBeanSet() = " + bean.getAnotherBeanSet());
        System.out.println("bean.getProperties() = " + bean.getProperties());
        //null值注入
        System.out.println("bean.getAnotherBean2() = " + bean.getAnotherBean2());

    }
}
