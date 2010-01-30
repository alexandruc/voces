import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import parserRDF.*;

public class Main 
{
	public static void main(String[] args) {
		try 
		{ 
			ParserRDF myParser= new ParserRDF();
			BufferedReader in = new BufferedReader(new FileReader("config.txt")); 
			String inputFile; 
			int counter = 0;
			while ((inputFile = in.readLine()) != null) 
			{ 
				++counter;
				myParser.ParseRDFFile(inputFile, counter); 
			} 
			in.close(); 
		} 
		catch (IOException e) 
		{} 

	}

}
