
public class Pokemon {



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
}
/*	
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
}

	
	private int pokeNum(){
		int pkNum = 1;
		return pkNum;
	}		
	
	private String primType(){
		String Type1 = "Normal";
		return Type1;
	}
	
	private String secType(){
		String Type2 = "null";
		return Type2;
	}
	
	private String description(){
		String desc = "This pokemon is useless";
		return desc;
	}
	
	private boolean caughtStatus(){
		boolean caughtstat = false;
		return caughtstat;
	}
	
	private double pokeHeight(){
		double pkH = 1.00;
		return pkH;
	}
	
	private double pokeWeight(){
		double pkW = 50;
		return pkW;
	}
		
}
*/