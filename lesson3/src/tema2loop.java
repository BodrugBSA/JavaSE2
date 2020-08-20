public class tema2loop {
    public static void main(String[] args) {
        int i=0;
        for (i=1;i<=10;i++){

            System.out.println(i);
            switch (i){
                case 1:
                    System.out.println("unu");break;
                case 2:
                    System.out.println("doi");break;
                case 3:
                    System.out.println("trei");break;
                case 4:
                    System.out.println("patru");break;
                case 5:
                    System.out.println("cinci");break;
                case 6:
                    System.out.println("sase");break;
                case 7:
                    System.out.println("sapte");
                    break;
                default:
                    System.out.println("mai mare ca 7");break;

            }
        }
    }
}
