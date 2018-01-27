import java.util.ArrayList;

public class Player {

    public String name;

    public double currentRank;

    public ArrayList<Set> setHistory;

    public Player(String n) {
        name = n;
        currentRank = 2;
    }
}