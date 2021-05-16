package Asg_Jva_0;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Bluejack_Table {
	Scanner scan=new Scanner(System.in);
//	Visual_Print vis = 	new Visual_Print();
	Bluejack_Table() {
		int choose;
		do
		{
			Welcome();
			chooseInput ans= new chooseInput();
			choose = ans.inp;
			if(ans.inp==1)
			{
				simulation_datatype_arith();
				clrsc();
				simulation_boolean();
//				clrsc();
			}
			else
			{
				Close_App();
				break;
			}			
		}while(choose==1);
	}
	public static void main(String[] args) {
		new Bluejack_Table();
	}
	class chooseInput {
		int inp;
		chooseInput()
		{
			do
			{
				System.out.println("1. Start Simulation");
				System.out.println("2. Close App");
				System.out.print("Choice >>");
				try
				{
					inp = scan.nextInt();
				}catch(Exception e) {
					System.out.println("Input are weird");
				}
				scan.nextLine();	
			}while(inp>2||inp<1);
			
		}	
	}
	class Operandnum
	{
		int Op1,Op2;
		Operandnum()
		{
			do 
			{
				System.out.print("Input the first number [1-100](inclusive): ");
				try
				{
					Op1=scan.nextInt();					
				}catch(Exception e) 
				{
					System.out.println("Input are not numeric");
				}
				scan.nextLine();
			}while(Op1>100||Op1<1);
			do 
			{
				System.out.print("Input the second number [1-100](inclusive): ");
				try
				{
					Op2=scan.nextInt();					
				}catch(Exception e) {
					System.out.println("Input are not numeric");
				}
				scan.nextLine();
			}while(Op2>100||Op2<0);
		}
	}
	class OperandBool
	{
		boolean bOp1,bOp2;String bo1=null,bo2 =null ;
		OperandBool()
		{
			do
			{
				System.out.print("Give me value for p1 [true | false]:");
				bo1 = scan.nextLine();
//				scan.nextLine();
			}while(!(bo1.equalsIgnoreCase("true")||bo1.equalsIgnoreCase("false")));
			bOp1 = Boolean.parseBoolean(bo1.toLowerCase());
			do
			{
				System.out.print("Give me value for p2 [true | false]:");
				bo2 = scan.nextLine();
//				scan.nextLine();
			}while(!(bo2.equalsIgnoreCase("true")||bo2.equalsIgnoreCase("false")));
			bOp2 = Boolean.parseBoolean(bo2.toLowerCase());
		}
	}
	
	
	void Welcome() 
	{	
		System.out.println(" /$$$$$$$     /$$$$$                        /$$$$$ /$$$$$$$  /$$$$$$$$        /$$       /$$          ");
		System.out.println("| $$__  $$   |__  $$                       |__  $$| $$__  $$|__  $$__/       | $$      | $$          ");
		System.out.println("| $$  \\ $$      | $$                          | $$| $$  \\ $$   | $$  /$$$$$$ | $$$$$$$ | $$  /$$$$$$ ");
		System.out.println("| $$$$$$$       | $$       /$$$$$$            | $$| $$$$$$$/   | $$ |____  $$| $$__  $$| $$ /$$__  $$");
		System.out.println("| $$__  $$ /$$  | $$      |______/       /$$  | $$| $$____/    | $$  /$$$$$$$| $$  \\ $$| $$| $$$$$$$$");
		System.out.println("| $$  \\ $$| $$  | $$                    | $$  | $$| $$         | $$ /$$__  $$| $$  | $$| $$| $$_____/");
		System.out.println("| $$$$$$$/|  $$$$$$/                    |  $$$$$$/| $$         | $$|  $$$$$$$| $$$$$$$/| $$|  $$$$$$$");
		System.out.println("|_______/  \\______/                      \\______/ |__/         |__/ \\_______/|_______/ |__/ \\_______/");	
	}
	void Close_App() 
	{
		System.out.print("                                                                                                                                                                                                                                                                                                                                                                                                                                                                             \r\n" + 
				"                                                                                                                                                                                                                                                                                                                                                                                                                                                                             \r\n" + 
				"TTTTTTTTTTTTTTTTTTTTTTThhhhhhh                                                kkkkkkkk                                                                                  ffffffffffffffff                                                                              iiii                                                     tttt         hhhhhhh                                                                                                                 !!!  !!! \r\n" + 
				"T:::::::::::::::::::::Th:::::h                                                k::::::k                                                                                 f::::::::::::::::f                                                                            i::::i                                                 ttt:::t         h:::::h                                                                                                                !!:!!!!:!!\r\n" + 
				"T:::::::::::::::::::::Th:::::h                                                k::::::k                                                                                f::::::::::::::::::f                                                                            iiii                                                  t:::::t         h:::::h                                                                                                                !:::!!:::!\r\n" + 
				"T:::::TT:::::::TT:::::Th:::::h                                                k::::::k                                                                                f::::::fffffff:::::f                                                                                                                                  t:::::t         h:::::h                                                                                                                !:::!!:::!\r\n" + 
				"TTTTTT  T:::::T  TTTTTT h::::h hhhhh         aaaaaaaaaaaaa  nnnn  nnnnnnnn     k:::::k    kkkkkkk     yyyyyyy           yyyyyyy ooooooooooo   uuuuuu    uuuuuu        f:::::f       ffffffooooooooooo   rrrrr   rrrrrrrrr        uuuuuu    uuuuuu      ssssssssss   iiiiiiinnnn  nnnnnnnn       ggggggggg   ggggg     ttttttt:::::ttttttt    h::::h hhhhh           eeeeeeeeeeee           aaaaaaaaaaaaa  ppppp   ppppppppp   ppppp   ppppppppp       ssssssssss   !:::!!:::!\r\n" + 
				"        T:::::T         h::::hh:::::hhh      a::::::::::::a n:::nn::::::::nn   k:::::k   k:::::k       y:::::y         y:::::yoo:::::::::::oo u::::u    u::::u        f:::::f           oo:::::::::::oo r::::rrr:::::::::r       u::::u    u::::u    ss::::::::::s  i:::::in:::nn::::::::nn    g:::::::::ggg::::g     t:::::::::::::::::t    h::::hh:::::hhh      ee::::::::::::ee         a::::::::::::a p::::ppp:::::::::p  p::::ppp:::::::::p    ss::::::::::s  !:::!!:::!\r\n" + 
				"        T:::::T         h::::::::::::::hh    aaaaaaaaa:::::an::::::::::::::nn  k:::::k  k:::::k         y:::::y       y:::::yo:::::::::::::::ou::::u    u::::u       f:::::::ffffff    o:::::::::::::::or:::::::::::::::::r      u::::u    u::::u  ss:::::::::::::s  i::::in::::::::::::::nn  g:::::::::::::::::g     t:::::::::::::::::t    h::::::::::::::hh   e::::::eeeee:::::ee       aaaaaaaaa:::::ap:::::::::::::::::p p:::::::::::::::::p ss:::::::::::::s !:::!!:::!\r\n" + 
				"        T:::::T         h:::::::hhh::::::h            a::::ann:::::::::::::::n k:::::k k:::::k           y:::::y     y:::::y o:::::ooooo:::::ou::::u    u::::u       f::::::::::::f    o:::::ooooo:::::orr::::::rrrrr::::::r     u::::u    u::::u  s::::::ssss:::::s i::::inn:::::::::::::::ng::::::ggggg::::::gg     tttttt:::::::tttttt    h:::::::hhh::::::h e::::::e     e:::::e                a::::app::::::ppppp::::::ppp::::::ppppp::::::ps::::::ssss:::::s!:::!!:::!\r\n" + 
				"        T:::::T         h::::::h   h::::::h    aaaaaaa:::::a  n:::::nnnn:::::n k::::::k:::::k             y:::::y   y:::::y  o::::o     o::::ou::::u    u::::u       f::::::::::::f    o::::o     o::::o r:::::r     r:::::r     u::::u    u::::u   s:::::s  ssssss  i::::i  n:::::nnnn:::::ng:::::g     g:::::g            t:::::t          h::::::h   h::::::he:::::::eeeee::::::e         aaaaaaa:::::a p:::::p     p:::::p p:::::p     p:::::p s:::::s  ssssss !:::!!:::!\r\n" + 
				"        T:::::T         h:::::h     h:::::h  aa::::::::::::a  n::::n    n::::n k:::::::::::k               y:::::y y:::::y   o::::o     o::::ou::::u    u::::u       f:::::::ffffff    o::::o     o::::o r:::::r     rrrrrrr     u::::u    u::::u     s::::::s       i::::i  n::::n    n::::ng:::::g     g:::::g            t:::::t          h:::::h     h:::::he:::::::::::::::::e        aa::::::::::::a p:::::p     p:::::p p:::::p     p:::::p   s::::::s      !:::!!:::!\r\n" + 
				"        T:::::T         h:::::h     h:::::h a::::aaaa::::::a  n::::n    n::::n k:::::::::::k                y:::::y:::::y    o::::o     o::::ou::::u    u::::u        f:::::f          o::::o     o::::o r:::::r                 u::::u    u::::u        s::::::s    i::::i  n::::n    n::::ng:::::g     g:::::g            t:::::t          h:::::h     h:::::he::::::eeeeeeeeeee        a::::aaaa::::::a p:::::p     p:::::p p:::::p     p:::::p      s::::::s   !!:!!!!:!!\r\n" + 
				"        T:::::T         h:::::h     h:::::ha::::a    a:::::a  n::::n    n::::n k::::::k:::::k                y:::::::::y     o::::o     o::::ou:::::uuuu:::::u        f:::::f          o::::o     o::::o r:::::r                 u:::::uuuu:::::u  ssssss   s:::::s  i::::i  n::::n    n::::ng::::::g    g:::::g            t:::::t    tttttth:::::h     h:::::he:::::::e                a::::a    a:::::a p:::::p    p::::::p p:::::p    p::::::pssssss   s:::::s  !!!  !!! \r\n" + 
				"      TT:::::::TT       h:::::h     h:::::ha::::a    a:::::a  n::::n    n::::nk::::::k k:::::k                y:::::::y      o:::::ooooo:::::ou:::::::::::::::uu     f:::::::f         o:::::ooooo:::::o r:::::r                 u:::::::::::::::uus:::::ssss::::::si::::::i n::::n    n::::ng:::::::ggggg:::::g            t::::::tttt:::::th:::::h     h:::::he::::::::e               a::::a    a:::::a p:::::ppppp:::::::p p:::::ppppp:::::::ps:::::ssss::::::s          \r\n" + 
				"      T:::::::::T       h:::::h     h:::::ha:::::aaaa::::::a  n::::n    n::::nk::::::k  k:::::k                y:::::y       o:::::::::::::::o u:::::::::::::::u     f:::::::f         o:::::::::::::::o r:::::r                  u:::::::::::::::us::::::::::::::s i::::::i n::::n    n::::n g::::::::::::::::g            tt::::::::::::::th:::::h     h:::::h e::::::::eeeeeeee       a:::::aaaa::::::a p::::::::::::::::p  p::::::::::::::::p s::::::::::::::s  !!!  !!! \r\n" + 
				"      T:::::::::T       h:::::h     h:::::h a::::::::::aa:::a n::::n    n::::nk::::::k   k:::::k              y:::::y         oo:::::::::::oo   uu::::::::uu:::u     f:::::::f          oo:::::::::::oo  r:::::r                   uu::::::::uu:::u s:::::::::::ss  i::::::i n::::n    n::::n  gg::::::::::::::g              tt:::::::::::tth:::::h     h:::::h  ee:::::::::::::e        a::::::::::aa:::ap::::::::::::::pp   p::::::::::::::pp   s:::::::::::ss  !!:!!!!:!!\r\n" + 
				"      TTTTTTTTTTT       hhhhhhh     hhhhhhh  aaaaaaaaaa  aaaa nnnnnn    nnnnnnkkkkkkkk    kkkkkkk            y:::::y            ooooooooooo       uuuuuuuu  uuuu     fffffffff            ooooooooooo    rrrrrrr                     uuuuuuuu  uuuu  sssssssssss    iiiiiiii nnnnnn    nnnnnn    gggggggg::::::g                ttttttttttt  hhhhhhh     hhhhhhh    eeeeeeeeeeeeee         aaaaaaaaaa  aaaap::::::pppppppp     p::::::pppppppp      sssssssssss     !!!  !!! \r\n" + 
				"                                                                                                            y:::::y                                                                                                                                                                                      g:::::g                                                                                           p:::::p             p:::::p                                       \r\n" + 
				"                                                                                                           y:::::y                                                                                                                                                                           gggggg      g:::::g                                                                                           p:::::p             p:::::p                                       \r\n" + 
				"                                                                                                          y:::::y                                                                                                                                                                            g:::::gg   gg:::::g                                                                                          p:::::::p           p:::::::p                                      \r\n" + 
				"                                                                                                         y:::::y                                                                                                                                                                              g::::::ggg:::::::g                                                                                          p:::::::p           p:::::::p                                      \r\n" + 
				"                                                                                                        yyyyyyy                                                                                                                                                                                gg:::::::::::::g                                                                                           p:::::::p           p:::::::p                                      \r\n" + 
				"                                                                                                                                                                                                                                                                                                 ggg::::::ggg                                                                                             ppppppppp           ppppppppp                                      \r\n" + 
				"                                                                                                                                                                                                                                                                                                    gggggg                                                                                                                                                                   ");
	
	}
	void simulation_datatype_arith(){
			Operandnum op = new Operandnum();  
			DecimalFormat d = new DecimalFormat("#.000");
			
			System.out.println("+===================================================================================================================================+");
			System.out.println("+   + (String Type)   |   (Character Type)   |   * (Integer Type)   |   / (Floating Type)   |   input 1 == input 2 (Boolean Type)   +");
			System.out.println("+===================================================================================================================================+");
			System.out.printf("+%s|%s|%s|%s|%s+\n",centerFormat(21, Integer.valueOf(op.Op1).toString()+" + "+Integer.valueOf(op.Op2).toString()),centerFormat(22, Character.toString((char)op.Op1)+"  "+Character.toString((char)op.Op2)),centerFormat(22, Integer.toString(Integer.valueOf(op.Op1) * Integer.valueOf(op.Op2))),centerFormat(23, Double.toString(Double.valueOf(d.format(Double.valueOf(op.Op1)/Double.valueOf(op.Op2))))),centerFormat(39, Boolean.toString(Integer.valueOf(op.Op1) == Integer.valueOf(op.Op2))));
			System.out.println("+===================================================================================================================================+");
			
//			clrsc();
			
			System.out.println("\n\n+=======================================================================================================================+");
            System.out.println("+ Data Type: Integer                                                     								            	+");
            System.out.println("+=======================================================================================================================+");
            System.out.println("+           +           |           -           |           *           |           /           |           %           +");
            System.out.println("+=======================================================================================================================+");
            System.out.printf("+%s|%s|%s|%s|%s+\n",centerFormat(23, Integer.toString(Integer.valueOf(op.Op1) + Integer.valueOf(op.Op2))),centerFormat(23, Integer.toString(Integer.valueOf(op.Op1) - Integer.valueOf(op.Op2))),centerFormat(23, Integer.toString(Integer.valueOf(op.Op1) * Integer.valueOf(op.Op2))),centerFormat(23, Integer.toString(Integer.valueOf(op.Op1) / Integer.valueOf(op.Op2))),centerFormat(23, Integer.toString(Integer.valueOf(op.Op1) % Integer.valueOf(op.Op2))));
            System.out.println("+=======================================================================================================================+");
	}
	void simulation_boolean() {
		OperandBool opB = new OperandBool();
		System.out.println("+=====================================================================================+");
        System.out.println("+ Logical Table                                                                       +");
        System.out.println("+=====================================================================================+");
        System.out.printf("+ P1 = %s , P2 = %s\n",centerFormat(6, Boolean.toString(opB.bOp1)),centerFormat(6, Boolean.toString(opB.bOp2)));
        System.out.println("+=====================================================================================+");
        System.out.println("+         !P1         |         !P2         |         &&         |         ||         +");
        System.out.println("+=====================================================================================+");
        System.out.printf("+%s|%s|%s|%s+\n",centerFormat(21, Boolean.toString(!(opB.bOp1))),centerFormat(21, Boolean.toString(!(opB.bOp2))),centerFormat(20, Boolean.toString(Boolean.logicalAnd(opB.bOp1, opB.bOp2))),centerFormat(20, Boolean.toString(Boolean.logicalOr(opB.bOp1, opB.bOp2))));
        System.out.println("+=====================================================================================+");	
        
	}
	String centerFormat(int spaceLR, String d) {
		return String.format("%-" + spaceLR+ "s", String.format("%" + ((d.length()+spaceLR) / 2) + "s", d));
	}
	
	void clrsc() {
		System.out.print("Press enter to proceed...");
		scan.nextLine();
		for (int i = 0; i < 1050; i++) {
			System.out.println("");
		}
	}

}