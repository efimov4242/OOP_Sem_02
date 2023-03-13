package HW02;

public class Cat extends HomeAnimal {
    String woolColor;

    public Cat(double height, double weight, String eyesColor, String name, String breed, String vaccination, String color, String woolColor, String dateOfBirth) {
        super(height,
                weight,
                eyesColor,
                name,
                breed,
                vaccination,
                color, dateOfBirth);
        this.woolColor = woolColor;
    }

    public String getWool() {
        return woolColor;
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу-мяу");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "woolColor='" + woolColor + '\'' +
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
