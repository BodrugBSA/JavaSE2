public class UnarMinus {
    public static void main(String[] args) {

      /*  int x1 = 999;

        //меняем знак первый раз
        x1 = -x1;
        System.out.println(x1);

        //меняем знак второй раз
        x1= -x1;
        System.out.println(x1);
        //increment
        int x = 999;
        x++;
        System.out.println(x);
        //decrement
        x--;
        System.out.println(x);*/
        int x=999;
        int y=++x;
        System.out.println(x);
        System.out.println(y);
        // 1) y=x, 2) x=x+1 => y=999  x=1000
        x+=y;  // x=x+y;
        System.out.println(x);
        int a=2;
        int b=++a; //a=11
        a=10;
        b=a++ +a+a-- ;
        System.out.println(a);
        System.out.println(b);


    }
}