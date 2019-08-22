package module_11;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class Question_1 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		String filename=scan.nextLine();
		
		
		FileReader fr;
		try {
			fr = new FileReader(filename);
			int i;    
			while((i=fr.read())!=-1)    
			System.out.print((char)i);    
			fr.close();    
		    
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    
		
	}

}