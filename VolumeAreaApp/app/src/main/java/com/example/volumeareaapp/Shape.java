package com.example.volumeareaapp;

public class Shape {
    String ShapeName;
    int ShapeImage;

    public Shape(String shapeName, int shapeImage) {
        ShapeName = shapeName;
        ShapeImage = shapeImage;
    }

    public String getShapeName() {
        return ShapeName;
    }

    public void setShapeName(String shapeName) {
        ShapeName = shapeName;
    }

    public int getShapeImage() {
        return ShapeImage;
    }

    public void setShapeImage(int shapeImage) {
        ShapeImage = shapeImage;
    }
}
