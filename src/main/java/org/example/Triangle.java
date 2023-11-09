package org.example;

public class Triangle extends Shape implements PerimeterCalculable{

    @Override
    public float calculatePerimeter(float length, float width) {
        float perimeter = length + length + width;
        return perimeter;
    }

    @Override
    float calculateArea(float num1, float num2) {
        float area = (float) ((num1 * num2 * Math.sqrt(3))/4);
        return area;
    }
}