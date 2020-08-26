package bonus;

import bonus.ClasaProprPrivate;

public class TestPropPrivat {
    public static void main(String[] args) {
        ClasaProprPrivate pp = new ClasaProprPrivate("Popa", 12345, 12000);
        pp.setNume("Bostan");
        System.out.println("nume "+pp.nume+" salar "+pp.getsalar());

    }

}
