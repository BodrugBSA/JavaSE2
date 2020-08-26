package decan;
import profesor.Prof;

public class decanInformatica {
    String nume ="Cucu";
    String prenume="Ion";
    String grad="doctor";
    private double salar=12345;
    void afisNumeDec(){ //default
        System.out.println(nume+" "+prenume+" "+grad+" "+salar);
    }
    public double metSalar(double argSal){
        salar=salar+argSal;
        metSalar2(salar); //privat vazut local
        return salar;
    }
    private double metSalar2(double argSal) {
        salar = salar + argSal;
        return salar;
    }
    ////accesare profesor


}
