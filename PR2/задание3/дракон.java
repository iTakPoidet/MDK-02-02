package ПР2.задание3;

import java.util.Random;
import java.util.Scanner;

public class дракон {
    Random rn = new Random();
    Scanner sc = new Scanner(System.in);
    private String color;

    дракон() {
        setColor();
    }

    public String getColor() {
        return color;
    }

    public void setColor() {
        int a = rn.nextInt(3) + 1;
        switch (a) {
            case 1:
                color = "Red";
                break;
            case 2:
                color = "Green";
                break;
            case 3:
                color = "Black";
                break;
        }
    }

    void vopros() {
        boolean f = false;
        if (getColor() == "Red") {
            int a = rn.nextInt(10);
            int b = rn.nextInt(10);
            do {
                System.out.println("Встретил красного дракона!");
                System.out.print(a + " - " + b + " = ");
                int c = sc.nextInt();
                int q = a - b;
                if (c == q) {
                    System.out.println("Правильно! победа!");
                    f = true;
                } else {
                    System.out.println("Попробуй снова");
                }
            } while (!f);
        }
        if (getColor() == "Green") {
            int a = rn.nextInt(10);
            int b = rn.nextInt(10);
            do {
                System.out.println("Встретил зеленого дракона!");
                System.out.print(a + " + " + b + " = ");
                int c = sc.nextInt();
                int q = a + b;
                if (c == q) {
                    System.out.println("Правильно! победа!");
                    f = true;
                } else {
                    System.out.println("Попробуй снова");
                }
            } while (!f);
        }
        if (getColor() == "Black") {
            int a = rn.nextInt(10);
            int b = rn.nextInt(10);
            do {
                System.out.println("Встретил черного дракона!");
                System.out.print(a + " * " + b + " = ");
                int c = sc.nextInt();
                int q = a * b;
                if (c == q) {
                    System.out.println("Правильно! победа!");
                    f = true;
                } else {
                    System.out.println("Попробуй снова");
                }
            } while (!f);
        }
    }
}
