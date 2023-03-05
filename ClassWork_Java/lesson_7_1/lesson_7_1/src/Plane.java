public class Plane extends Transport implements Flyable {
    @Override
    public void draw() {
        System.out.println("✈");
    }

    @Override
    public String draw3D(String material) {
        return "Самолет изображен в 3D из материала " + material;
    }

    @Override
    public void fly() {
        System.out.println("Самолет взлетел высоко в небо");
    }

    @Override
    public void drawWithColor() {
        System.out.println("\u001B[33m" + "Самолет" + "\u001B[0m");
    }
}
