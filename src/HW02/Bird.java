package HW02;

public abstract class Bird extends Animal {
    private int flightHeight;

    private Bird(double height, double weight, String eyesColor, int flightHeight) {
        super(height, weight, eyesColor);
        this.flightHeight = flightHeight;
    }

    public void fly(){
        System.out.println("Я лечу на " + flightHeight + " метрах!");
    }
}
