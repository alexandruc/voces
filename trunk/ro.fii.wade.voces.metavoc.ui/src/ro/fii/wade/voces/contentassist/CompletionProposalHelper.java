package ro.fii.wade.voces.contentassist;

import java.util.ArrayList;
import java.util.List;

public class CompletionProposalHelper {
	
	public static String currentVoc = "foaf";
	
	private String[] foafElements = { "knows",  "firstName",  "icqChatID",  "birthday",  "givenname",  "accountServiceHomepage",  "isPrimaryTopicOf",  "depicts",  "phone",  "openid",  "givenName",  "Project",  "account",  "skypeID",  "Image",  "page",  "OnlineEcommerceAccount",  "lastName",  "membershipClass",  "yahooChatID",  "homepage",  "topic_interest",  "dnaChecksum",  "gender",  "mbox_sha1sum",  "logo",  "img",  "fundedBy",  "interest",  "familyName",  "status",  "msnChatID",  "sha1",  "PersonalProfileDocument",  "workInfoHomepage",  "currentProject",  "mbox",  "schoolHomepage",  "Organization",  "holdsAccount",  "maker",  "pastProject",  "OnlineChatAccount",  "jabberID",  "accountName",  "name",  "OnlineAccount",  "tipjar",  "age",  "primaryTopic",  "myersBriggs",  "Agent",  "OnlineGamingAccount",  "depiction",  "workplaceHomepage",  "weblog",  "title",  "thumbnail",  "Person",  "made",  "LabelProperty",  "nick",  "based_near",  "surname",  "plan",  "aimChatID",  "Group",  "geekcode",  "Document",  "topic",  "family_name",  "member",  "theme",  "publications" };
	private String[] doapElements = { "implements","CVSRepository","anon-root","platform","browse","mailing-list","programming-language","category","homepage","description","helper","tester","audience","GitRepository","shortdesc","BKRepository","screenshots","SVNRepository","translator","module","ArchRepository","DarcsRepository","documenter","wiki","repository","Version","Specification","name","location","language","service-endpoint","created","developer","HgRepository","vendor","download-mirror","old-homepage","revision","Repository","Project","download-page","license","bug-database","maintainer","blog","BazaarBranch","file-release","os","release" };
	private String[] dcmiElements = { "RightsStatement","format","medium","Jurisdiction","MediaTypeOrExtent","subject","alternative","UDC","tableOfContents","date","BibliographicResource","license","source","MESH","isReferencedBy","hasFormat","LocationPeriodOrJurisdiction","replaces","mediator","extent","rightsHolder","Agent","LicenseDocument","hasVersion","accrualPolicy","created","references","creator","Policy","accessRights","AgentClass","title","relation","Frequency","LCSH","dateCopyrighted","abstract","contributor","Point","publisher","RFC4646","ISO639-3","SizeOrDuration","conformsTo","accrualPeriodicity","Standard","IMT","isReplacedBy","identifier","hasPart","accrualMethod","type","ISO3166","dateAccepted","coverage","MediaType","W3CDTF","ISO639-2","educationLevel","audience","isRequiredBy","available","isPartOf","isVersionOf","PhysicalResource","URI","DDC","rights","MethodOfInstruction","modified","instructionalMethod","ProvenanceStatement","isFormatOf","spatial","RFC1766","MethodOfAccrual","temporal","issued","DCMIType","RFC3066","TGN","bibliographicCitation","Period","Location","LCC","provenance","description","language","PeriodOfTime","dateSubmitted","valid","requires","NLM","LinguisticSystem","Box","PhysicalMedium","FileFormat" };
	
	public CompletionProposalHelper() {
		// TODO Auto-generated constructor stub
	}
	
	public String[] getVocabularyElements()
	{
		if(currentVoc.compareTo("foaf") == 0)
		{
			return foafElements;
		}else if(currentVoc.compareTo("doap") == 0)
		{
			return doapElements;
		}else if(currentVoc.compareTo("dcmi") == 0)
		{
			return dcmiElements;
		}
		
		return foafElements;
	}
	
}
