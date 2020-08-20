public class LoopTatatura {

//  Чтение  символа  с  клавиатуры

  public static  void  main(String  args[])
            throws  java.io.IOException  {
        char  ch;
        System.out.print("Haжмитe  нужную  клавишу,  а  затем  клавишу  ENTER:  ");
        ch  =  (char)  System.in.read();  //  получить  сúвол
        System.out.println("Bы  нажали  клави " +  ch);
    }
}