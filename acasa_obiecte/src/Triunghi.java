public class Triunghi {
    int a, b, c;

    //1.1
    int marire(int x) {
        a += x;
        b += x;
        c += x;
        return a + b + c; //perimetru nou
    }
//1.2
    void metString(String x, String y) {
        if (((a + b) > c) &&((a + c) > b) && ((c + b) > a))
        System.out.println(x);
                else
        System.out.println(y);
    }
    //1.3
    String met13(){
        String s="triunghi cu laturile "+a+" "+b+" "+c;
        return  s;
    }
    //1.4
    int met14(char x){
        return (int)(x);
    }

}
