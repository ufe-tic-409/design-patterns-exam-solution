package io.gawish;

import java.util.ArrayList;
import java.util.List;

public class Group implements Element, Subject {
    public List<Element> elements = new ArrayList<>();

    private List<Observer> obervers = new ArrayList<>();

    public Group() {
        this.obervers.add(ActivitySystem.getInstance());
        this.sendNotifications("GROUP_CREATED");
    }

    public void addElement(Element e) {
        this.elements.add(e);
    }

    @Override
    public int getWidth() {
        int totalWidth = 0;
        for (Element e : elements) {
            totalWidth += e.getWidth();
        }
        return totalWidth;
    }

    @Override
    public int getHeight() {
        int maxHeight = 0;
        for (Element e : elements) {
            if (maxHeight < e.getHeight()) {
                maxHeight = e.getHeight();
            }
        }
        return maxHeight;
    }

    @Override
    public String toString() {
        return "Group{" +
                "width=" + getWidth() +
                ", height=" + getHeight() +
                '}';
    }

    public void addObserver(Observer observer) {
        this.obervers.add(observer);
    }

    public void sendNotifications(String notification) {
        for (Observer o : this.obervers) {
            o.onNotify(notification);
        }
    }
}
