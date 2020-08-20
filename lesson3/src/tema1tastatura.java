public class tema1tastatura {

    public static void main(String args[])
            throws java.io.IOException {
        char ch, answer = 'S';
       ch=1;
       int i=1;
        //System.out.println(ch);
        while (ch !=46){
            System.out.println("Зaдана  буква  из  диапазона  A-Z");
            System.out.print("Пoпытaйтecь  ее  угадать до точки:  ");
            ch = (char) System.in.read();  // получить  символ  с  клавиатуры
            if (ch == answer) System.out.println("**  Правильно!  **");
            else {
                System.out.println("не угадали!!!");
                if (ch < answer) System.out.println("она ближе к началу от вашей");
                else System.out.println("она правее  вашей");
            }
            i++;
            System.out.println("i="+i);
        }
        }
    }

