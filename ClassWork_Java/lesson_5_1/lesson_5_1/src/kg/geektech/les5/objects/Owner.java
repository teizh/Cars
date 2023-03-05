package kg.geektech.les5.objects;

public class Owner {
    private String fullName;
    private int experience;

    public Owner(String fullName, int experience) {
        this.fullName = fullName;
        this.experience = experience;
        wasCreated();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience < 0) {
            System.out.println("Wrong value for experience field");
        } else {
            this.experience = experience;
        }
    }

    public int calculateStartYear() {
        return 2023 - experience;
    }

    private void wasCreated() {
        System.out.println("New owner was created");
    }
}
