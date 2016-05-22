
import java.io.*;
import java.util.*;

public class createArray(String st) throws NumberFormatException, IOException{

	private Scanner x;
	
	public void openFile(){
		try{
			x = new Scanner(new File("PokemonList.txt"));
		}
		catch(Exception e){
			System.out.println("Could not find said file");
		}
	}
	
	public void readinPoke(){
		
		List<String[]> pokeList = new ArrayList<>();
		while(x.hasNextLine()){
			String line = x.nextLine()
			
			
			System.out.println(arrayPokemon);

					
					
					
			//System.out.printf("%s\t%s\t%s\t%s\n", a,b,c,d);
		}
	}
	
	public void closeFile(){
		x.close();
	}
	
}
