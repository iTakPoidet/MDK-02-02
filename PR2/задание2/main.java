package ПР2.задание2;

public class main {
    public static void main(String[] args) {
        Zebra z1 = new Zebra();
        Dolphin d1 = new Dolphin();
        z1.setName("Мартин");
        z1.setAge(5);
        d1.setName("Санёк");
        d1.setAge(2);

        System.out.println(z1.print());
        System.out.println(d1.print());
    }
}
