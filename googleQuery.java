package edu.nccu.misds.stu105306064.hw10;
import java.io.IOException;
import java.util.HashMap;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;

public class googleQuery 

{
	private String searchKeyword;
	private String url;
	
	
	public googleQuery(String keyword) 
	{
		searchKeyword = keyword;
		this.url = "http://www.google.com/search?q="+ keyword +"&oe=utf8&num=100";
	}	
	
	
	public HashMap<String, String> query()throws IOException
	{
		HashMap<String, String> retVal = new HashMap<String, String>();
		Document doc = Jsoup.connect(this.url).get();
		
		Elements div_rcs = doc.select("div.rc");
		
	    for(Element div_rc : div_rcs)
	    {
			Element h3 = div_rc.select("h3.r").get(0);
			String title = h3.text(); 
			Element cite = div_rc.select("cite._Rm").get(0);
			String citeUrl = cite.text(); 
			
			System.out.println(title + "," + citeUrl);
			retVal.put(title, citeUrl);
			
	     }				
			return retVal;
		 	
	}		

}
