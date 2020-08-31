package Primul;

public class One {
    void m1(){
        System.out.println("1.1 lucreaza m1");
    }
    void m2(){
        this.m1();
        System.out.println("lucreaza m2");
    }
}
