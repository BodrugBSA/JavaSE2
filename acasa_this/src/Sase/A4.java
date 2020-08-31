package Sase;

public class A4 {
    int x;
    int y;

    public A4(A4 ob) {
        x = ob.x;
        y = ob.y;
    }

    public A4 getA() {
        return this;
    }

    A4() {

    }

    public String afis() {
        return " metoda afis ";
    }

}
