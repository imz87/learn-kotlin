package ir.learn.app2;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Point p = new Point(10, 40);
        p.setLocation(p.getX() + 50, p.getY());
        System.out.println("p = " + p);
    }
}
