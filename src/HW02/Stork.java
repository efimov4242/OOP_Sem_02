package HW02;

public class Stork extends Bird{
    public Stork(double height, double weight, String eyesColor, int flightHeight) {
        super(height, weight, eyesColor, flightHeight);
    }

    @Override
    public void makeSound() {
        System.out.println("Кркркркрк");
    }

    @Override
    public String toString() {
        return "Stork{" +
                "flightHeight=" + flightHeight +
                ", height=" + height +
                ", weight=" + weight +
                ", eyesColor='" + eyesColor + '\'' +
                '}';
    }
}
