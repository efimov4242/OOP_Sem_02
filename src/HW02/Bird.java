package HW02;

public abstract class Bird extends Animal {
    protected int flightHeight;

    protected Bird(double height, double weight, String eyesColor) {
        super(height, weight, eyesColor);
    }

    protected Bird(double height, double weight, String eyesColor, int flightHeight) {
        super(height, weight, eyesColor);
        this.flightHeight = flightHeight;
    }


    @Override
    public void makeSound() {
        System.out.println("Звук какой-то птицы");
    }

    public void fly(){
        System.out.println("Я лечу на " + flightHeight + " метрах!");
    }

    @Override
    public String toString() {
        return "Bird{" +
                "flightHeight=" + flightHeight +
                ", height=" + height +
                ", weight=" + weight +
                ", eyesColor='" + eyesColor + '\'' +
                '}';
    }
}
