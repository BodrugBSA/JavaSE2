public class Test {
    public static void main(String[] args) {
        Angajat angajat = new Angajat();// angajat referinta
    // instantiere cu new
        angajat.printeazavirstanume();
        long virsta=angajat.damiVirsta();
        long suma=virsta+100;
        System.out.println(suma);
        angajat.setvirsta(100l);//ctrl p
        angajat.printeazavirstanume();
        Angajat angajat2=new Angajat();
        angajat2.nume="Svetlana"; //atribuire valori proprietatilor
        angajat2.printeazavirstanume();
        angajat2.setvirsta(55);
        System.out.println(" virsta="+angajat.damiVirsta());
        System.out.println(angajat);//apeleaza toString h code
        if (angajat2.PensOrNo())
            System.out.println("este pensionar");
        else
            System.out.println("nu este pensionar");
    }
}
