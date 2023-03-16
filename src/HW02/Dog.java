package HW02;

import java.time.LocalDate;

public class Dog extends HomeAnimal implements PlaySound {
    String training;

    public Dog(double height, double weight, String eyesColor, String name, String breed, String vaccination, String color, String dateOfBirth, String training) {
        super(height, weight, eyesColor, name, breed, vaccination, color, dateOfBirth);
        this.training = training;
    }

    public String getTraining() {

        return training;
    }

    public void train(){
        System.out.println("Дрессировать");
    }

    public void playSound() {
        System.out.println("Гав-гав");
    }

    @Override
    public void animal() {

    }

    @Override
    public String toString() {
        return "Dog{" +
                "training='" + training + '\'' +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", vaccination='" + vaccination + '\'' +
                ", color='" + color + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", eyesColor='" + eyesColor + '\'' +
                '}';
    }
}
