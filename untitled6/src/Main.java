import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Type name");
            String name = scanner.next();


            try {
                user.setName(name);
                System.out.println("Uspeshno sohranilos " +
                        "vashe imya " + user.getName());
            } catch (IllegalNameException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Type age");
            Integer age = scanner.nextInt();
            try {
                user.setAge(age);
                System.out.println("Uspeshno sohranilsya " +
                        "vash vozrast " + user.getAge());
            } catch (IllegalAgeException ie) {
                System.out.println(ie.getMessage());
            }


        }
    }
}