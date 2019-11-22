package tests.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectSample {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class rc = Class.forName("tests.reflect.Robot");
        Robot robot = (Robot) rc.newInstance();
        System.out.println("Class name is: " + rc.getName());

        //获取私有函数
        Method getHello = rc.getDeclaredMethod("throwHello", String.class);
        getHello.setAccessible(true);
        Object str = getHello.invoke(robot, "Bob");
        System.out.println(str);

        //获取public函数
        Method sayHi = rc.getMethod("sayHi", String.class);
        sayHi.invoke(robot, "Welcome");

        //获取private字段
        Field name = rc.getDeclaredField("name");
        name.setAccessible(true);
        name.set(robot, "Alice");
        sayHi.invoke(robot, "I love you,");
    }
}
