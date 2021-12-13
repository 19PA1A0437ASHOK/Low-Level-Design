
import java.util.*;
public class Board{
    private int boardsize;
    private HashMap<Integer, Snakes> snakes;
    private HashMap<Integer, Ladders> ladders;
    private Queue<Player> playerslist;
    public Board(int boardsize,HashMap<Integer,Snakes> snakes,HashMap<Integer,Ladders> ladders, Queue<Player> playerslist){
    this.boardsize=boardsize;
    this.snakes=snakes;
    this.ladders=ladders;
    this.playerslist=playerslist;   
    }
    public void SnakesandLadders(){
        while(true){
            Player p1=playerslist.poll();
            int lastposition=p1.getplayerspot();
            int newposition=lastposition + Dice.rolldice();
            if(newposition <= boardsize){
                if(snakes.containsKey(newposition)){
                    System.out.println(p1.getName()+"bitten by snake and came to  tail of the snake");
                    Snakes s11=snakes.get(newposition);
                    newposition=s11.getEndPoint();
                
                }
                else if(ladders.containsKey(newposition)){
                     System.out.println(p1.getName()+"climed the ladder and reached the top of ladder");
                    Ladders l11=ladders.get(newposition);
                    newposition=l11.getEndPoint();
                   
                }
                else{
                    System.out.println(p1.getName()+"has moved from "+lastposition+"to "+newposition);
                }
                if(newposition==boardsize){
                    System.out.println(p1.getName()+"won the game");
                    break;
                }
            p1.setplayerspot(newposition);
            }
        playerslist.add(p1);
    }
}
}