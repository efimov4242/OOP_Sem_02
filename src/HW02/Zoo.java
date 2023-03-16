package HW02;

import java.util.*;

public class Zoo {
    public static void main(String[] args) {
        printMenu();
        animals();
        choiceMenu();
    }

    //список всех животных
    public static ArrayList<Animal> animals = new ArrayList<>();

    public static void animals() {

        animals.add(new Cat(1, 5, "Yellow", "Tom", "Scotish", "21.08.2021",
                "White", "Green", "04.09.2019"));
        animals.add(new Dog(2, 10, "Red", "Jeff", "Jack Russel", "11.09.2022",
                "Orange", "01.02.2020", "Yes"));
        animals.add(new Chicken(2, 2, "Green"));
        animals.add(new Stork(1, 3, "Beige", 20));
        animals.add(new Tiger(2, 50, "Yellow", "Africa", "01.01.2021"));
        animals.add(new Wolf(3, 20, "Blue", "Australia", "02.03.2022", "Yes"));
    }

    public static void printAnimals() {
        if (!animals.isEmpty()) {
            int i = 1;
            for (Animal animal : animals) {
                System.out.println(i + " - " + animal);
                i++;
            }
        } else {
            System.out.println("Список животных пуст!");
        }
    }

    //список жтвотных зоопарка
    private static Set<Animal> animalsInZoo = new HashSet<>() {
    };

    public static void printAnimalsInZoo() {
        if (!animalsInZoo.isEmpty()) {
            System.out.println("В зоопарке: ");
            int i = 1;
            for (Animal animal : animalsInZoo) {
                System.out.println(i + " - " + animal);
                i++;
            }
        } else {
            System.out.println("Зоопарк пуст!");
        }
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
                addAnimal();
            } else if (menuNum == 2) {
                removeAnimal();
            } else if (menuNum == 3) {
                getAnimalInfo(2);
            } else if (menuNum == 4) {
                playAnimalSound();
            } else if (menuNum == 5) {
                getAllAnimalsInfo();
            } else if (menuNum == 6) {
                playAllAnimalsSound();
            } else if (menuNum == 7) {
                System.out.println("Ждем вас снова!");
                System.exit(0);
            }
            System.out.println();
            System.out.println("Введите цифру, соответствующую необходимому критерию:");
            menuNum = iScanner.nextInt();
        }
    }

    public static void addAnimal() {
        System.out.println("Введите индекс животного, чтобы добавить в зоопарк: ");
        printAnimals();
        Scanner isc = new Scanner(System.in);
        int nmb = isc.nextInt();
        for (int i = 0; i < animals.size(); i++) {
            if (i == nmb) {
                animalsInZoo.add(animals.get(i));
            }
        }
        printAnimalsInZoo();
    }

    public static void removeAnimal() {
        System.out.println("Введите номер животного, чтобы удалить из зоопарка: ");
        Scanner removeScanner = new Scanner(System.in);
        int index = removeScanner.nextInt();
        animalsInZoo.remove(animalsInZoo.toArray()[index-1]);
        printAnimalsInZoo();
    }

        public static void getAnimalInfo(int numb) {
            int i = 0;
            for (Animal animal : animalsInZoo) {
                if(i == numb) {
                    System.out.println(animal);
                }
                i++;
            }
        }

        public static void playAnimalSound() {
            System.out.println("Введите номер животного, чтобы узнать его звук: ");
            Scanner removeScanner = new Scanner(System.in);
            int index = removeScanner.nextInt();
            int i = 1;
            for(Animal animal : animalsInZoo) {
                animal.animal();
                if(animal instanceof PlaySound) {
                    if(index == i) {
                        ((PlaySound) animal).playSound();
                    }
                }
                i++;
            }
        }

        public static void getAllAnimalsInfo() {
            int i = 0;
            for (Animal animal : animalsInZoo) {
                System.out.println(i + " - " + animal);
                i++;
            }
            printAnimalsInZoo();
        }

        public static void playAllAnimalsSound () {
            for(Animal animal : animalsInZoo) {
                animal.animal();
                if(animal instanceof PlaySound) {
                    ((PlaySound) animal).playSound();
                }
            }
        }
}