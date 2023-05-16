package animals;

public class Cat extends Animals {
    private String name;

    public Cat(String name) {
        this.name = name;
        Main.totalCats++;
    }

    public String getName() {
        return name;
    }

    @Override
    void run(int distance) {
        if (distance > Constants.MAX_DISTANCE_RUN_CAT) {
            System.out.println("Котик " + getName() + " більше чим " + Constants.MAX_DISTANCE_RUN_CAT + "м не біжить");
        } else System.out.println("Котик " + getName() + " пробіг на ізі )) " + distance + "м");
    }

    @Override
    void swim(int distance) {
        System.out.println(Constants.MAX_DISTANCE_SWIM_CAT);
    }

}
