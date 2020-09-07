package acasa14;

public class clasaParinte {
    String nume = "Bodrug";
    String prenume = "Svetlana";
    private int ani = 33;

    clasaParinte(String nume) {
        this.nume = nume;
    }

    clasaParinte(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    clasaParinte(int ani) {
        this.ani = ani;
    }

    void show() {
        System.out.println("clasa Parinte " + nume + " " + prenume + " virsta " + ani);
    }

    int copii(int c) {
        System.out.println("numarul copiilor clasa Parinte" + c);
        return c;
    }

    clasaParinte() {

    }
}
