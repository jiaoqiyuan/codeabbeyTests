package designePattern.chapter2.Interface;

import designePattern.chapter2.Interface.Observer;

public interface Subject {
    public void registerObserver(Observer ob);
    public void removeObserver(Observer ob);
    public void notifyObservers();
}
