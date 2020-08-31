package Primul;

public class Human {

        int age;
        int weight;
        int height;

        Human(int age, int weight){
            this.age = age;
            this.weight = weight;
        }
        Human(int age, int weight, int height){
            //вы вызываете конструктор с двумя параметрами
            this(age, weight);
            //и добавляете недостающую переменную
            this.height = height;
        }
    }

