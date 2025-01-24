package ПР2.задание2;

public class Zebra extends Animal{
    public Zebra(){
        super();

    }
    @Override
    String print() {
        return "Имя зебры: " + getName() + " Возраст зебры: " + getAge() + " Доп.информация: Млекопитающие";
    }
}
