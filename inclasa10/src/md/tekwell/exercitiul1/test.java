package md.tekwell.exercitiul1;
import nivelul2.C;
public class test {
    public static void main(String[] args) {

        B ob2=new B();
        System.out.println("bbb");
        ob2.metB();
        System.out.println("ob2222");
        A ob3=new A();
        ob2.metC(ob3);
        System.out.println("ob3333");
        C c=new C();
       c.metC();



    }
}
