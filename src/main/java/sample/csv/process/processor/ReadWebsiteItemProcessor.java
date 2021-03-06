package sample.csv.process.processor;

import java.util.Date;

import org.springframework.batch.item.ItemProcessor;

import sample.csv.process.model.EnrichedWebsiteResource;
import sample.csv.process.model.WebsiteResource;

import com.basistech.readability.PageReadException;
import com.basistech.readability.Readability;

public class ReadWebsiteItemProcessor implements ItemProcessor<WebsiteResource, EnrichedWebsiteResource> {
	private Readability readability;
   
	/**
     * enrich the website
     * 
     * @param website
     *            before enrichment
     * @return after enrichment
     * @exception Exception
     *                
     */
    @Override
    public EnrichedWebsiteResource process(WebsiteResource websiteResource) throws Exception {
    	Date date = new Date();
    	EnrichedWebsiteResource enrichedWebsiteResource = new EnrichedWebsiteResource(websiteResource);
    	enrichedWebsiteResource.setLast_updated_when(date);
    	String url = enrichedWebsiteResource.getUrl();
    	try {
    		readability.processDocument(url);
        	String title = readability.getTitle();
        	String briefContent = readability.getArticleText();
        	enrichedWebsiteResource.setTitle(title);
        	enrichedWebsiteResource.setContent(briefContent);
    	} catch (PageReadException e) {
    		enrichedWebsiteResource.setValid(false);
			e.printStackTrace();
		}
    	
        return enrichedWebsiteResource;
    }
    
    public void setReadability(Readability readability) {
		this.readability = readability;
	}
}
