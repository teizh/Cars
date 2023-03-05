import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1
        String firstTask;
        //2
        final int NUM = 4;
        //3
        String word = "мушкетера";
        //4
        firstTask = NUM + " " + word;
        //5
        System.out.println(firstTask + " " + NUM + " " + word);
        //6
        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }
        //7
        System.out.println("Введите ваше имя:");
        //8
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        //9
        System.out.println("Здравствуйте " + name + "!");


    }
}