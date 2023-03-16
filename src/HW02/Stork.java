package HW02;

public class Stork extends Bird implements PlaySound{
    public Stork(double height, double weight, String eyesColor, int flightHeight) {
        super(height, weight, eyesColor, flightHeight);
    }

    public void playSound() {

        System.out.println("Кркркркрк");
    }

    @Override
    public void animal() {

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
