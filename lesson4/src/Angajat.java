public class Angajat {
    String nume="Ion";//property or member (in metoda este variabila
    long virsta=25;
    Angajat(){
        System.out.println("constructor");
    }
    public long damiVirsta(){
        //return virsta;
        System.out.println(virsta);
    }
    void setvirsta(long argumvirsta){
        virsta=argumvirsta;
    }
    void printeazavirstanume(){
        System.out.println("virsta"+virsta+" "+nume);
    }
}
