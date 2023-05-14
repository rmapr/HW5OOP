public class Car {

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }
    private void startElectricity(){
        System.out.println("startElectricity");
    }
    private void startCommand(){
        System.out.println("startCommand");
    }
    private void startFuelSystem(){
        System.out.println("startFuelSystem");
    }
}
class RunStart{
    public static void main(String[] args) {
        new Car().start();

        Employee employee = new Employee("Петров Петро Петрович", "директор", "petrov@ukr.net", "050 500 50 50", 40);
        System.out.println("\n" + employee);
    }
}