
import java.util.Scanner;

public class Pokedex {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//used to print 0 150 and create a file
		
		//printNum list = new printNum(); 
		
		//list.openFile();
		//list.createNum();
		//list.closeFile();
		
		
		//prints out the pokemon from file list
		//storePoke store = new storePoke();
		//store.openFile();
		//store.readinPoke();
		//store.closeFile();
		
		
		Pokemon pokeO = new Pokemon();
		System.out.println("Enter your pokemon name here: ");
		String tempName = input.nextLine();
		pokeO.setpkName(tempName);
		
		System.out.println("Enter your pokemon's number here: ");
		int tempNum = input.nextInt();
		pokeO.setpkNum(tempNum);
		
		System.out.println("Enter your pokemon's primary type here: ");
		String tempType1 = input.nextLine();
		input.nextLine();
		pokeO.setType1(tempType1);
		
		System.out.println("Enter your pokemon's secondary type here: ");
		String tempType2 = input.nextLine();
		pokeO.setType2(tempType2);
		
		
		System.out.println("Have you caught this pokemon? true/false");
		boolean tempCaught = input.nextBoolean();
		pokeO.setStatus(tempCaught);
		
		System.out.println("Enter your Pokemon's height here: ");
		double tempHeight = input.nextDouble();
		input.nextLine();
		pokeO.setHeight(tempHeight);
		
		System.out.println("Enter your Pokemon's weight here: ");
		double tempWeight = input.nextDouble();
		input.nextLine();
		pokeO.setHeight(tempWeight);
		
		System.out.println("Enter your Pokemon's description here: ");
		String tempBio = input.nextLine();
		pokeO.setBio(tempBio);
		
		
		pokeO.printName();
		pokeO.printNum();
		pokeO.printType1();
		pokeO.printType2();
		pokeO.printHeight();
		pokeO.printWeight();
		pokeO.printCstatus();
		pokeO.printDesc();
	}
	
}
