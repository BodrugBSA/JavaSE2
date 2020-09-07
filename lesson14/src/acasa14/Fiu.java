package acasa14;

public class Fiu extends clasaParinte{
        String gradRudenie="Fiu";
        Fiu(String gradRudenie){
        this.gradRudenie=gradRudenie;
        }
       @Override
void show(){
        System.out.println("afisare cu super din parinte");
                super.show();
        System.out.println(nume+" "+prenume+ " are "+gradRudenie);
}
String showGrad(String gradRudenie){
                String s=gradRudenie +" este fiu/fiica pentru "+super.nume+" "+super.prenume;
        return s;

}



        }