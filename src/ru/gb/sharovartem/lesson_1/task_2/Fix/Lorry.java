package ru.gb.sharovartem.lesson_1.task_2.Fix;

//class Lorry extends Car, Moveable, Stopable{ наследоваться от интерфейса нельзя
class Lorry extends Car implements Moveable, Stopable{
    @Override //лучше указать аннотацию переопределения
    public void move(){
        System.out.println("Car is moving");
    }
    @Override //лучше указать аннотацию переопределения
    public void stop(){
        System.out.println("Car is stop");
    }

    @Override
    void open() { //переопределение абстрактного метода класса Car
        System.out.println("Open");
    }
}
