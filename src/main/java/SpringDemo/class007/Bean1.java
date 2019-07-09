package SpringDemo.class007;

public abstract class Bean1 {
    //以属性方式注入Bean2
//    private Bean2 bean2;
//
//    public Bean2 getBean2() {
//        return bean2;
//    }
//
//    public void setBean2(Bean2 bean2) {
//        this.bean2 = bean2;
//    }

    //以方法形式
    protected abstract Bean2 createBean2();

    public void printBean2() {
        System.out.println("bean2 = " + createBean2());
    }

//    @Override
//    public String toString() {
//        return "Bean1{" +
//                "bean2=" + bean2 +
//                '}';
//    }
}
