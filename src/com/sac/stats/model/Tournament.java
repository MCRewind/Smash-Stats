public class Tournament {
    public Player[] players;//players listed in order, so players[0] would be the person who got first place
    public double[] playerOldRanks;//same as above, players[0] corresponds to playerOldRanks[0]

    public Set[] sets;

    public double upperBound;
    public double lowerBound;

    public Tournament(Player plyrs, Set[] set) {

        players = plyrs;
        sets = set;

        playerOldRanks = new double[players.length];

        upperBound = 0;
        lowerBound = 9999999;

        for (int i = 0;i < players.length; i++) {
            playerOldRanks[i] = players[i].currentRank;
            if (upperBound < playerOldRanks[i]) {
                upperBound = playerOldRanks[i];
            }
            if (lowerBound > playerOldRanks[i]) {
                lowerBound = playerOldRanks[i];
            }
        }
        //upperBound += 1;
        //lowerBound -= 1;

        for (int i = 0;i < players.length; i++) {
            double pp = 1 - (i + 0.5)/players.length;
            double tv = (lowerBound + pp * upperBound)/(1 + pp);
            players[i] += (tv - old rank) * 0.4;
        }
    }
}
/*
pp: percentage placement = 1-placement/total
tv: target value = (lowerBound + pp(upperBound))/(1 + pp)
nv: new rank = old rank + (tv - old rank)*0.4
 */