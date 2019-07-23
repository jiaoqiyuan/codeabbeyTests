package designeMode.chapter1;

import designeMode.chapter1.duck.Duck;
import designeMode.chapter1.duck.MallardDuck;
import designeMode.chapter1.duck.ModelDuck;
import designeMode.chapter1.flybehavior.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
