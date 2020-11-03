package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dot koord1 = new Dot();
        System.out.println("Введите два числа: первое - координата точки по X, второе - координата точки по Y");
        koord1.x = sc.nextInt();
        koord1.y = sc.nextInt();
        System.out.println("(" + koord1.x + ";" + koord1.y + ")");
        System.out.println("А теперь укажите вторую пару чисел: на сколько сместить точку по X и по Y");
        Dot sm = new Dot();
        sm.x = sc.nextInt();
        sm.y = sc.nextInt();
        System.out.println(koord1.smesh(sm));
        koord1 = koord1.smesh(sm);
        System.out.println("Отлично, теперь введите вторую точку точно также, как Вы ввели первую");
        Dot koord2 = new Dot();
        koord2.x = sc.nextInt();
        koord2.y = sc.nextInt();
        System.out.println("(" + koord2.x + ";" + koord2.y + ")");
        System.out.println("На следующей строке координаты точки середины отрезка между введёнными Вами точками");
        System.out.println(koord1.center(koord2));
    }
}
