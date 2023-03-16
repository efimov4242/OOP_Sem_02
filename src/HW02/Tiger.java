package HW02;

import java.time.LocalDate;

public class Tiger extends WildAnimal implements PlaySound{
    public Tiger(double height, double weight, String eyesColor, String location, String dateOfLocation) {
        super(height, weight, eyesColor, location, dateOfLocation);
    }

    public void playSound() {
        System.out.println("Рррр");
    }

    @Override
    public void animal() {

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
