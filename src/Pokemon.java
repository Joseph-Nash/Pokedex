
public class Pokemon {


//pokemon name
	private String pokeName;
	public void setpkName(String name){
		pokeName=name;
	}
	public String getpkName(){
		return pokeName;
	}
	public void printName(){
		System.out.printf("The Pokemon you have chosen is: %s\n", getpkName());
	}
//pokemon number	
	private int pokeNum;
	public void setpkNum(int number){
		pokeNum=number;
	}
	public int getpkNum(){
		return pokeNum;
	}
	public void printNum(){
		System.out.printf("Your Pokemon's number in the Dex is: %d\n", getpkNum());
	}
//primary type
	private String Type1;
	public void setType1(String primType){//primtype is public so it can be taken in, type1 is private so no one can change it
		Type1=primType;
	}
	public String getType1(){
		return Type1;
	}
	public void printType1(){
		System.out.printf("Your Pokemon's primary type is: %s\n", getType1());
	}

	private String Type2;
	public void setType2(String secType){//primtype is public so it can be taken in, type1 is private so no one can change it
		Type2=secType;
	}
	public String getType2(){
		return Type2;
	}
	public void printType2(){
		System.out.printf("Your Pokemon's secondary type is: %s\n", getType2());
	}

	private String Desc;
	public void setBio(String bio){
		Desc=bio;
	}
	public String getBio(){
		return Desc;
	}
	public void printDesc(){
		System.out.printf("Pokemon Bio: %s\n", getBio());
	}
	
	private boolean caughtStatus;
	public void setStatus(boolean isitCaught){
		caughtStatus=isitCaught;
	}
	public boolean getStatus(){
		return caughtStatus;
	}
	public void printCstatus(){
		if(caughtStatus = true){
			System.out.println("You have caught this Pokemon! well done");
		}
		else
			System.out.println("You haven't caught this Pokemon yet.");
	}

	private double pokeHeight;
	public void setHeight(double pkHeight){
		pokeHeight = pkHeight;
	}
	public double getHeight(){
		return pokeHeight;
	}
	public void printHeight(){
		System.out.printf("Your Pokemon is %f metres tall\n", getHeight());
	}
	
	private double pokeWeight;
	public void setWeight(double pkWeight){
		pokeWeight = pkWeight;
	}
	public double getWeight(){
		return pokeWeight;
	}
	public void printWeight(){
		System.out.printf("Your Pokemon weights %f in kg\n", getWeight());
	}
}
