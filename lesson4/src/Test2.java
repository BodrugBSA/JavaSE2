public class Test2 {
    public static void main(String[] args) {
        Angajat angajat =new Angajat();
       // angajat.nume=" ";
        Angajat angajat2 =new Angajat();
        angajat.virsta=22;
            angajat2.virsta=33;
            angajat.damiVirsta();
            angajat2.damiVirsta();
            angajat=angajat2;
        System.out.println("dupa atribuire");
        angajat.damiVirsta();//33
        angajat2.damiVirsta();// 33
        angajat2.nume="Margareta";
        angajat.printeazavirstanume();
    }
}
