/*
* generated by Xtext
*/
package ro.fii.wade.voces.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MetavocAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("ro/fii/wade/voces/parser/antlr/internal/InternalMetavoc.tokens");
	}
}
