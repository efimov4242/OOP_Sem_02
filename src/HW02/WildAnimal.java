package HW02;

import java.time.LocalDate;

public abstract class WildAnimal extends Animal {
    String location;
    LocalDate dateOfLocation;

    public WildAnimal(double height, double weight, String eyesColor, String location, LocalDate dateOfLocation) {
        super(height, weight, eyesColor);
        this.location = location;
        this.dateOfLocation = dateOfLocation;
    }

    @Override
    public void makeSound() {
        System.out.println("Звук какого-то дикого животного");
    }
}
