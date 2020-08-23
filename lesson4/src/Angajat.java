public class Angajat {
    String nume="Ion";//property or member (in metoda este variabila
    long virsta=25;
    Angajat(){
        System.out.println("constructor");
    }
    public long damiVirsta(){
        System.out.println(virsta);
        virsta++;
        return virsta;

    }
    public boolean PensOrNo(){
        if (virsta>60) return true;
        else return false;
    }
    void setvirsta(long argumvirsta){

        virsta=argumvirsta;
        return; // se poate omite
    }
    void printeazavirstanume(){
        System.out.println("virsta"+virsta+" "+nume);
    }
}
