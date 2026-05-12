package inheritance;

public class Main {
    public static void main(String[] args) {
        Car fastCar = new Car();
        fastCar.setColor("Black");

        fastCar.setCargoCapacity(2);
        fastCar.setNumberOfPassengers(2);
        fastCar.setMaxSpeed(180);
        fastCar.setSpeed(130);

        System.out.println(fastCar.getSpeed());
    }
}
