import java.util.Arrays;

final public class Dog extends Pet {
    private String name;
    private String breed;
    private String[] commands;


    public Dog() {                        //1

    }

    @Override
    public String getInfo() {
        if (getCommands() != null) {
            return super.getInfo() + "\nName: " + name +
                    "\nBreed:" + breed + "\nCommands: " + Arrays.toString(commands);
        } else return super.getInfo() + "\nName: " + name +
                "\nBreed:" + breed ;
    }

    public Dog(String name, String breed, Color color, Shelter shelter) {      //2
        this.name = name;
        this.breed = breed;
        super.setColor(color);
        super.setShelter(shelter);
    }

    public Dog(String name, String breed, String[] commands, Color color, Shelter shelter) {       //3
        this.name = name;
        this.breed = breed;
        this.commands = commands;
        super.setColor(color);
        super.setShelter(shelter);
    }

    public void makeVoice() {
        System.out.println("Gav Gav");

    }

    public void makeVoice(String voice) {
        System.out.println(voice);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }
}
