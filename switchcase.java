import java.util.Scanner;
public class switchcase {
	public static void main(String[] args){
		int choice;
		System.out.println("Pick one : 1.good morning\t2. good afternoon\t3 good night\t");
		Scanner a = new Scanner(System.in);
		choice = a.nextInt();
		switch(choice){
			case 1: System.out.println("you choice good morning");
				break;
			case 2: System.out.println("you choice good afternoon");
				break;	
          		case 3: System.out.println("you choice good night");
				break;		
			default : System.out.println(" Invalid Option :) ");
}
}
		
}