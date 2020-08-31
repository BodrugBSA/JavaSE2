package Primul;

public class Trei {
    int latura1; int latura2;
    int latura3; int latura4;


   public Trei(int latura1,int latura2){
        this.latura1= latura1;
        this.latura2= latura2;
       System.out.println(" 2 arg " +latura1+" "+latura2);

    }
    public  Trei(int latura1,int latura2,int latura3){
        this(latura1,latura2);
        this.latura3= latura3;

        System.out.println("3 arg "+latura3);


    }
    public Trei(int latura1,int latura2,int latura3,int latura4){
        this(latura1,latura2, latura3);
        this.latura4=latura4;
        System.out.println("4 arg "+latura4);
    }
}
