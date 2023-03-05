public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal() {
            @Override
            public void draw() {
                System.out.println("\uD83D\uDE3A");
            }

            @Override
            public String draw3D(String material) {
                return "Кошка изображена в 3D из материала " + material;
            }

            @Override
            public void makeVoice() {
                System.out.println("Мяу мяу");
            }
        };
        cat.makeVoice();

        Sparrow sparrow = new Sparrow();
        //Car car = new Car();
        //     a  = b
        Drawable[] drawables = {cat, sparrow, new Car(), new Snake(),
                new Dog(), new Plane()};
        for (int i = 0; i < drawables.length; i++) {
            drawAll(drawables[i]);
            if (drawables[i] instanceof Animal) {
                ((Animal) drawables[i]).makeVoice();
            }
            if (drawables[i] instanceof Flyable) {
                ((Flyable) drawables[i]).fly();
            }
        }

        int a = 8;
        System.out.println((double) a);
        double b = 3.8;
        System.out.println((int) b);
        System.out.println(Math.round(b));
    }

    public static void drawAll(Drawable drawable) {
        drawable.draw();
        System.out.println(drawable.draw3D("Plastic"));
        if (drawable instanceof ColorDrawable) {
            ((ColorDrawable) drawable).drawWithColor();
        }
    }
}
