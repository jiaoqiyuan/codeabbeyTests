package SpringDemo.IOC;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class IocContainer {
    private Map<String, Object> beans = new ConcurrentHashMap<String, Object>();

    public Object getBean(String beanId) {
        return beans.get(beanId);
    }

    public void setBeans(Class<?> clazz, String beanId, String... paramBeanIds) {
        Object[] paramValues = new Object[paramBeanIds.length];
        for (int i = 0; i < paramBeanIds.length; i++) {
            paramValues[i] = beans.get(paramBeanIds[i]);
        }

        Object bean = null;
        for (Constructor<?> constructor : clazz.getConstructors()) {
            try {
                bean = constructor.newInstance(paramValues);
            } catch (InstantiationException e) {
            } catch (IllegalAccessException e) {
            } catch (InvocationTargetException e) {
            }
        }
        if (bean == null) {
            throw new RuntimeException("找不到合适的构造方法！");
        }
        beans.put(beanId, bean);
    }
}
