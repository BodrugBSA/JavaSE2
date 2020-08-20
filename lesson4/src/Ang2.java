public class Ang2 {
    private String nume="Ion";//property or member (in metoda este variabila
    private long virsta=25;
    Angajat(){
        System.out.println("constructor");
    }
    long damiVirsta(){
        return virsta;
    }
    void setvirsta(long argumvirsta){
        virsta=argumvirsta;
    }
    void printeazavirstanume(){
        System.out.println("virsta"+virsta+" "+nume);
    }
}
}
