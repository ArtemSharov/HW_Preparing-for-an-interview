package ru.gb.sharovartem.lesson_1.task_3.Abstract;

public abstract class Figure {
    private String type;

    abstract float perimeter();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
