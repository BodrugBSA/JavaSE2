package inheritance;

public class Fish extends Animal{
    Fish(String name){
        super(name);
    }

@Override
    public void move(){
        super.move();
        this.power -= 1;
    }
}