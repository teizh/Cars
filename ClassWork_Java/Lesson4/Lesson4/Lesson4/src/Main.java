import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        System.out.println(names);
        names.add("Leo");
        names.add("Chris");
        names.add("Stark");
        System.out.println(names);
        names.add(1, "Tom");
        System.out.println(names);
        names.remove("Chris");
        System.out.println(names);
        names.remove(0);
        System.out.println(names);

        if (names.contains("Tom")){
            System.out.println(names.get(0) + " Есть");
        }else {
            System.out.println("Нету");
        }

//        names.clear();
        if (names.isEmpty()){
            System.out.println("Да, список пустой. " + names.size());
        }else {
            System.out.println("Нет, список не пустой. " + names.size());
        }

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Lena");
        names2.add("Luda");
        names2.add("Anya");

        System.out.println("Список 1 " + names);
        System.out.println("Список 2 " + names2);

        System.out.println("-------------------");
        names.addAll(names2);
//        names.addAll(1, names2);

        System.out.println("Список 1 " + names);
        System.out.println("Список 2 " + names2);

        names.removeAll(names2);
//        names.retainAll(names2);

        System.out.println("-------------------");
        System.out.println("Список 1 " + names);
        System.out.println("Список 2 " + names2);

        names.set(1, "Tony");
        System.out.println(names);

        names.add("Leo");
        names.add("Jack");
        System.out.println(names);
        System.out.println("------------");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        System.out.println("------------");
        for (String name: names) {
            System.out.println(name);
        }
        System.out.println("------------");
        names.forEach(s -> {
            System.out.println(s);
        });

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(3252345);
        numbers.add(-235235);
        numbers.add(-235235);
        numbers.add(-235235);
        numbers.add(0);
        System.out.println(numbers);

        HashSet<String> namesHashSet = new HashSet<>();
        namesHashSet.add("Leo");
        namesHashSet.add("Chris");
        namesHashSet.add("Chris");
        namesHashSet.add("John");
        System.out.println(namesHashSet);


        User user1 = new User("Leo", 37);
        User user2 = new User("Chris", 39);
        User user3 = new User("John", 18);

        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        System.out.println(users);

        System.out.println("До сортировки");
        System.out.println(numbers);
        Collections.sort(numbers);

        System.out.println("После сортировки");
        System.out.println(numbers);

        names.add("Antony");
        names.add("Ян");
        names.add("Антон");
        System.out.println("До сортировки");
        System.out.println(names);

        Collections.sort(names);
        System.out.println("После сортировки");
        System.out.println(names);


        System.out.println("До сортировки");
        System.out.println(users);
        users.sort(Comparator.comparing(User::getAge));

        System.out.println("Сначала молодые");
        System.out.println(users);

        System.out.println("Сначала Старые");
        Collections.reverse(users);
        System.out.println(users);

        System.out.println("Рандом");
        Collections.shuffle(users);
        System.out.println(users);

    }
}