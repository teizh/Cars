public class Animal {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void move(){
        System.out.println("фыафым");
    }

    public final void move(int speed){
        System.out.println("фыафым");
    }
}
