package Asg_Jva_2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Shoe_Shop {

	ArrayList<Shop_attr> shop= new ArrayList<Shop_attr>();
	Scanner scan = new Scanner(System.in);
	int length_global = 0;
	
	public Shoe_Shop() {
		int get=0;
		do {
			Menu();
			try {
				get = scan.nextInt();
			}catch(Exception e) {
				System.out.println("Input must be numeric");
			}
			scan.nextLine();
			
			if(get==1) viewshoes();
			else if(get==2) inputshoes();
			else if(get==3) deleteshoes();
			else if (get==4) {
				scan.close();
				break;
			}
		}while(true);
		System.out.println("Thankyou For using this app !");
	}
void Menu() {
	System.out.println("Shoe  Shop");
	System.out.println("=================");
	System.out.println("1. View Shoes");
	System.out.println("2. Add Shoe");
	System.out.println("3. Delete Shoe");
	System.out.println("4. Exit");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Shoe_Shop();
	}
	boolean Checkdate(String release) {
		int p1=0,p2=0,p3=0;
//		String date="",month="",year="";
		int d=0,m=0,y=0;
		if (release.length()<6||release.length()>10) return false;
		for(p1 = 0;release.charAt(p1)!='-'&&release.charAt(p1)!='\0';p1++) {
//			date = date+Character.toString(release.charAt(p1)); 
			if(release.charAt(p1)>'9'&&release.charAt(p1)<'0') {
				break;
			}
			try {
				d = (d*10)+((int) (release.charAt(p1)-'0'));
			}catch(Exception e) {
				System.out.println("Error Occured");
			}
		}
//		System.out.println(d);
		try {
			for(p2= p1+1;release.charAt(p2)!='-'&&release.charAt(p2)!='\0';p2++) {
		//			month = month+Character.toString(release.charAt(p2));
				if(release.charAt(p2)>'9'&&release.charAt(p2)<'0') {
					break;
				}
				try {
					m = (m*10)+((int) (release.charAt(p2)-'0'));
				}catch(Exception e) {
					System.out.println(" 2 Error Occured");
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(" 2132 Error Occured");
		}
//System.out.println(m);
			try {
				for(p3 = p2+1;release.charAt(p3)!='-'&&(p3<=release.length()-1);p3++) {
					if(release.charAt(p3)>'9'&&release.charAt(p3)<'0'||p3>=release.length()) {
						break;
					}
					try {
						y = (y*10)+((int) (release.charAt(p3)-'0'));
					}catch(Exception e) {
						System.out.println("2222 Error Occured");
					}
//				System.out.println(y);
				}
			}catch(Exception e) {

			}
//			System.out.println(y);
		if(d<1||d>31||m<1||m>12||y<1800) return false;
		if(m==2) {
				return (((y % 4 == 0) &&(y % 100 != 0)) ||(y % 400 == 0))? (d<=29):(d<-28);
		}
		if(m==4||m==6||m==9||m==11) {
			return (d>0&&d<=30);
		}
		if(m%2==1||(m>=8&&m%2==0)) {
			return (d>0&&d<=31);
		}
		return false;
	}
	void proceed_mainmenu() {
		System.out.println("Press enter to continue...");
		scan.nextLine();
	}
	
	void deleteshoes() {
		if(shop.isEmpty()) 
		{
			System.out.println("No shoes available..");
			proceed_mainmenu();
			clearsc();
			return;
		}
		int deldata=-1;
		do {
			viewshoes();
			System.out.printf("Choose shoe's number to delete [1..%d] (Press 0 to exit)\n",shop.size());
			try {
				deldata = scan.nextInt();
			}catch(Exception e) {
				System.out.println("Input must be numeric");
			}
			scan.nextLine();
		}while(deldata>shop.size()||deldata<0);
		
		if(deldata==0) return ;
		shop.remove(deldata-1);
		System.out.println("Shoe removed!");
	}
	
	void viewshoes() {
		if(shop.isEmpty()) 
		{
			System.out.println("No shoes available..");
			proceed_mainmenu();
			clearsc();
			return;
		}
		int id = 1;
		for (Shop_attr shops : shop) {
			System.out.printf("%d  %s-%s\n",id,shops.getName(),shops.getId());
			for (int i = 0; i <=length_global+15; i++) {
				System.out.print("=");
			}
			System.out.println("\nCategory: "+shops.getCategory());
			System.out.println("Release date: "+shops.getRelease());
			System.out.println("Price: "+shops.getPrice());
			System.out.println("\n");
			id++;
		}
	}
	
	void clearsc() {
		for (int i = 0; i <= 1000; i++) {
			System.out.println("");
		}
	}
	
	void inputshoes() {
		inputShoedata d = new inputShoedata();
		shop.add(new Shop_attr(d.shoename, d.Id, d.shoeCat, d.release, d.price));
		System.out.println("Shoe added!");
		proceed_mainmenu();
		clearsc();
	}
	class inputShoedata{
		String shoename;
		String shoeCat;
		String release;
		String Id;
		int price;
		inputShoedata(){
			String subShoe="";
			do {
				System.out.print("Input shoe's name [name ends with shoe. Example: \"Fire shoe\"]: ");
				shoename = scan.nextLine();
				for (int i = shoename.length()-1; shoename.charAt(i)!=' ' && shoename.charAt(i)!='\0'; i--) {
					subShoe = subShoe + Character.toString(shoename.charAt(i));
				}
//				System.out.println("*"+subShoe+"*");
//				scan.nextLine();
			}while(!subShoe.equals("eohs"));
			if(shoename.length()>length_global) length_global = shoename.length();
			do
			{
				System.out.print("Input shoe's category [Sneaker | Running | Boot] (Case Sensitive): ");
				shoeCat = scan.nextLine();
//				scan.nextLine();
				
			}while(!(shoeCat.equals("Sneaker")||shoeCat.equals("Running")||shoeCat.equals("Boot")));
			boolean valid = true;
			do {
				
				System.out.print("Input shoe's release date [dd-mm-yyyy]: ");
				release = scan.nextLine();
//				scan.nextLine();
				valid = Checkdate(release);
			}while(!valid);
			do {
				try {
					System.out.print("Input shoe price [more than or equals to 5000]: ");
					price = scan.nextInt();
				}catch(Exception e) {
					System.out.println("Input must without character and must be numeric");
				}
				scan.nextLine();
			}while(price<5000);
			
			this.Id = generatecId();
		}
	}
	String generatecId() {
		Random rand = new Random();
		String genericId;
		String num="";
		boolean exist = false;
		do
		{
			exist = false;
			for (int i = 1; i <= 3; i++) {
				num = num+Character.toString((char)(Math.abs((rand.nextInt())%10)+48));
			}
			for (Shop_attr newS : shop) {
				if((newS.getId()).equals("SH"+num)) {
					exist = true;
					break;
				}
			}
		}while(exist);
		
		genericId="SH"+num;
		return genericId;
	}
	

}
