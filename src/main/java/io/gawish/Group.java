package io.gawish;

import java.util.ArrayList;
import java.util.List;

public class Group {
    List<Shape> elements = new ArrayList<>();

    public void addElement(Shape shape) {
        this.elements.add(shape);
    }

    public int getWidth() {
        // This doesn't work yet
        int totalWidth = 0;
        return totalWidth;
    }

    public int getHeight() {
        // This doesn't work yet
        int maxHeight = 0;
        return maxHeight;
    }

    @Override
    public String toString() {
        return "Group{" +
                "width=" + getWidth() +
                ", height=" + getHeight() +
                '}';
    }
}
