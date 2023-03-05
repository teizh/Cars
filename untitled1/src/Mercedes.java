final public class Mercedes extends Car {
    private String model;
    private int yearOfManufacture;
    private BodyType bodyType;

    public Mercedes(String name, String address, int year, Faculties faculty,
                    String name1, int yearManufacture, BodyType bodyType) {
        super(name, address, year, faculty);
        this.model = name1;
        this.yearOfManufacture = yearManufacture;
        this.bodyType = bodyType;
    }

    public String getModel() {
        return model;
    }

    public int getYearManufacture() {
        return yearOfManufacture;
    }

    public BodyType getBodyType() {
        return bodyType;
    }
}
