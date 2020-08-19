public class ComparLogic {
    public static void main(String[] args) {

        System.out.println(100 > 10 && !(100 > 200));
        System.out.println(100 > 50 && 100 >= 100);
        System.out.println(100 > 10 || 100 > 200);
           int  i,  j;
            boolean  b1,  b2;
            i =  10;
            j  =  11;
            if(i  <  j)  System.out.println("i  <  j");
            if(i  <=  j)  System.out.println("i  <=  j");
            if(i  !=  j)  System.out.println("i  !=  j");
            if(i == j)  System.out.println("Этo  не  будет  выполнено");
            if(i  >=  j)  System.out.println("Этo  не  будет  выполнено");
            if(i  >  j)  System.out.println("Этo  не  будет  выполнено");
            b1  =  true;
            b2  =  false;
            if(b1  &  b2)  System.out.println("Этo  не  будет  в鷰олнено");
            if(!(b1  &  b2))  System.out.println("!(Ы  &  Ь2):  true");
            if(b1 | b2)  System.out.println("Ы  I  Ь2:  true");
            if(b1 ^b2)  System.out.println("Ьl  л  Ь2:  true");

        }
}

