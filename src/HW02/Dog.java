package HW02;

public class Dog extends Pet{
    private String training;

    public String getTraining() {
        return training;
    }

    public void train(){
        System.out.println("Дрессировать");
    }
}
