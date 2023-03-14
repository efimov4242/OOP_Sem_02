package HW02;

import java.util.ArrayList;

public class Zoo {

    public static void main(String[] args) {

        }

    private static ArrayList<Animal> animals =new ArrayList<>();
    public static void addAnimal(Animal animal) {
        animals.add(animal);
    }



    Animal dog = new Dog(1, 5, "black", "Tom", "Dog", "21.08.2023",
            "White", "21.06.2022", "Yes");

}
