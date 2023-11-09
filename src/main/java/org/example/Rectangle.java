package org.example;

public class Rectangle extends Shape implements PerimeterCalculable{

    @Override
    public float calculatePerimeter(float length, float width) {
        float perimeter = 2 * (length + width);
        return perimeter;
    }

    @Override
    float calculateArea(float length, float width) {
        float area = length * width;
        return area;
    }
}
