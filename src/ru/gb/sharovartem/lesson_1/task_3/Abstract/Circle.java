package ru.gb.sharovartem.lesson_1.task_3.Abstract;

public class Circle extends Figure {
    float r = 0f;

    public Circle(float r){
        this.r = r;
        super.setType("Circle");
    }

    @Override
    public float perimeter(){
        float p = 0f;
        p = 3.14f * r;
        return p;
    }
}
