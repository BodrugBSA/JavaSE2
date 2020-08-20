public class Gess {
    //Игра в  угадывание  букв.

    public static void main(String args[])
            throws java.io.IOException {
        char ch, answer = 'S';
        System.out.println("Зaд虈aнa  буква  из  диапазона  A-Z");
        System.out.print("Пoпытaйтecь  ее  угадать:  ");
        ch = (char) System.in.read();  // получить  символ  с  клавиатуры
        System.out.println(ch);
        if (ch == answer) System.out.println("**  Правильно!  **");
        else {
            System.out.println("не угадали!!!");
            if (ch<answer) System.out.println("она ближе к началу от вашей");
            else System.out.println("она правее  вашей");
        }
    }
}
