package bonus;

public class ClasaProprPrivate {
    String nume="Cucu";
    private double codPasap=123456789;
    private float salar=10000f;
public  ClasaProprPrivate(String nume,double codPasap,float salar){
    this.nume=nume;
    this.codPasap=codPasap;
    this.salar=salar;
    System.out.println("numele:"+nume+" pasap "+codPasap+" salar "+salar);
}
public void setNume(String nume){
    this.nume=nume;  //fara this nu atribuie
    }
    public float getsalar(){
    return salar;
    }
}
