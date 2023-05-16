package animals;

public class Main {

    static int totalAnimals;
    static int totalCats;
    static int totalDogs;

    public static void main(String[] args) {
        int distanceRun = 21;
        int distanceSwim = 8;
        Animals animals = new Animals();
//Run1
        Cat cat1 = new Cat("Мурка");
        Dog dog1 = new Dog("Рем");
        animals.run(distanceRun);
        cat1.run(distanceRun);
        dog1.run(distanceRun);
//Swim1
        animals.swim(distanceSwim);
        cat1.swim(distanceSwim);
        dog1.swim(distanceSwim);

        distanceRun = 550;
        distanceSwim = 12;
//Run2
        Cat cat2 = new Cat("Кокс");
        Dog dog2 = new Dog("Бакс");
        animals.run(distanceRun);
        cat2.run(distanceRun);
        dog2.run(distanceRun);
//Swim2
        animals.swim(distanceSwim);
        cat2.swim(distanceSwim);
        dog2.swim(distanceSwim);

        totalAnimals = totalCats + totalDogs;
        System.out.println("\nОб'єкт Котик - " + totalCats + ": " + cat1.getName() + ", " + cat2.getName());
        System.out.println("Об'єкт Пес - " + totalDogs + ": " + dog1.getName() + ", " + dog2.getName());
        System.out.println("Об'єктів Тварина - " + totalAnimals);
    }
}
