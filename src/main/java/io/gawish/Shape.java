package io.gawish;

public abstract class Shape {
    private int width;
    private int height;
    private ShapeDrawer shapeDrawer;

    public Shape(int width, int height, ShapeDrawer shapeDrawer) {
        this.width = width;
        this.height = height;
        this.shapeDrawer = shapeDrawer;
    }

    public void draw() {
        this.shapeDrawer.draw(this);
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
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
