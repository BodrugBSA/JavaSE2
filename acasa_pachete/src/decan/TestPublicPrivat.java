package decan;

public class TestPublicPrivat {
    public static void main(String[] args) {
        ClasaPublicPrivat pp =new ClasaPublicPrivat();
        pp.prezenta=false;
        System.out.println(pp.metAfis(pp));
        /* pp.setNota(7f); nu se recunoaste */
    }
}
