public class NoBreak {
    public static void main(String[] args) {
        int i;
        for (i = 1; i < 3;i++ ) {
            switch (i) {
                case 0:
                    System.out.println("mai mic ca 1");
                case 1:
                    System.out.println("mai mic ca 2");
                case 2:
                    System.out.println("mai mic ca 3");
                default:
                    System.out.println("default");
            }
        }
        for (i = 1; i <= 3;i++ ) {
            System.out.println("i="+i);
            switch (i) {
                case 0:

                case 1:

                case 2:
                    System.out.println("mai mic ca1,2 sau 3");
                    break;
                case 3:
                    System.out.println("trei");
                    break;
            }
        }
    }
}
