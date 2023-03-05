public class Main {
    public static void main(String[] args) {
        Car.addition(6, 8);
        System.out.println(Car.counter);
        Car c1 = new Car(2020, "Civic");
        Car myCar = new Car(2019, "X7");
        System.out.println(Car.counter);
        myCar.makeSignal();

    }
}
