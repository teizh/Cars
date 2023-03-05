package kg.geektech.les5.objects;

public class Car {
    public int year;
    public String model;
    public double volume;
    public Owner carsOwner;

    public Car(int theYear, String theModel, double theVolume) {
        this.year = theYear;
        this.model = theModel;
        this.volume = theVolume;
    }

    public Car(int theYear, String theModel, int theVolume) {
        this.year = theYear;
        this.model = theModel;
        this.volume = theVolume;
    }

    public Car(double theVolume, int theYear, String theModel) {
        this.year = theYear;
        this.model = theModel;
        this.volume = theVolume;
    }

    public Car(int year, String model) {
        this.year = year;
        this.model = model;
    }

    public Car() { // default constructor
    }

    public void drive() {
        System.out.println("kg.geektech.les5.objects.Car " + this.model + " is driving");
    }

    public void drive(String city) {
        System.out.println("kg.geektech.les5.objects.Car " + this.model + " is driving to " + city);
    }

    public void makeSignal(int number) {
        System.out.print("kg.geektech.les5.objects.Car " + this.model);
        for (int i = 0; i < number; i++) {
            System.out.print(" beeeeep");
        }
        System.out.println();
    }
}
