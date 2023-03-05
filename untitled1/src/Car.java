public class Car extends Vehicle {
    private int year;

    public String getInfo() {

        return "\nYear: " + year ;

    }





    public Car(String name, String address, int year) {
        super(name, address);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

}
