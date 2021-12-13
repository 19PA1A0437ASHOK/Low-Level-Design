
public class Player{
    private String name;
   
    private int playerspot=0;
    public Player(String name){
    this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setplayerspot(int spot){
        this.playerspot=spot;
    }
    public int getplayerspot(){
        return playerspot;
    }
}