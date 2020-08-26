package md.tekwell.exercitiul1;

public class B {
    public void metB(){
        A ob1=new A();
        ob1.metA();
        System.out.println("met din B");
    }
    public void metC(A argA){
        argA.metA();
        System.out.println("met c ");
    }
}
