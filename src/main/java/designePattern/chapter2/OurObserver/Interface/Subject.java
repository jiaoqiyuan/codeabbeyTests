package designePattern.chapter2.OurObserver.Interface;

public interface Subject {
    public void registerObserver(Observer ob);
    public void removeObserver(Observer ob);
    public void notifyObservers();
}
