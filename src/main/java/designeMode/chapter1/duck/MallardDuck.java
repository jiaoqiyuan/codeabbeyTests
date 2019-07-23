package designeMode.chapter1.duck;

import designeMode.chapter1.flybehavior.FlyWithWings;
import designeMode.chapter1.quackbehavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck.");
    }
}
