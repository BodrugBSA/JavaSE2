package Sase;

public class RetObj {
    public static void main(String[] args) {
        A4 a1=new A4();
        a1.x=2;
        a1.y=3;
        A4 a2=new A4(a1);
        System.out.println(a2.getA());
        A4 a3 =new A4();
        a3.x=11;
        a3.y=22;
        System.out.println("a3="+a3.x);
        A4 a4=a3.getA(); //11 new A4()
        System.out.println("a4 "+a4.x);
        System.out.println(a4.afis());
        /////
        B b =new B(a3);
        System.out.println(b.obj);
        System.out.println(b.i);

    }
}
