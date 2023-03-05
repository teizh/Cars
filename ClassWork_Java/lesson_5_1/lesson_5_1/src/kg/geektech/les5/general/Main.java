package kg.geektech.les5.general;

import kg.geektech.les5.objects.Car;
import kg.geektech.les5.objects.Owner;

public class Main {
    public static void main(String[] args) {

        int a = 7;

        Car myCar = new Car(2020, "Nissan Skyline", 3.5);
        System.out.println(myCar);
        System.out.println("Model: " + myCar.model + " year: " + myCar.year + " volume: " + myCar.volume);
        myCar.volume = 2.5;
        System.out.println("Model: " + myCar.model + " year: " + myCar.year + " volume: " + myCar.volume);

        Car friendsCar = new Car();
        friendsCar.model = "Toyota Camry";
        friendsCar.volume = 3.0;
        friendsCar.year = 2023;
        System.out.println("Model: " + friendsCar.model + " year: " + friendsCar.year + " volume: " + friendsCar.volume);

        Car bestCar = new Car(2012, "Ferrari");
        System.out.println("Model: " + bestCar.model + " year: " + bestCar.year + " volume: " + bestCar.volume);

        Car c1 = new Car(2000, "Lada", 2);
        System.out.println("Model: " + c1.model + " year: " + c1.year + " volume: " + c1.volume);
        bestCar.drive();
        bestCar.drive("Osh");
        myCar.drive("Talas");
        friendsCar.makeSignal(3);

        Owner myFriend = new Owner("Jonny", 3);
        friendsCar.carsOwner = myFriend;
        System.out.println(myFriend.getFullName());

        Owner me = new Owner("Aleksey", 15);
        myCar.carsOwner = me;
        // me.experience = -16;
        me.setExperience(-16);
        System.out.println(me.calculateStartYear());
    }
}
