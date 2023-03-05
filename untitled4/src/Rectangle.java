public class Rectangle extends Figure{
    private int sideA, sideB;

    public Rectangle(String name, int sideA, int sideB) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle(String name) {
        super(name);
    }

    @Override
    public int calculatePerimeter() {
        return (sideA+sideB)*2;
    }

    @Override
    public String getInfo() {
        return null;
    }

    @Override
    public void draw() {
        System.out.println("▬");
    }
}
