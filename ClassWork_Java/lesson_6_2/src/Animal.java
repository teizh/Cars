public class Animal {
    private int age;
    private WeaponType color;

    public Animal() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public WeaponType getColor() {
        return color;
    }

    public void setColor(WeaponType color) {
        this.color = color;
    }

    public String info() {
        return "Age: " + this.age + " color: "
                + this.color.getCode() + this.color + "\u001B[0m";
    }
}
