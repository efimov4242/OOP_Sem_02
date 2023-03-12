package HW02;

import java.time.LocalDate;

public abstract class Pet extends Animal {
    private String name;
    private String breed;
    private String vaccination;
    private String color;
    private LocalDate dateOfBirth;

    public void showAffection(){
        System.out.println("Проявлять ласку");
    }

}
