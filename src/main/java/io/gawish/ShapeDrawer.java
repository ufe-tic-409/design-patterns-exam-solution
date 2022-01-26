package io.gawish;

public class ShapeDrawer {
    private static ShapeDrawer instance;

    private ShapeDrawer() {}

    public static ShapeDrawer getInstance() {
        if (instance == null) {
            instance = new ShapeDrawer();
        }
        return instance;
    }

    public void draw(Shape s) {
        System.out.println("Drawing: ".concat(s.toString()));
    }
}
