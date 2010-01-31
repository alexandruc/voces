package parserRDF;
import java.io.InputStream;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.ResIterator;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.util.FileManager;


public class ParserRDF {
	public static String ParseRDFFile(String inputFileName, int fileId)
	{
		String rdfInformation = null;
		 // create an empty model
        Model model = ModelFactory.createDefaultModel();
       
        InputStream in = FileManager.get().open( inputFileName );
        if (in == null) {
            throw new IllegalArgumentException( "File: " + inputFileName + " not found");
        }
        
        String valueNS = null;
        
        if((valueNS == null)&&( inputFileName.contains("foaf") != false ))
        {
        	valueNS = "foaf";
        }
        if((valueNS == null)&&( inputFileName.contains("doap") != false ))
        {
        	valueNS = "doap";
        }
        if((valueNS == null)&&( inputFileName.contains("dublincore") != false ))
    	{
        	valueNS = "dc";
    	}	
        
        // read the RDF/XML file
        model.read(in, "");
        String vocTagBegin = "<Vocabulary>";
        String vocTagEnd = "</Vocabulary>";
        String nsTagBegin = "<Namespace>";
        String nsTagEnd = "</Namespace>";
        String elTagBegin = "<Element>";
        String elTagEnd = "</Element>";
        rdfInformation = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>"+vocTagBegin;

        	
	    ResIterator iter = model.listSubjects();
	    String infoNS = null;
	    boolean bAddedNamespace = false;

	    // print out the predicate, subject and object of each statement
	     while (iter.hasNext()) 
	     {
	           Resource  subject   = iter.nextResource();     // get the subject
	           String resourceInfo = subject.toString();
	            
	            if(bAddedNamespace != true )
	            {
	            	int SeparPos  = resourceInfo.lastIndexOf("/");
	            	if(SeparPos != -1 )
	            	{
	            		infoNS = resourceInfo.substring(0, SeparPos);
	            	}
	            	else
	            	{
	            		infoNS ="";
	            	}
	            	
	            	if(valueNS == null)
	            	{
	            		valueNS = infoNS;
	            	}

	            	rdfInformation += nsTagBegin;
	            	rdfInformation += valueNS;
	    			rdfInformation += nsTagEnd;
	    			bAddedNamespace = true;
	            }
	            
	            int startTerminal = 0;
            	int substrPos = resourceInfo.indexOf(infoNS);
            	if(substrPos != -1)
            	{
            		int SeparPos2  = resourceInfo.lastIndexOf("#");
	            	if(SeparPos2 != -1 )
	            	{
	            		startTerminal = SeparPos2+1;
	            	}
	            	else
	            	{
	            		startTerminal = substrPos+infoNS.length()+1;
	            	}
            		if(startTerminal < resourceInfo.length())
            		{
            			String data = resourceInfo.substring(startTerminal, resourceInfo.length());
			            rdfInformation += elTagBegin;
			            rdfInformation += data;
			            rdfInformation += elTagEnd;
            		}
            	}
	          
	        } 
	       
	     rdfInformation += vocTagEnd;
	     return rdfInformation;		
	}
}
