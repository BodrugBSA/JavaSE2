package decan;

public class ClasaPublicPrivat {
    float nota = 7.5f;
    String nume = "Cucu";
    boolean prezenta = true;

    public String metAfis(ClasaPublicPrivat argIn) {
        String prez = "prezent";
        if (prezenta == false)
            prez = "absent";
        setNota2(9f);
        setNume2("Ion");
        String sir = nume + " " + nota + " " + prez;
        return sir;

    }

    private String setNume2(String argNume) { //set Nume da eroare
        return argNume;
    }

    private float setNota2(float argNota) {
        nota = argNota;
        return nota;
    }
}
