package animals;

public class Dog extends Animals {
    private String name;

    public Dog(String name) {
        this.name = name;
        Main.totalDogs++;
    }

    public String getName() {
        return name;
    }

    @Override
    void run(int distance) {
        if (distance > Constants.MAX_DISTANCE_RUN_DOG) {
            System.out.println("Пес " + getName() + " більше чим " + Constants.MAX_DISTANCE_RUN_DOG + "м не біжить");
        } else System.out.println("Пес " + getName() + " пробіг " + distance + "м");
    }

    @Override
    void swim(int distance) {
        if (distance > Constants.MAX_DISTANCE_SWIM_DOG) {
            System.out.println("Пес " + getName() + " більше чим " + Constants.MAX_DISTANCE_SWIM_DOG + "м не пливе");
        } else System.out.println("Пес " + getName() + " пропливла " + distance + "м");
    }

}
