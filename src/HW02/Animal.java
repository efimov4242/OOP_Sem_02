package HW02;

public abstract class Animal {
    double height;
    double weight;
    String eyesColor;

    public abstract void animal();

    public Animal(double height, double weight, String eyesColor) {
        this.height = height;
        this.weight = weight;
        this.eyesColor = eyesColor;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "height=" + height +
                ", weight=" + weight +
                ", eyesColor='" + eyesColor + '\'' +
                '}';
    }
}
