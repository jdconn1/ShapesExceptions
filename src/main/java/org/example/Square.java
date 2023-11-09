package org.example;

public class Square extends Shape implements PerimeterCalculable{

    @Override
    float calculateArea(float num1, float num2) {
        float area = num1 * num2;
        return area;
    }

    @Override
    public float calculatePerimeter(float length, float width) {
        float perimeter = 2 * (length + width);
        return perimeter;
    }
}
