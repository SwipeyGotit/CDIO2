class PokerKonto{
    private int balance;
    public int PlayerID;
    public String PlayerName;

    public PokerKonto(int balance, int PlayerID, String PlayerName){
        this.balance = balance;
        this.PlayerID = PlayerID;
        this.PlayerName = PlayerName;
    }

    public String getPlayerName(){
        return this.PlayerName;
    }

    public int getbalance(){
        return this.balance;
    }

    public int getPlayerID(){
        return this.PlayerID;
    }

}