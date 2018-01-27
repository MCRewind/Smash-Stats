package com.sac.stats.model;
public class Set {

    public String name = "";

    public Player playerOne;
    public Player playerTwo;

    public double playerOneOldRanking;
    public double playerTwoOldRanking;

    public int playerOneMatchesWon;
    public int playerTwoMatchesWon;

    public Set(Player p1, Player p2, int p1Wins, int p2Wins) {//2/(1+e^(x/2))
        playerOneOldRanking = p1.currentRank;
        playerTwoOldRanking = p2.currentRank;
        playerOneMatchesWon = p1Wins;
        playerTwoMatchesWon = p2Wins;
        playerOne = p1;
        playerTwo = p2;
        double sigmoidFactor = 2/(5*(1+Math.pow(Math.E, p1.currentRank/2)));//might be better to do a cubic polynomial.
        p1.currentRank += sigmoidFactor * ((double) (p1Wins-p2Wins));
        p2.currentRank += sigmoidFactor * ((double) (p2Wins-p1Wins));
    }

    public Set(Player p1, Player p2, int p1Wins, int p2Wins, String n) {
        name = n;
        playerOneOldRanking = p1.currentRank;
        playerTwoOldRanking = p2.currentRank;
        playerOneMatchesWon = p1Wins;
        playerTwoMatchesWon = p2Wins;
        playerOne = p1;
        playerTwo = p2;
        double sigmoidFactor = 2/(5*(1+Math.pow(Math.E, p1.currentRank/2)));//might be better to do a cubic polynomial.
        p1.currentRank += sigmoidFactor * ((double) (p1Wins-p2Wins));
        p2.currentRank += sigmoidFactor * ((double) (p2Wins-p1Wins));
    }
}