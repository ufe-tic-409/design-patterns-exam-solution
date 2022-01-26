package io.gawish;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape implements Element, Subject {
    private int width;
    private int height;

    private List<Observer> obervers = new ArrayList<>();

    public Shape(int width, int height) {
        this.width = width;
        this.height = height;

        this.obervers.add(ActivitySystem.getInstance());
        this.sendNotifications("SHAPE_CREATED");
    }

    public void draw() {
        ShapeDrawer.getInstance().draw(this);
    }

    @Override
    public String toString() {
        return "Shape{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setWidth(int width) {
        this.width = width;
        this.sendNotifications("SHAPE_SIZE_CHANGED");
    }

    public void setHeight(int height) {
        this.height = height;
        this.sendNotifications("SHAPE_SIZE_CHANGED");
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
