import java.util.Scanner;
import java.util.Random;
public class rockpaperscissors{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		Random randno = new Random();
		int playerpoint = 0;
		int robotpoint = 0;
		int times = 0;

		while(times<5){
			System.out.println("-------------------------------------------------------------------");

			System.out.println("Enter your choice : \n\n0.Rock\n1.Paper\n2.Scissor\n");
			System.out.println("player entered : ");
			int player = sc.nextInt();
			System.out.println("robot entered : ");

			int rand = randno.nextInt(3);
			System.out.println(rand);
			System.out.println("-------------------------------------------------------------------");

			
			if(rand == player){
						System.out.println("no points");
			}	
			else if(rand == 0 && player == 1 || rand ==2 && player == 0 || rand ==1 && player == 2){

						System.out.println("10 point for player");
						playerpoint++;
			}
			
			else if(player>3){
				System.out.println("invalid choice..... select between 0 & 2.....");
			}
			else {
						System.out.println("10 point for robot");
						robotpoint++;
			}
		times++;
		}
		System.out.println("robot points : " +robotpoint);
		System.out.println("player points : " +playerpoint);
		if(playerpoint > robotpoint){
		
			System.out.println("\n\nCONGRATULATIONS......PLAYER WINS!!!!!");
		}
		else if(playerpoint==robotpoint){
			System.out.println("ITS A TIE............");
		}
		else{
			System.out.println("\n\nROBOT  WINS!!!!!");
			System.out.println("YOU LOST THE GAME......");
		}
		
		

	}
}