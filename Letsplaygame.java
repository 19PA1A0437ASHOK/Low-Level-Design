
import java.util.*;
public class Letsplaygame{
    public static void main(String[]args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Starting the game");

            int boardsize=Integer.parseInt(sc.nextLine());
            int noofdices=Integer.parseInt(sc.nextLine());
        
            System.out.println("number of dices in the game are : "+noofdices);
            int n1=Integer.parseInt(sc.nextLine());
            System.out.println("number of snakes are :"+n1);
            int n2=Integer.parseInt(sc.nextLine());
            System.out.println("number of ladders are :"+n2);
            HashMap<Integer,Snakes>map1=new HashMap<Integer,Snakes>();
            for(int i=0;i<n1;i++){
                String[]data=sc.nextLine().split(" ");
                int end=Integer.parseInt(data[1]);
                int start=Integer.parseInt(data[0]);
                Snakes snake=new Snakes(start,end);
                map1.put(start,snake);
                }
            HashMap<Integer,Ladders>map2=new HashMap<Integer,Ladders>();
            for(int j=0;j<n2;j++){
                String[]data=sc.nextLine().split(" ");
                int end=Integer.parseInt(data[1]);
                int start=Integer.parseInt(data[0]);
                Ladders ladder=new Ladders(start,end);
                map2.put(start,ladder);
                }
            Queue<Player>playerslist=new LinkedList<Player>();
            int n=Integer.parseInt(sc.nextLine());
            System.out.println("number of players playing the game are : "+n);
            for(int k=0;k<n;k++){
                String name=sc.nextLine();
                Player p1=new Player(name);
                playerslist.add(p1);
                }
            Board board=new Board(boardsize,map1,map2,playerslist);
            board.SnakesandLadders();
        } 
        }
        
    }