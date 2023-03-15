package HW02;

import java.time.LocalDate;

public class Wolf extends WildAnimal{
    String isLeader;

    public Wolf(double height, double weight, String eyesColor, String location, String dateOfLocation, String isLeader) {
        super(height, weight, eyesColor, location, dateOfLocation);
        this.isLeader = isLeader;
    }

    public String getIsLeader() {

        return isLeader;
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "isLeader='" + isLeader + '\'' +
                ", location='" + location + '\'' +
                ", dateOfLocation=" + dateOfLocation +
                ", height=" + height +
                ", weight=" + weight +
                ", eyesColor='" + eyesColor + '\'' +
                '}';
    }

    @Override
    public void makeSound() {
        System.out.println("Ауууууу");
    }
}
