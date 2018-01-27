import java.util.List;

public class Player {
	
    public String name;
    
    public double currentRank;
    
    public List<Set> setHistory;
    
    public Player(String n) {
        name = n;
        currentRank = 2;
    }
}