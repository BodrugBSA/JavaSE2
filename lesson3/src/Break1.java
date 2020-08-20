public class Break1 {
    public static void main(String[] args) {
      /*  done:
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                for (int k=0;k<10;k++){
                    System.out.println("k=:"+k);
                    if(k==5) break done;
                }System.out.println("dupa ciclu k");
            }System.out.println("dupa ciclu j");

        }  System.out.println("dupa ciclu i");
    }*/
int i;
for (i=1;i<4;i++){
    one:{
    two:{
        three:{
            System.out.println("\ni egal "+i);
        if (i==1) break one;
            if (i==2) break two;
            if (i==3) break three;
            //nu se executa
            System.out.println("nu se exec");
        }
        System.out.println("dupa blocul 3");
    } System.out.println("dupa blocul doi");
    } System.out.println("dupa blocul 1 ");
} System.out.println("dupa for i");

}


}
