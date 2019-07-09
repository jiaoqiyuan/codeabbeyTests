package SpringDemo.IOC;

import org.junit.Before;
import org.junit.Test;

public class SpringIocTest {
    private IocContainer iocContainer = new IocContainer();

    @Before
    public void before(){
        iocContainer.setBeans(Audi.class, "audi");
        iocContainer.setBeans(Buick.class, "buick");
        iocContainer.setBeans(Zhangsan.class, "zhangsan", "audi");
        iocContainer.setBeans(Lisi.class, "lisi", "buick");
    }

    @Test
    public void test() {
        Human zhangsan = (Human) iocContainer.getBean("zhangsan");
        zhangsan.goHome();
        Human lisi = (Human) iocContainer.getBean("lisi");
        lisi.goHome();
    }

}
