
class Cricket {
    public static void main(String a[]){
        int runs = 50;
        int balls = 33;
        Player virat = new Player("Virat Kohli", runs, balls);
        float strikeRate = virat.getStrikeRate();
        virat.setRemuneration(18);
        float viratRem = virat.getRemuneration();
        String playerData = "Virat Kohli " + runs + " " + balls + " " + strikeRate + " " + viratRem;
        System.out.println(playerData);


    }
}

class Player {
    String playerName;
    int runs;
    int balls;
    private float remuneration;
    Player(String name, int r, int b){
        playerName = name;
        runs = r;
        balls = b;
    }
    public float getStrikeRate(){
        float strikeRate = (float) runs/balls * 100;
        return strikeRate;
    }
    public float getRemuneration(){
        return remuneration;
    }
    public void setRemuneration(float rem){
        remuneration = rem;
    }

    
}