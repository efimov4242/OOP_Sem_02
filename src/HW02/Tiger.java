package HW02;

import java.time.LocalDate;

public class Tiger extends WildAnimal{
    public Tiger(double height, double weight, String eyesColor, String location, LocalDate dateOfLocation) {
        super(height, weight, eyesColor, location, dateOfLocation);
    }

    @Override
    public void makeSound() {
        System.out.println("Рррр");
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "location='" + location + '\'' +
                ", dateOfLocation=" + dateOfLocation +
                ", height=" + height +
                ", weight=" + weight +
                ", eyesColor='" + eyesColor + '\'' +
                '}';
    }
}
