package io.gawish;

import java.util.ArrayList;
import java.util.List;

public class Canvas {
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape s) {
        this.shapes.add(s);
    }

    public void draw() {
        for (Shape s : this.shapes) {
            s.draw();
        }
    }
}
