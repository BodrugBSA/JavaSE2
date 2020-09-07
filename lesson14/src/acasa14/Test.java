package acasa14;

public class Test {
    public static void main(String[] args) {
        clasaParinte cp1= new clasaParinte(44);
        clasaParinte cp2=new clasaParinte("Cucu","Ion");
        cp1.show();
        cp2.show();
        cp2.copii(2);
        Fiu f1=new Fiu("fiica");
        System.out.println(" fiul");
        f1.show(); // din Parinte
        f1.nume="Popa";
        f1.prenume="Ala";
        int c= f1.copii(1);
        f1.show();//apel din copil
        Fiu f2= new Fiu("nepot");
        f2.nume="Bodrug";
        f2.prenume="Viorel";
        System.out.println(cp2.nume+" are nepot "+f2.prenume);
        Fiu f3= new Fiu("nepot");
        System.out.println(f3.showGrad(" nepot"));//afiseaza datele parintelui parintelui
        // cu super.proprietate
        // apelul cu super constructoarele
        Fiu f4= new Fiu("nepot");

        System.out.println(f4.showGrad(" nepot"));
Fiica fi1=new Fiica("aa","bb",3," nepotica");
fi1.show();


    }

}
