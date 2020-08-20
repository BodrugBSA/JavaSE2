public class Gess {
    //Игра в  угадывание  букв.

    public static void main(String args[])
            throws java.io.IOException {
        char ch, answer = 'S';
        /*System.out.println("Зaд虈aнa  буква  из  диапазона  A-Z");
        System.out.print("Пoпытaйтecь  ее  угадать:  ");
        ch = (char) System.in.read();  // получить  символ  с  клавиатуры
        System.out.println(ch);
        if (ch == answer) System.out.println("**  Правильно!  **");
        else {
            System.out.println("не угадали!!!");
            if (ch < answer) System.out.println("она ближе к началу от вашей");
            else System.out.println("она правее  вашей");
        }*/
        int x;
        for (x = 0; x < 6; x++) {
            if (x == 1)
                System.out.println("x  равно  единице");
            else if (x == 2)
                System.out.println("x  равно  дв蛨");
            else if (x == 3)
                System.out.println("x  равно  трем");
            else if (x == 4)
                System.out.println("x  равно четырем");
            else
                //  Условие,  выполняемое  по  умолчанию.
                System.out.println("Знaчeниe  х  находится  вне  диапазона  1  - 4");

        }
    }}
