package sample.csv.process.processor;

import java.util.Date;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import sample.csv.process.model.Website;
import sample.csv.process.model.WebsiteResource;

/**
 * ItemProcessor Class。
 */
@Component("websiteItemProcessor")

public class WebsiteItemProcessor implements ItemProcessor<Website, WebsiteResource> {

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
    public WebsiteResource process(Website website) throws Exception {
    	Date date = new Date();
        WebsiteResource websiteResource = new WebsiteResource();
        websiteResource.setUrl(website.getUrl());
        websiteResource.setName(website.getName());
        websiteResource.setFirst_inserted_when(date);
        websiteResource.setLast_updated_when(date);
        websiteResource.setDeleted(false);
        websiteResource.setValid(false);
        // TODO: other enrichment, like the content of the website
        
        return websiteResource;
    }
}