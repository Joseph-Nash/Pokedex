
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
		
		
		
		
		
		
		pokeO.printName();
		pokeO.printNum();
		//pokeO.printType1();
		//pokeO.printType2();
		//pokeO.printHeight();
		//pokeO.printWeight();
		//pokeO.printCstatus();
	}
	
}
