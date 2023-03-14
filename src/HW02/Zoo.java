package HW02;

import java.util.*;

public class Zoo {

    public static void main(String[] args) {
        printMenu();

        }

    static void printMenu() {
        System.out.println("Добро пожаловать в зоопарк!");

        Map<Integer, String> menu = new HashMap<>();
        menu.put(1, "Добавить животное в зоопарк");
        menu.put(2, "Убирать животное с номером i из зоопарка");
        menu.put(3, "Посмотреть информацию о животном с номером i");
        menu.put(4, "Заставить животное с номером i издать звук");
        menu.put(5, "Напечатать информацию о животных, которые есть на данный момент в зоопарке");
        menu.put(6, "Заставить всех животных, которые на данный момент есть в зоопарке, издать звук");
        menu.put(7, "Выход");
        System.out.println("Введите цифру, соответствующую необходимому критерию: ");
        for (Map.Entry entry : menu.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    static void choiceMenu() {
        Scanner iScanner = new Scanner(System.in);
        int menuNum = iScanner.nextInt();

        while (true) {
            if (menuNum == 1) {
                addAnimal(dog);
            } else if (menuNum == 2) {
                removeAnimal();
            } else if (menuNum == 3) {
                getAnimalInfo();
            } else if (menuNum == 4) {
                playSound();
            } else if (menuNum == 5) {
                System.out.println("Ждем вас снова!");
                System.exit(0);
            }
            System.out.println();
            System.out.println("Введите цифру, соответствующую необходимому критерию:");
            menuNum = iScanner.nextInt();
        }
    }
    private static ArrayList<Animal> animals =new ArrayList<>();


    public static void addAnimal(Animal animal) {
        System.out.println("Введите животное, чтобы добавить: ");
        Scanner addScanner = new Scanner(System.in);
        String a = addScanner.nextLine();

        animals.add(animal);
    }

    public static void removeAnimal(){
        System.out.println("Введите номер животного, чтобы удалить: ");
        Scanner removeScanner = new Scanner(System.in);
        int index = removeScanner.nextInt();
        for (int i = 0; i < animals.size(); i++) {
            if(i == index) {
                animals.remove(i);
            }
            removeScanner.close();
    }

    public static void getAnimalInfo(){
        System.out.println("Введите номер животного, чтобы показать информацию: ");
        Scanner infoScanner1 = new Scanner(System.in);
        int index1 = infoScanner1.nextInt();
        for (int i = 0; i < animals.size(); i++) {
            if(i == index) {
                System.out.println(animals.get(i));
        }
            infoScanner1.close();
        }
    }
    public static void playSound(int index){

        }

    }
    public static void getAnimals(){

    }
    public static void playSound(){

    }






    Animal dog = new Dog(1, 5, "black", "Tom", "Dog", "21.08.2023",
            "White", "21.06.2022", "Yes");

}
