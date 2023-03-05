public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        String[] commands = {"Лежать", "Сидеть"};
        Shelter shelter = new Shelter("Peace",
                "Lenina 1");

        Dog dog = new Dog("Rex", "Ovhcarka",
                commands, ColorEnum.BROWN, shelter);
        System.out.println(dog.getInfo());

        dog.makeVoice();
        dog.makeVoice("Гив гив");
        dog.makeVoice("Гув гув");

    }
}