public class FightingDog extends Dog {
    private int wins;

    public FightingDog(WeaponType color, int age, String commands, int wins) {
        super(color, age, commands);
        this.wins = wins;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    @Override
    public String info() {
        return super.info() + " wins: " + this.wins;
    }
}
