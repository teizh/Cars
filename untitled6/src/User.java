public class User {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalNameException {
        if (name.length() > 30){
            throw new IllegalNameException("Error. Length of the name" +
                    "not be more then 30 symbols"+name);

        }
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age <= 0 || age > 100) {
            throw new IllegalAgeException("Error. Age cannot be " +
                    "less than 0 or more than 100" + age);

        }

        this.age = age;
    }
}
