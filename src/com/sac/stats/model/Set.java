package com.sac.stats.model;
public class Set {
	
    public String name = "";
    
    public Player playerOne;
    public Player playerTwo;
    
    public double playerOneOldRanking;
    public double playerTwoOldRanking;
    
    public int playerOneMatchesWon;
    public int playerTwoMatchesWon;
    
    public Set(Player p1, Player p2, int p1Wins, int p2Wins) {

    }
    
    public Set(Player p1, Player p2, int p1Wins, int p2Wins, String name) {

    }
}