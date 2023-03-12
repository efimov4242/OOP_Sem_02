package HW02;

public abstract class Animal {
    private double height;
    private double weight;
    private String eyesColor;

    public Animal(double height, double weight, String eyesColor) {
        this.height = height;
        this.weight = weight;
        this.eyesColor = eyesColor;
    }

    public void makeSound(){}

    public void printInfo(){}

    @Override
    public String toString() {
        return "Animal{" +
                "height=" + height +
                ", weight=" + weight +
                ", eyesColor='" + eyesColor + '\'' +
                '}';
    }
}
