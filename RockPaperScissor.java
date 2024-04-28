import java.util.*;
public class RockPaperScissor {
        public static int computer=0;
        public static int player=0;
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        Random rand=new Random();
        char opt[]={'R','P','S'};
        while(player<3 && computer<3){
            char c=opt[rand.nextInt(3)];
            System.out.println("Enter your option 'R' or 'P' or 'S':");
            char u=scan.nextLine().charAt(0);
            check(c,u);
        }
        if(player==3){
            System.out.println("Player Wins");
        }else{
            System.out.println("Computer Wins");
        }
    }

    public static void check(char c,char u){
        if(c==u){
            System.out.println("Both computer & player are same: "+c);
        }else if(u=='R'){
            if(c=='P'){
                System.out.println("Computer: "+c+" Player: "+u);
                computer++;
            }else if(c=='S'){
                System.out.println("Computer: "+c+" Player: "+u);
                player++;
            }
        }else if(u=='P'){
            if(c=='R'){
                System.out.println("Computer: "+c+" Player: "+u);
                player++;
            }else if(c=='S'){
                System.out.println("Computer: "+c+" Player: "+u);
                computer++;
            }
        }else if(u=='S'){
            if(c=='P'){
                System.out.println("Computer: "+c+" Player: "+u);
                player++;
            }else if(c=='R'){
                System.out.println("Computer: "+c+" Player: "+u);
                computer++;
            }
        }
        System.out.println("The points are - Computer:"+computer+" Player:"+player);
        System.out.println();
    }
}
