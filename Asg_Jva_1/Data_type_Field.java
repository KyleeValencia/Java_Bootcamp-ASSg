package Asg_Jva_1;
public class Data_type_Field {
	String Name;
	int numberNorm;
	Data_type_Field(String name, int number) {
		// TODO Auto-generated constructor stub
		this.numberNorm = number;
		this.Name = name;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getNumberNorm() {
		return numberNorm;
	}
	public void setNumberNorm(int numberNorm) {
		this.numberNorm = numberNorm;
	}
	

}
