## Package split ##

### GUI plugin development ###
  1. eclipse IDE menu and toolbar entry : _Meta-data Editor Options_
  1. when clicking this button one should be offered a window with a title bar (the WS url goes here) and a list box (this should contain the available vocabularies, retrieved from the WS)
  1. upon choosing a vocabulary and clicking _OK_, the content assist, syntax highlighting and syntax verifier should be changed to accommodate the new vocabulary

### Grammar development ###
  1. define generic xtext syntax for vocabulary. Example (foaf with minimal elements - still a draft):

```
grammar ro.fii.wade.voces.Foaf with org.eclipse.xtext.common.Terminals

generate foaf "http://www.fii.ro/wade/voces/Foaf"


XMLModel :
        (content+= XMLValidElement)*
        ; 

XMLValidElement returns XMLValidElement :
       (startelement=XMLStartElement) 
       ( (children += XMLValidElement)* | name=ID | content=INT )
       (endelement=XMLEndElement)
        ;

XMLStartElement returns XMLStartElement : 
        "<" XMLElementText ">" ;
        
XMLEndElement returns XMLEndElement  : 
        "</" XMLElementText ">" ;
        
XMLElementText returns XMLElementText : 
        "foaf" ":" NSElement ;
        
NSElement returns NSElement :
        "name" | "age" | "mbox" | "person" | "knows" ;
        
```

  1. grammar should be generic: `NSElement` and namespace should be created as generic types (ID) and should be changed dynamically (checked/changed at runtime)
  1. generate editor from grammar
  1. extend content assist to accommodate changing vocabularies
  1. extend syntactic and semantic checking to accommodate changing vocabularies
  1. integrate an xml validation component (open source) with the syntactic checker


### Web Service Development ###
  1. investigate how to create and use a REST web service
  1. create a few web services (possibly different languages - C#, Java, Ruby...)


  1. web service activity: should discover meta-data vocabularies (for starters take some predefined urls) - e.g. [FOAF](http://xmlns.com/foaf/spec/index.rdf), [DOAP](http://usefulinc.com/ns/doap#), [DCMI](http://dublincore.org/2008/01/14/dcterms.rdf) - and on the discovered rdf-format vocabularies, it should apply a transformation (XSLT recommended in the Web-oriented domain) which should extract namespace name and namespace members


### Documentation ###
  1. [eclipse plugins](http://help.eclipse.org/help32/index.jsp?topic=/org.eclipse.platform.doc.isv/guide/int.htm)
  1. [xtext](http://www.eclipse.org/Xtext/documentation/0_7_2/xtext.html)
  1. [eclipse content assist](http://help.eclipse.org/help32/index.jsp?topic=/org.eclipse.platform.doc.isv/guide/editors_contentassist.htm)
  1. [eclipse editors](http://help.eclipse.org/help32/index.jsp?topic=/org.eclipse.platform.doc.isv/guide/editors.htm)