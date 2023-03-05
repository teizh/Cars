public class User {

    private int age;
    private String name;
    private WeekEnum weekEnum;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setWeekEnum(WeekEnum weekEnum) {
        this.weekEnum = weekEnum;
    }

    public WeekEnum getWeekEnum() {
        return weekEnum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0){
            System.out.println("Не корректный");
        }else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
