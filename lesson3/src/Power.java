public class Power {
    public static void main(String[] args) {
        int rezult;
        int e;
        int i;
        for(i=0;i<6;i++){
            rezult=1;
            e=i;
            while(e>0) {
                rezult*=2;
                e--;
            }
            System.out.println("2 la puterea "+i+"="+rezult);
        }

    }
}
