package Cinci;

public class ApelThis {
    void met1(){
        System.out.println("met1");
    }
    void met2(){
        System.out.println("met2");
        this.met1(); // nu este primul!!!!
        //System.out.println("met2");
        System.out.println(this);
    }
}
