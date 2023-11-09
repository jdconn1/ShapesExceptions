package org.example;

public class Circle extends Shape implements CircumferenceCalculable{

    @Override
    public float calculateCircumference(float radius) {
        float circumference = (float) (2 * Math.PI * radius);
        return circumference;
    }

    @Override
    float calculateArea(float num1, float num2) {
        float area = (float) (Math.PI * (num1 * num2));
        return area;
    }
}