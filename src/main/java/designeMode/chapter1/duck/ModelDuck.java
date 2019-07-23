package designeMode.chapter1.duck;

import designeMode.chapter1.flybehavior.FlyNoWay;
import designeMode.chapter1.quackbehavior.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a module duck.");
    }
}
