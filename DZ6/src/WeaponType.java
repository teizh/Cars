public enum WeaponType {

    ASSAULT("M16"),
    SMG("MP5"),
    PISTOLS("Glock19");
    private String model;

    WeaponType(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
