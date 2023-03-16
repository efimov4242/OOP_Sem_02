package HW02;

import java.time.LocalDate;

public class Wolf extends WildAnimal implements PlaySound{
    String isLeader;

    public Wolf(double height, double weight, String eyesColor, String location, String dateOfLocation, String isLeader) {
        super(height, weight, eyesColor, location, dateOfLocation);
        this.isLeader = isLeader;
    }

    public String getIsLeader() {

        return isLeader;
    }

    public void playSound() {

        System.out.println("Ауууууу");
    }

    @Override
    public void animal() {

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
}
