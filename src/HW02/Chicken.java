package HW02;

public class Chicken extends Bird implements PlaySound{
    @Override
    public void animal() {

    }

    public Chicken(double height, double weight, String eyesColor) {

        super(height, weight, eyesColor);
    }

    public void playSound() {

        System.out.println("Цып-цып");
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "flightHeight=" + flightHeight +
                ", height=" + height +
                ", weight=" + weight +
                ", eyesColor='" + eyesColor + '\'' +
                '}';
    }
}