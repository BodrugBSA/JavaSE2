package ExercitiiString;

public class Test {
    public static void main(String[] args) {
        String hannah = "Did Hannah see bees? Hannah did.";
        System.out.println(hannah + "1");
        System.out.println("lungime " + hannah.length());
        System.out.println(hannah.charAt(12));
        //////////////compare
        String str1 = "Я буду хорошим программистом!";
        String str2 = "Я буду хорошим программистом!";
        String str3 = "Я буду хорошим ";

        int result1 = str1.compareTo(str2);
        System.out.println(result1);

        result1 = str2.compareTo(str3);
        System.out.println(result1);

        result1 = str3.compareTo(str1);
        System.out.println(result1);
        ////////concat
        String s = "eu voi devenu un programator ";
        s = s.concat(" bun!!!");
        System.out.println(s);
        ///////endsWith
        String Str = new String("Добро пожаловать на ProgLang.su");
        boolean retVal;

        retVal = Str.endsWith("ProgLang.su");
        System.out.println("Возвращаемое значение: " + retVal);

        retVal = Str.endsWith("ProgLang");
        System.out.println("Возвращаемое значение: " + retVal);
        ///////////////////////substring
        Str="Was it a car or a cat I saw?".substring(9, 12);
        System.out.println(Str); ///car

    }
    }

