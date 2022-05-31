package com.company;

public class One {
    int a;
    int b;
    int c;

    public One(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("Перший кут: " + a +  ", Другий кут: " + b + ", Третій кут: " + c + ";");
    }

    public void Area(int a, int b , int c) {
        double p1 = (a + b + c) / 2.0;
        System.out.println("ПЛОЩА ТРИКУТНИКА: "+ (int)Math.sqrt(p1 * (p1 - a) * (p1 - b) * (p1 - c)));
    }
}
