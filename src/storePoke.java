
import java.io.*;
import java.util.*;

public class storePoke {

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
1		List<String> number = new ArrayList<String>();
		List<String> name = new ArrayList<String>();
		List<String> type1 = new ArrayList<String>();
		List<String> type2 = new ArrayList<String>();
		
		while(x.hasNext()){
			String a = x.next();
			String b = x.next();
			String c = x.next();
			String d = x.next();
			number.add(a);
			name.add(b);
			type1.add(c);
			type2.add(d);
			
			System.out.printf("%s\n", b);

					
					
			//System.out.printf("%s\t%s\t%s\t%s\n", a,b,c,d);
		}
	}
	
	public void closeFile(){
		x.close();
	}
	
}
