package io.gawish;

public interface Subject {
    public void addObserver(Observer observer);
    public abstract void sendNotifications(String notification);
}
