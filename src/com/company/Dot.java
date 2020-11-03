package com.company;

public class Dot {
    int x;
    int y;

    Dot smesh(Dot hlop) {
        Dot rez = new Dot();
        rez.x = this.x + hlop.x;
        rez.y = this.y + hlop.y;
        return rez;
    }

    Dot center(Dot cent) {
        Dot rez = new Dot();
        rez.x = this.x > cent.x ? (this.x - cent.x) / 2:(cent.x - this.x) / 2;
        if (this.y > cent.y) {
            rez.y = (this.y - cent.y) / 2;
        }
        else {
            rez.y = (cent.y - this.y) / 2;
        }
        return rez;
    }

    @Override
    public String toString() {
        return "(" + x + ";" + y + ")";
    }
}
