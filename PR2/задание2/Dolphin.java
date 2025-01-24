package ПР2.задание2;

public class Dolphin extends Animal{
    @Override
    String print() {
        return "Имя дельфина: " + getName() + " Возраст дельфина: " + getAge() + " Доп.информация: Рыба(Морское животное)";
    }
}
