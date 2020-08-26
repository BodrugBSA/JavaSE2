package profesor;

public class Prof {
    String nume ="D-l Popa";
    String prenume="Petru";
    String grad="doctor habilitat";
    double salar=1000;
    void afisNumeProf(){ //default vizibil numai in pachetul curent
        System.out.println("profesor "+nume+" "+prenume+" "+grad+" "+salar+metPublicatii(10));
    }
    public double metSalar(double argSal){
        salar=salar+argSal;
        return salar;
    }
    private double metPublicatii(int argPubl) {
        salar= salar+salar * argPubl/100;
        System.out.println("prof salar "+salar);
        return salar;
    }
}
