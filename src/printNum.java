
import java.io.*;
import java.lang.*;
import java.util.*;

public class printNum {

	private Formatter pokeList;
	
	public void openFile(){
		try{
			pokeList = new Formatter("PokemonList.txt");
		}
		catch(Exception e){
			System.out.println("the file was not created");
		}
		
	}
	
	public void createNum(){
		for(int i=1; i<151; i++)
			pokeList.format("%s\n", i);
	}
	public void closeFile(){
		pokeList.close();
	}
	
	//public void pokeNum(){
		//for(int i=1; i<150; i++)
			//System.out.println(i);
	//}
	
}
