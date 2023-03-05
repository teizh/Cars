import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Green");
        colors.add("White");
        colors.add("Pink");
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Black");

        Collections.sort(colors);
        System.out.println(colors);
        Collections.reverse(colors);
        System.out.println(colors);
        Collections.shuffle(colors);
        System.out.println(colors);

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
        for (String currentColor : colors
        ) {
            System.out.println(currentColor);
        }
        Player player1 = new Player("Ronaldo", 7);
        Player player2 = new Player("Messi", 10);
        Player player3 = new Player("Mbappe", 10);
        ArrayList<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);

        System.out.println(players);


    }
}