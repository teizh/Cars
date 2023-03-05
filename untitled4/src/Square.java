public class Square extends Figure{
    private int sideA;

    public Square(String name, int sideA) {
        super(name);
        this.sideA = sideA;
    }

    @Override
    public int calculatePerimeter() {
        return sideA*4;
    }

    @Override
    public String getInfo() {
        return null;
    }

    @Override
    public void draw() {
        System.out.println("⬛");
    }
}
