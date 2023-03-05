public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Krug", 2);
        Triangle triangle = new Triangle("Treugolnik", 1, 2, 3);
        Square square = new Square("Kvadrat", 2);
        Rectangle rectangle = new Rectangle("Pryamougolnik", 1, 2);
        Car car = new Car("Mercedes");
        Bus bus = new Bus("Avtobus ");
        Drawable drawables[] = {circle, triangle, square, rectangle, bus, car};
        /*        Figure figures[] = {circle, triangle, square, rectangle, bus, car};*/


        for (int i = 0; i < drawables.length; i++) {

            if (drawables[i] instanceof Figure) {

                System.out.println(((Figure) drawables[i]).getName() + " Perimetr: " + ((Figure) drawables[i]).calculatePerimeter());

            }
            if (drawables[i] instanceof Transport) {
                System.out.println(((Transport) drawables[i]).getName());
            }
            drawables[i].draw();
        }


    }
}