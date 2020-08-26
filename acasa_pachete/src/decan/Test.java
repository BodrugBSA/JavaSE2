package decan;

import profesor.Prof;

public class Test {
    public static void main(String[] args) {
        decanInformatica dc= new decanInformatica();// din deca
        dc.afisNumeDec();
        // nu are acces dc.salar=11000000;
        dc.metSalar(1000);
        dc.afisNumeDec();// rezultatul majorarii este implicata si metoda privata
        //dc.metSalar2(100); nu are acces ca privat
        ////////
        Prof p =new Prof();
        //p.afishNumeProf(); nu are acces ca este din alt pachet vizibil numai in acel
        p.metSalar(11);

    }
}
