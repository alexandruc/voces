package parserRDF;
import java.io.InputStream;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import org.w3c.dom.*;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.ResIterator;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.util.FileManager;


public class ParserRDF {
	public void ParseRDFFile(String inputFileName, int fileId)
	{
		 // create an empty model
        Model model = ModelFactory.createDefaultModel();

        InputStream in = FileManager.get().open( inputFileName );
        if (in == null) {
            throw new IllegalArgumentException( "File: " + inputFileName + " not found");
        }
        
        // read the RDF/XML file
        model.read(in, "");
        String xmlFile = "file"+ fileId +".xml";
		String root = "Vocabulary";
		
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder;
		try {
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
			Document document = documentBuilder.newDocument();
			Element rootElement = document.createElement(root);
			boolean bAddedNamespace = false;
			document.appendChild(rootElement);
			
	         ResIterator iter = model.listSubjects();
	         String infoNS = null;

	        // print out the predicate, subject and object of each statement
	        while (iter.hasNext()) {
	        	
	            Resource  subject   = iter.nextResource();     // get the subject
	            String resourceInfo = subject.toString();
	            
	            if(bAddedNamespace != true )
	            {
	            	String namespace = "Namespace";
	            	int SeparPos  = resourceInfo.lastIndexOf("/");
	            	if(SeparPos != -1 )
	            	{
	            		infoNS = resourceInfo.substring(0, SeparPos);
	            	}
	            	else
	            	{
	            		infoNS ="";
	            	}
	            	
	    			Element emNS = document.createElement(namespace);
	    			emNS.appendChild(document.createTextNode(infoNS));
	    			rootElement.appendChild(emNS);
	    			bAddedNamespace = true;
	            }
	            
	            int startTerminal = 0;
            	int substrPos = resourceInfo.indexOf(infoNS);
            	if(substrPos != -1)
            	{
            		startTerminal = substrPos+infoNS.length()+1;
            		if(startTerminal < resourceInfo.length())
            		{
			            String element = "Terminal";
						String data = resourceInfo.substring(startTerminal, resourceInfo.length());
						Element em = document.createElement(element);
						em.appendChild(document.createTextNode(data));
						rootElement.appendChild(em);
            		}
            	}
	          
	        } 
	        
	        DOMSource source = new DOMSource(document);
			StreamResult result =  new StreamResult(xmlFile);
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer;
			try {
				transformer = transformerFactory.newTransformer();
				
				try {
					transformer.transform(source, result);
				} catch (TransformerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (TransformerConfigurationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (ParserConfigurationException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}		
	}
}
