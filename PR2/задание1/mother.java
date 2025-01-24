package ПР2.задание1;

public class mother {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void print(){
        System.out.println("Имя матери: " + getName());
    }
}
