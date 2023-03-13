package HW02;

public class Chicken extends Bird {
    public Chicken(double height, double weight, String eyesColor, int flightHeight) {
        super(height, weight, eyesColor, flightHeight);
    }

    @Override
    public void makeSound() {
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