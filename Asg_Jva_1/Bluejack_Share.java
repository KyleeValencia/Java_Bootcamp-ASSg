package Asg_Jva_1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Bluejack_Share {

	Scanner scan = new Scanner(System.in);
	ArrayList <Data_type_Field> shareGame= new ArrayList<Data_type_Field>();
	public Bluejack_Share() {
		// TODO Auto-generated constructor stub
		clear_console();
		int d=-1;
		do
		{
			clear_console();
			Welcome();
//			menuOptions();
			choosemenu ch = new choosemenu();
			d = ch.choose;
			if(d==1) {
				inpshareList();
			}else if (d==2) {
				updatedata();
			} else if(d==3) {
				delete_participant();
			}else {
				view_data_final();
				scan.close();
				break;
			}
			clear_console();
		}while(d!=4);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Bluejack_Share();

	}
	class choosemenu{
		int choose;
		choosemenu() {
			do
			{
				menuOptions();
				try {
					choose = scan.nextInt();
				}catch(Exception e) {
					System.out.println("Input mismatch");
				}
				scan.nextLine();
			}while(choose > 4|| choose <1);
		}
	}
	void Welcome() {
		System.out.println("\n _______      ___             _______  __   __  _______  ______    _______ \r\n" + 
				"|  _    |    |   |           |       ||  | |  ||   _   ||    _ |  |       |\r\n" + 
				"| |_|   |    |   |   ____    |  _____||  |_|  ||  |_|  ||   | ||  |    ___|\r\n" + 
				"|       |    |   |  |____|   | |_____ |       ||       ||   |_||_ |   |___ \r\n" + 
				"|  _   |  ___|   |           |_____  ||       ||       ||    __  ||    ___|\r\n" + 
				"| |_|   ||       |            _____| ||   _   ||   _   ||   |  | ||   |___ \r\n" + 
				"|_______||_______|           |_______||__| |__||__| |__||___|  |_||_______|\n\n");
	}
	void menuOptions() {
//		
		System.out.println("+===================================+");
		System.out.println("+              Options              +");
		System.out.println("+===================================+");
		System.out.println("+ 1. Start Sharing                  +");
		System.out.println("+ 2. Update Participant             +");
		System.out.println("+ 3. Delete Participant             +");
		System.out.println("+ 4. Close App                      +");
		System.out.println("+===================================+");
		System.out.print(">> ");
	}

	boolean exists(String idf) {
			for (Data_type_Field id : shareGame) {
				if(idf.equals(id.getName())) {
					return true;
				}
			}
			return false;
		}
	void inpshareList (){
		String nick = null;
		boolean exist;
		int shares = share();
		do
		{
			clear_console();
			System.out.print("Could you give me your username [5 - 20 characters]? ");
			exist = false;
			nick = scan.nextLine();
//			scan.nextLine();
			if(exists(nick)) {
				System.out.println("Username has already taken !!");
				exist = true;
			}
		}while(nick.length()>20||nick.length()<5||exist == true);
		
		shareGame.add(new Data_type_Field(nick, shares));

		System.out.printf("You are the %d that joins the game\nYour share number : %d",shareGame.size(),shares);
		
	}
	void share_list() {
		
		System.out.println("+=============================================+");
		System.out.println("+  Share List                                 +");
		System.out.println("+=============================================+");
	}
	
	int share () {
		int shares = -1;
		do
		{
			clear_console();
			System.out.print("Input a number [0 - 100]: ");
			try {
				shares = scan.nextInt();
				scan.nextLine();
			}catch(Exception e) {
				scan.nextLine();
				System.out.println("Input must be numeric");
				continue;
			}
//			scan.nextLine();
		}while(shares>100||shares<0);
		return shares;
	}
	void proceed_menu() {
		System.out.println("No data updated or deleted");
		System.out.println("Proceed to main menu ....");
		scan.nextLine();
	}
	
	void updatedata() {
		if(shareGame.isEmpty()) {System.out.println("No data exist !!");return;}
		int update=-1;
		do {
			System.out.println("");
			clear_console();
			data_user();
			System.out.printf("\nWhich participant would you like to update [1 - %d] [0 to exit] >> ",shareGame.size());
			try {
				update = scan.nextInt();
			}catch(Exception e) {
				System.out.println("Input must be numeric");
			}
			scan.nextLine();
		}while(update > shareGame.size() || update <0);
		if(update==0) {
			proceed_menu();
			return;
		}
		int shares = share();
		shareGame.set(update-1, new Data_type_Field(shareGame.get(update-1).getName(), shares));
		System.out.println("Update Successfully !");
	}
	
	void delete_participant () {
		if(shareGame.isEmpty()) {System.out.println("No data exist !!");return;}
		int delete=-1;
		do {
			System.out.println("");
			clear_console();
			data_user();
			System.out.printf("\nWhich participant would you like to delete [1 - %d] [0 to exit] >> ",shareGame.size());
			try {
				delete= scan.nextInt();
			}catch(Exception e) {
				System.out.println("Input must be numeric");
			}
			scan.nextLine();
		}while(delete> shareGame.size() || delete<0);
		if(delete==0) {
			proceed_menu();
			return;
		}
		shareGame.remove(delete-1);
		System.out.println("Participant successfully removed from event");
	}
	
	void data_user() {
		int id = 1;
		 share_list();
		 System.out.printf("+%s|%s|%s+\n",centerPad(10, "Index"),centerPad(24, "Username"),centerPad(9, "Share"));
		 System.out.println("+=============================================+");
		 for (Data_type_Field data : shareGame) {
			System.out.printf("+%s|%s|%s+\n",centerPad(10, Integer.toString(id)),centerPad(24, data.getName()),centerPad(9, Integer.toString(data.getNumberNorm())));
			 id++;
		}
		 System.out.println("+=============================================+");
	}
	
	void view_data_final() {
		clear_console();
		ArrayList<Integer> shuffres= new ArrayList<Integer>();
		for (Data_type_Field s : shareGame) {
			shuffres.add(shareGame.indexOf(s), s.getNumberNorm());
		}
		Collections.shuffle(shuffres);
		Collections.reverse(shuffres);
		System.out.println("Here's the completed share list");
		System.out.println("Remember, sharing is caring, happy sharing :D");
		share_list();
		System.out.printf("+%s|%s|%s+\n",centerPad(24, "Username"),centerPad(11, "Before"),centerPad(8, "After"));
		System.out.println("+=============================================+");
		for (Data_type_Field s : shareGame) {
			System.out.printf("|%s|%s|%s|\n",centerPad(24, s.getName()),centerPad(11, Integer.toString(s.numberNorm)),centerPad(8, Integer.toString(shuffres.get(shareGame.indexOf(s)))));
		}
		System.out.println("+=============================================+");
		
	}
	
	String centerPad(int space, String str) {
		
		return String.format("%-" + space + "s", String.format("%" +((str.length()+space)/2)+"s", str));
	}
	
	void clear_console(){
		for (int i = 1; i < 1000; i++) {
			System.out.println("");
		}
	}
}
