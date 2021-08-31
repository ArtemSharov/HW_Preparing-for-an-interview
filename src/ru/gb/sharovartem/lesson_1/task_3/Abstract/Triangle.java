package ru.gb.sharovartem.lesson_1.task_3.Abstract;

public class Triangle extends Figure {

    float a = 0f;
    float b = 0f;
    float c = 0f;

    public Triangle(float a, float b, float c){
        this.a = a;
        this.b = b;
        this.c = c;
        super.setType("Triangle");
    }

    @Override
    float perimeter() {
        float p = 0f;
        p = a + b + c;
        return p;
    }
}
