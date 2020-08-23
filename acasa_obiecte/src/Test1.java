public class Test1 {
    public static void main(String[] args) {
        Triunghi t1=new Triunghi();
        t1.a=5;
        t1.b=6;
        t1.c=18; // cu valoarea 8 exista
        int m=2;

        System.out.println("metoda1.1");
        System.out.println("perimetru initial: "+t1.marire(0));
        System.out.println("marire");
        System.out.println("perimetru marit cu: "+m+"este gal cu "+t1.marire(m));
        System.out.println("metoda1.2");
        t1.metString("Triunghighiul exista","Triunghi nu exista");
        System.out.println("metoda1.3");
        System.out.println(t1.met13());
        System.out.println("metoda1.4");
        System.out.println("numar in char ="+t1.met14('A'));
    }

}
