package HW02;

public abstract class HomeAnimal extends Animal {
    String name;
    String breed;
    String vaccination;
    String color;
    String dateOfBirth;

    public HomeAnimal(double height, double weight, String eyesColor, String name, String breed, String vaccination, String color, String dateOfBirth) {
        super(height, weight, eyesColor);
        this.name = name;
        this.breed = breed;
        this.vaccination = vaccination;
        this.color = color;
        this.dateOfBirth = dateOfBirth;
    }

    public void showLask(){
        System.out.println("Я ласкаюсь!");
    }

    @Override
    public void makeSound() {
        System.out.println("Звук домашнего животного");;
    }

    @Override
    public String toString() {
        return "HomeAnimal{" +
                "name='" + name + '\'' +
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
