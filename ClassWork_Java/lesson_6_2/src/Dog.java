public class Dog extends Animal {
    private String commands;

    public Dog(WeaponType color, int age, String commands) {
        super();
        this.setColor(color);
        this.setAge(age);
        this.commands = commands;
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }

    public void sayMyBirthYear() {
        System.out.println(2023 - this.getAge());
    }

    public String info() {
        return super.info() + " commands: " + this.commands;
    }
}
