public class Circle extends Figure {
    private int radius;
    public Circle(String name, int radius) {
        super(name);
        this.radius=radius;
    }

    @Override
    public int calculatePerimeter() {
        return (int) (2 * Math.PI*radius);
    }

    @Override
    public String getInfo() {
        return null;
    }

    @Override
    public void draw() {

        System.out.println("⚪");
    }
}
