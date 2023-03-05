public class Main {
    public static void main(String[] args) {
        Shelter shelter = new Shelter("Peace", "Lenina 1");
        Shelter shelter2 = new Shelter("Paws", "KarlaMarksa 15");
        String[] commands = {"Lie", "Sit", "Stand", "voice"};
        Dog dog = new Dog("Rex", "Ovcharka", commands, Color.BLACK, shelter);
        System.out.println(dog.getInfo());
        dog.makeVoice();
        dog.makeVoice("Giv Giv");
        dog.makeVoice("Gov Gov");


        Dog strayDog = new Dog("Kuzya", "Dvornyaga",  Color.BROWN, shelter2);
        System.out.println(strayDog.getInfo());
        strayDog.makeVoice();
        dog.makeVoice("gav1");
        dog.makeVoice();

    }
}
